import java.util.*;

public class regular_user extends User {

    String choice_one="";
    //String choice_two="";

    public regular_user(Server server)
    {
        this.type="regular";
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
            System.out.println("\nCHOOSE ONE:\n1.CONTINUE USING LIMITED FUNCTIONALITY\n2.PAY $20 PER HOUR FOR FULL FUNCTIONALITY");
            Scanner choice =new Scanner(System.in);
            int n=choice.nextInt();
            if(n==1)
            {
                choice_one="N";
            }
            else if(n==2)
            {
                choice_one="Y";
                System.out.println("YOU'RE GOING TO USE FULL FUNCTIONALITY. YOUR DATA HAS BEEN COPIED TO THE DEF SERVER");
            }
        }
        else if(prev.equals("Operational") && now.equals("Fully down"))
        {
            System.out.println("\nDO YOU WANT TO PAY $20 PER HOUR TO TAKE SERVICE FROM DEF COMPANY?\n1.YES\n2.NO");
            Scanner choice =new Scanner(System.in);
            int n=choice.nextInt();
            if(n==1)
            {
                choice_one="Y";
                System.out.println("YOU'RE GOING TO USE FULL FUNCTIONALITY. YOUR DATA HAS BEEN COPIED TO THE DEF SERVER");
            }
            else if(n==2)
            {
                choice_one="N";
                //System.out.println("YOU'RE GOING TO USE FULL FUNCTIONALITY. YOUR DATA HAS BEEN COPIED TO THE DEF SERVER");
            }
        }
        else if(prev.equals("Partially down") && now.equals("Operational"))
        {
            int bill=new Random().nextInt(4001);
            if(bill<20) bill=20;
            if(choice_one.equals("Y"))
            {
                //System.out.println("TOTAL BILL: $1200 FOR USING FULL FUNCTIONALITY WHILE ABC SERVER WAS PARTIALLY DOWN");
                System.out.println("TOTAL BILL: $"+bill+" FOR USING FULL FUNCTIONALITY WHILE ABC SERVER WAS DOWN");
            }
            choice_one="";
        }
        else if(prev.equals("Fully down") && now.equals("Operational"))
        {
            int bill=new Random().nextInt(4001);
            if(bill<20) bill=20;
            if(choice_one.equals("Y"))
            {
                //System.out.println("TOTAL BILL: $1200 FOR USING FULL FUNCTIONALITY WHILE ABC SERVER WAS FULLY DOWN");
                System.out.println("TOTAL BILL: $"+bill+" FOR USING FULL FUNCTIONALITY WHILE ABC SERVER WAS DOWN");
            }
            //choice_two="";
            choice_one="";
        }
    }
}
