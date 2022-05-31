import java.util.*;

public class Main {
    public static void main(String[] args) {

        playList current=new playList();
        boolean flag=false;
        while(true)
        {
            System.out.println("\n1.CREATE A PLAYLIST\n2.ADD FILE TO CURRENT PLAYLIST\n3.DISPLAY CURRENT PLAYLIST\n4.EXIT");
            System.out.println("\nENTER YOUR CHOICE :");

            Scanner choice= new Scanner(System.in);
            int a= choice.nextInt();

            if(a==4) break;

            else if(a==1)
            {
                if(!flag)
                {
                    current=new playList();
                    //System.out.println("ENTER ELAPSED TIME IN THIS FORMAT: HOURS:MINUTES");
                    //Scanner str= new Scanner(System.in);
                    //String s= str.nextLine();
                    //current.setStarting_time(s);
                    flag=true;
                    System.out.println("NEW PLAYLIST CREATED");
                }
                else
                {
                    System.out.println("ENTER ELAPSED TIME IN THIS FORMAT: MINUTES:SECONDS");
                    Scanner str= new Scanner(System.in);
                    String s= str.nextLine();
                    current.calculate_duration();
                    boolean x=current.check_list(s);
                    System.out.println("\nCURRENT PLAYLIST DURATION "+current.duration+" sec.\n");
                    if(x)
                    {
                        current=new playList();
                        //current.setStarting_time(s);
                        System.out.println("NEW PLAYLIST CREATED");
                    }
                    else
                    {
                        System.out.println("NEW PLAYLIST CAN'T BE CREATED");
                    }

                }

            }
            else if(a==2)
            {
                if(!flag)
                {
                    System.out.println("NO PLAYLIST EXISTS");
                    continue;
                }

                while(true)
                {
                    System.out.println("\nPRESS 'E' TO EXIT, 'C' TO CONTINUE\n");
                    Scanner str= new Scanner(System.in);
                    String s= str.nextLine();
                    if(s.equals("E"))
                    {
                        break;
                    }
                    else if(s.equals("C"))
                    {
                        System.out.println("Enter the file: ");
                        Scanner str_name= new Scanner(System.in);
                        String s1= str_name.nextLine();
                        //System.out.println("Enter type of the file: mp3/mp4/vlc/flv ");
                        //Scanner str_type= new Scanner(System.in);
                        //String s2= str_type.nextLine();
                        StringTokenizer st=new StringTokenizer(s1,".");
                        List<String> name_type=new ArrayList<>();
                        while(st.hasMoreTokens())
                        {
                            name_type.add(st.nextToken());
                        }
                        System.out.println("Enter duration of the file in this format min:sec ");
                        Scanner str_duration= new Scanner(System.in);
                        String s3= str_duration.nextLine();
                        System.out.println("Enter size of the file: ");
                        Scanner f_size= new Scanner(System.in);
                        int size= f_size.nextInt();

                        AudioPlayer audio =new AudioPlayer(name_type.get(0),name_type.get(1),size,s3);
                        current.items.add(audio);
                        current.calculate_duration();
                        name_type.clear();
                    }
                }
            }
            else if(a==3)
            {
                if(!flag)
                {
                    System.out.println("NO PLAYLIST EXISTS");
                    continue;
                }
                System.out.println("\nCURRENT PLAYLIST:");
               // System.out.println("\nSTARTING TIME "+current.getStarting_time()+"\n");
                for(int i=0;i<current.items.size();i++ )
                {
                    AudioPlayer music=current.items.get(i);
                    current.items.get(i).play(music.getName(),music.getType(),music.getSize(),music.getDuration());
                }
                //System.out.println("\nFINISHING TIME "+current.getFinishing_time()+"\n");
                System.out.println("\nTOTAL DURATION "+current.duration+" sec.\n");

                /*StringTokenizer str= new StringTokenizer(current.getFinishing_time(),":");
                List<String> s=new ArrayList<>();
                while(str.hasMoreTokens())
                {
                    s.add(str.nextToken());
                }
                int f_hr=Integer.parseInt(s.get(0));
                int f_min=Integer.parseInt(s.get(1));
                s.clear();
                System.out.println("\nFINISHING TIME "+f_hr%24+":"+f_min+"\n");*/
            }

        }

    }
}
