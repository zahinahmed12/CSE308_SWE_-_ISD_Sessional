import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Files implements FileSystem {
    private String name;
    private String type;
    private String directory;

    public FileSystem parent;
    public Files(String s)
    {
        name=s;
        type="File";
    }
    public List<FileSystem> get_item_list()
    {
        List<FileSystem> nothing=new ArrayList<>();
        return nothing;
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
    public void print_hierarchy_list()
    {
        System.out.println("File "+name);
    }
    public void print_details()
    {
        System.out.println("\nDetails of "+name);
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Directory: "+directory);
        System.out.println("Component_Count: 0");
        System.out.println();
    }
    public int get_component_count()
    {
        return 0;
    }
    public int set_component_count(int a)
    {
        return a;
    }

    public void addItem(FileSystem f)
    {

    }
    public void change_dir(FileSystem f)
    {

    }
    public void deleteItem()
    {
        //=null;
        /*StringTokenizer str= new StringTokenizer(getDirectory(),"\\");
        List<String> tokens=new ArrayList<>();
        while (str.hasMoreTokens())
        {
            tokens.add(str.nextToken());
        }

        int i=tokens.size()-2;*/
        FileSystem f=getParent();
        for(int i=0;i<f.get_item_list().size();i++)
        {
            if(f.get_item_list().get(i).getName().equals(getName()))
            {
                f.get_item_list().remove(i);
                break;
            }
        }

    }

    @Override
    public void setParent(FileSystem f) {
        this.parent = f;
    }

    @Override
    public FileSystem getParent() {
        //return null;
        return parent;
    }

    @Override
    public List<FileSystem> clear_main_list(List<FileSystem> f) {
        return null;
    }
}
