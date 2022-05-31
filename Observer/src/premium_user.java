import java.util.*;

public class premium_user extends User {

    String choice_one="";

    public premium_user(Server server)
    {
        this.type="premium";
        this.server=server;
        this.server.add_clients(this);
    }

    @Override
    public void update() {

        System.out.println("\nSTATE CHANGED FROM "+server.getPrev_state()+" TO "+server.getCurr_state());

        String prev=server.getPrev_state();
        String now=server.getCurr_state();

        if(prev.equals("Operational") && now.equals("Partially down"))
        {
            System.out.println("\nCHOOSE ONE:\n1.SERVICE FROM TWO SERVERS( ABC & DEF )\n2.SERVICE FROM ONE SERVER( DEF )");
            Scanner choice =new Scanner(System.in);
            int n=choice.nextInt();
            if(n==1)
            {
                choice_one="2";
            }
            else if(n==2)
            {
                choice_one="1";
            }
        }
        else if(prev.equals("Operational") && now.equals("Fully down"))
        {
            System.out.println("DEF COMPANY IS PROVIDING SERVICE WHILE ABC COMPANY IS FULLY DOWN ");
        }
        else if(prev.equals("Partially down") && now.equals("Fully down"))
        {
            if(choice_one.equals("2"))
            {
                System.out.println("ABC COMPANY HAS SHIFTED ALL THE SERVICES TO DEF COMPANY ");
            }
            choice_one="";
        }
    }
}
