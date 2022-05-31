import java.util.*;
public class Main {

    public static void main(String[] args) {

        Server server=new Server();

        new premium_user(server);
        new regular_user(server);

        while(true)
        {
            if(server.getCurr_state().equals("Operational"))
            {
                System.out.println("\nCURRENT STATE IS OPERATIONAL");
                System.out.println("CHOOSE ONE:\n1.CHANGE STATE TO PARTIALLY DOWN\n2.CHANGE STATE TO FULLY DOWN");
                Scanner choice=new Scanner(System.in);
                int a=choice.nextInt();
                if(a==1)
                {
                    server.state_change("Partially down");
                }
                else if(a==2)
                {
                    server.state_change("Fully down");
                }
            }
            else if(server.getCurr_state().equals("Partially down"))
            {
                System.out.println("\nCURRENT STATE IS PARTIALLY DOWN");
                System.out.println("CHOOSE ONE:\n1.CHANGE STATE TO OPERATIONAL\n2.CHANGE STATE TO FULLY DOWN");
                Scanner choice=new Scanner(System.in);
                int a=choice.nextInt();
                if(a==1)
                {
                    server.state_change("Operational");
                }
                else if(a==2)
                {
                    server.state_change("Fully down");
                }
            }
            else if(server.getCurr_state().equals("Fully down"))
            {
                System.out.println("\nCURRENT STATE IS FULLY DOWN");
                System.out.println("CHOOSE ONE:\n1.CHANGE STATE TO OPERATIONAL\n2.CHANGE STATE TO PARTIALLY DOWN");
                Scanner choice=new Scanner(System.in);
                int a=choice.nextInt();
                if(a==1)
                {
                    server.state_change("Operational");
                }
                else if(a==2)
                {
                    server.state_change("Partially down");
                }
            }
        }

    }
}
