import java.util.*;

public class playList {
    String starting_time;
    String finishing_time;
    int duration;
    List<AudioPlayer> items;

    public playList()
    {
        items=new ArrayList<>();
    }

    public String getFinishing_time() {
        return finishing_time;
    }

    public String getStarting_time() {
        return starting_time;
    }

    public void setStarting_time(String starting_time) {
        this.starting_time = starting_time;
    }

    public void setItems(List<AudioPlayer> items) {
        this.items = items;
    }

   /* public void calculate_duration()
    {
        int count=0;
        for(int i=0;i<items.size();i++)
        {
            StringTokenizer str= new StringTokenizer(items.get(i).getDuration(),":");
            List<String> s=new ArrayList<>();
            while(str.hasMoreTokens())
            {
                s.add(str.nextToken());
            }
            int min=Integer.parseInt(s.get(0));
            min=min*60;
            int sec=Integer.parseInt(s.get(1));
            sec=sec+min;
            count=count+sec;
            s.clear();
        }
        count=count/60;
        StringTokenizer str= new StringTokenizer(starting_time,":");
        List<String> s=new ArrayList<>();
        while(str.hasMoreTokens())
        {
            s.add(str.nextToken());
        }
        int hr=Integer.parseInt(s.get(0));
        hr=hr*60;
        int min=Integer.parseInt(s.get(1));
        min=min+hr;
        s.clear();
        min=min+count;
        int f_hr=min/60;
        int f_min=min%60;
        f_hr=f_hr%24;
        finishing_time=Integer.toString(f_hr)+":"+Integer.toString(f_min);

    }*/
   public void calculate_duration()
   {
       int count=0;
       for(int i=0;i<items.size();i++)
       {
           StringTokenizer str= new StringTokenizer(items.get(i).getDuration(),":");
           List<String> s=new ArrayList<>();
           while(str.hasMoreTokens())
           {
               s.add(str.nextToken());
           }
           int min=Integer.parseInt(s.get(0));
           min=min*60;
           int sec=Integer.parseInt(s.get(1));
           sec=sec+min;
           count=count+sec;
           s.clear();
       }
       duration=count;

       /*count=count/60;
       StringTokenizer str= new StringTokenizer(starting_time,":");
       List<String> s=new ArrayList<>();
       while(str.hasMoreTokens())
       {
           s.add(str.nextToken());
       }
       int hr=Integer.parseInt(s.get(0));
       hr=hr*60;
       int min=Integer.parseInt(s.get(1));
       min=min+hr;
       s.clear();
       min=min+count;
       int f_hr=min/60;
       int f_min=min%60;
       f_hr=f_hr%24;
       finishing_time=Integer.toString(f_hr)+":"+Integer.toString(f_min);*/

   }

    /*public boolean check_list(String next)
    {
        StringTokenizer str= new StringTokenizer(finishing_time,":");
        List<String> s=new ArrayList<>();
        while(str.hasMoreTokens())
        {
            s.add(str.nextToken());
        }
        int f_hr=Integer.parseInt(s.get(0));
        int f_min=Integer.parseInt(s.get(1));
        s.clear();

        StringTokenizer str2= new StringTokenizer(next,":");
        List<String> s2=new ArrayList<>();
        while(str2.hasMoreTokens())
        {
            s2.add(str2.nextToken());
        }
        int n_hr=Integer.parseInt(s2.get(0));
        int n_min=Integer.parseInt(s2.get(1));
        s2.clear();

        if(f_hr>n_hr) return false;

        else if((f_hr==n_hr) && (f_min>n_min)) return false;

        else return true;
    }*/
    public boolean check_list(String next)
    {
        /*StringTokenizer str= new StringTokenizer(finishing_time,":");
        List<String> s=new ArrayList<>();
        while(str.hasMoreTokens())
        {
            s.add(str.nextToken());
        }
        int f_hr=Integer.parseInt(s.get(0));
        int f_min=Integer.parseInt(s.get(1));
        s.clear();*/

        StringTokenizer str2= new StringTokenizer(next,":");
        List<String> s2=new ArrayList<>();
        while(str2.hasMoreTokens())
        {
            s2.add(str2.nextToken());
        }
        int n_min=Integer.parseInt(s2.get(0));
        int n_sec=Integer.parseInt(s2.get(1));
        n_min=n_min*60;
        n_sec=n_sec+n_min;
        s2.clear();

        System.out.println("\nELAPSED TIME: "+n_sec+" sec.");
        /*if(f_hr>n_hr) return false;

        else if((f_hr==n_hr) && (f_min>n_min)) return false;

        else return true;*/
        if(n_sec<duration) return false;
        else return true;
    }
}
