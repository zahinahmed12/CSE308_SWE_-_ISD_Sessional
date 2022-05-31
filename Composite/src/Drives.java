import java.util.* ;

public class Drives implements FileSystem{
    private String name;
    private String type;
    private String directory;
    private int component_count;
    List<FileSystem> items=new ArrayList<FileSystem>();

    public FileSystem parent;
    public Drives(String s)
    {
        name=s;
        type="Drive";
        directory=name+":";
    }
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public String getDirectory()
    {
        return directory;
    }
    public void setDirectory(String a)
    {
        directory=a;
    }
    public List<FileSystem> get_item_list()
    {
        return items;
    }
    public void print_hierarchy_list()
    {
        // System.out.println(name);
        System.out.println("***START "+type+" "+name);
        //System.out.println();
        //System.out.print("   ");
        for(int i=0;i<items.size();i++)
        {
            //System.out.print("   ");
            FileSystem a=items.get(i);
            String s=a.getType();
            if(s.equals("Folder"))
            {
                //System.out.print("   ");
                a.print_hierarchy_list();
                //System.out.println();
            }
            else if(s.equals("File"))
            {
                //System.out.println("   "+a.getName());
                //System.out.print("   ");
                System.out.println("      File "+a.getName());
            }
        }
        //System.out.println();
        System.out.println("END "+type+" "+name+"***");
    }
    public void print_details()
    {
        //set_component_count();
        int count=0;
        int res=set_component_count(count);
        component_count=res;
        System.out.println("\nDetails of "+name);
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Directory: "+directory);
        System.out.println("Component_Count: "+get_component_count());
        System.out.println();
    }
    public int get_component_count()
    {
        return component_count;
    }
    public int set_component_count(int count)
    {
        //component_count++;
        for(int i=0;i<items.size();i++)
        {
            //System.out.print("   ");
            FileSystem a=items.get(i);
            String s=a.getType();

            if(s.equals("File"))
            {
            count++;
            //return;
            }
            /*if(a.getType().equals("Folder") && a.get_item_list().size()==0)
            {
                return;
            }
            set_component_count();*/
            else
            {
                int temp=0;
                count=count+a.set_component_count(temp);
            }
        }
        return count;
    }
    public void addItem(FileSystem f)
    {
        f.setParent(this);
        f.setDirectory(getDirectory()+"\\"+f.getName());
        //change_dir(f);
        items.add(f);
        //component_count++;
       /* if(f.getType().equals("Folder"))
        {
            for(int i=0;i<f.get_item_list().size();i++)
            {
                component_count++;
            }
        }
        else component_count++;*/
    }
    /*public void change_dir(FileSystem f)
    {
        for(int i=0;i<f.get_item_list().size();i++)
        {
            FileSystem a=f.get_item_list().get(i);
            String s=a.getType();
            if(s=="Folder")
            {
                // a.print_hierarchy_list();
                change_dir(a);
                a.setDirectory(getDirectory()+"\\"+a.getName());
            }
            else if(s=="File")
            {
                a.setDirectory(getDirectory()+"\\"+a.getName());
            }
        }

    }*/
    public void deleteItem()
    {
        items.clear();

    }

    @Override
    public FileSystem getParent() {
        return parent;
    }

    @Override
    public void setParent(FileSystem parent) {
        this.parent = parent;
    }

    @Override
    public List<FileSystem> clear_main_list(List<FileSystem> f) {
        for(int i=0;i<items.size();i++)
        {
            FileSystem a=items.get(i);
            String s=a.getType();
            if(s.equals("File"))
            {
                f.add(a);
            }
            else
            {
                f.add(a);
                List<FileSystem> temp=new ArrayList<>();
                List<FileSystem> ret=new ArrayList<>();
                a.clear_main_list(temp);
                for(int kk=0;kk<temp.size();kk++)
                {
                    ret.add(temp.get(kk));
                }
                //ret=a.clear_main_list(temp);
                List<FileSystem> newL=new ArrayList<>();
                newL.addAll(f);
                newL.addAll(ret);
                //f=newL;
                f.clear();
                for(int kk=0;kk<newL.size();kk++)
                {
                    f.add(newL.get(kk));
                }
            }
        }
        return f;
    }
}
