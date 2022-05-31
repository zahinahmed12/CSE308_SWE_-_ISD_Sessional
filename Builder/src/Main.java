import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true)
        {
            int counter=0;
            int bill=0;
            char shake,milk,td,top='\0';
            boolean param=false;
            LinkedList<Product> slist;
            slist =new LinkedList<Product>();

            System.out.println("IN ORDER TO PLACE AN ORDER ENTER 'O'");
            System.out.println("IN ORDER TO EXIT THAT ORDER ENTER 'E'");

            Scanner char1=new Scanner(System.in);
            char ch=char1.next().charAt(0);

            if(ch =='E') {
                System.out.println("YOU HAVE NOT OPENED ANY ORDER YET, SO CAN'T EXIT. THANKS!");
                continue;
            }
            while(ch =='O')
            {
                System.out.println("CURRENT ORDER IS ONGOING.");
                System.out.println("ENTER THE NAME OF YOUR SHAKE!");
                System.out.println("1.CHOCOLATE  =230/-\n" +
                                   "2.COFFEE     =230/-\n" +
                                   "3.STRAWBERRY =200/-\n" +
                                   "4.VANILLA    =190/-\n" +
                                   "5.ZERO       =240/-");

                Scanner char2=new Scanner(System.in);
                shake=char2.next().charAt(0);

                if(shake=='O')
                {
                    System.out.println("YOU CANNOT OPEN ANOTHER ORDER WHILE CURRENT ORDER IS ONGOING, THANKS!");
                    System.out.println("DO YOU WANT TO ADD SOMETHING ELSE TO YOUR PREVIOUS ORDER? THEN CONTINUE ADDING.");
                    System.out.println("OR EXIT THIS ORDER BY PRESSING 'E', THANKS!\n");
                }
                else if(shake=='E')
                {
                    if(counter==0){ System.out.println("YOU MUST ADD ONE ITEM TO YOUR ORDER, THANKS!\n"); }
                    else
                    {
                        for(int i=0;i<slist.size();i++)
                        {
                            Product show=slist.get(i);
                            show.printFunction();
                        }
                        ch='E';
                        System.out.println("\nTOTAL PRICE OF THIS ORDER: "+bill+"\n");
                    }
                }
                else if(shake>='1' && shake<='5') {
                    counter++;
                    Director d = new Director();

                    System.out.println("LACTOSE FREE? (ADDS 60/- MORE) \n1.YES  \n2.NO");
                    while (true) {
                        Scanner sm = new Scanner(System.in);
                        milk = sm.next().charAt(0);
                        if (milk == '1' || milk == '2') break;
                        else System.out.println("MUST INSERT '1' OR '2'");
                    }
                    if(milk=='1') param=true;
                    else param=false;
                    System.out.println("TOPPINGS!!!\nCANDY  50/- \nCOOKIE 40/-");
                    System.out.println("WANT TO ADD TOPPINGS? \n1.YES  \n2.NO");
                    while (true) {
                        Scanner st = new Scanner(System.in);
                        td = st.next().charAt(0);
                        if (td == '1' || td == '2') break;
                        else System.out.println("MUST INSERT '1' OR '2'");
                    }
                    if (td == '1') {
                        System.out.println("WHICH ONE? \n1.CANDY  \n2.COOKIE \n3.BOTH");
                        while (true) {
                            Scanner addtop = new Scanner(System.in);
                            top = addtop.next().charAt(0);
                            if (top == '1' || top == '2' || top == '3') break;
                            else System.out.println("MUST INSERT '1' OR '2' OR '3'");
                        }
                    }
                    if (shake == '1') {

                        Builder b = new Chocolate_shake();
                        d.produceShake(b);
                        if(param) d.lactoseFree(b);
                        else d.notLactoseFree(b);
                        if (td == '1') {
                            if(top =='1') d.candy(b);
                            else if(top =='2') d.cookie(b);
                            else if(top =='3')
                            {
                                d.candy(b);
                                d.cookie(b);
                            }
                        }
                        Product p = b.getShake();
                        bill += p.getTotalPrice();
                        slist.add(p);

                    } else if (shake == '2') {

                        Builder b = new Coffee_shake();
                        d.produceShake(b);
                        if(param) d.lactoseFree(b);
                        else d.notLactoseFree(b);
                        if (td == '1') {
                            if(top =='1') d.candy(b);
                            else if(top =='2') d.cookie(b);
                            else if(top =='3')
                            {
                                d.candy(b);
                                d.cookie(b);
                            }
                        }
                        Product p = b.getShake();
                        bill += p.getTotalPrice();
                        slist.add(p);


                    } else if (shake == '3') {

                        Builder b = new Strawberry_shake();
                        d.produceShake(b);
                        if(param) d.lactoseFree(b);
                        else d.notLactoseFree(b);
                        if (td == '1') {
                            if(top =='1') d.candy(b);
                            else if(top =='2') d.cookie(b);
                            else if(top =='3')
                            {
                                d.candy(b);
                                d.cookie(b);
                            }
                        }
                        Product p = b.getShake();
                        bill += p.getTotalPrice();
                        slist.add(p);
                    } else if (shake == '4') {

                        Builder b = new Vanilla_shake();
                        d.produceShake(b);
                        if(param) d.lactoseFree(b);
                        else d.notLactoseFree(b);
                        if (td == '1') {
                            if(top =='1') d.candy(b);
                            else if(top =='2') d.cookie(b);
                            else if(top =='3')
                            {
                                d.candy(b);
                                d.cookie(b);
                            }
                        }
                        Product p = b.getShake();
                        bill += p.getTotalPrice();
                        slist.add(p);

                    } else if (shake == '5') {

                        Builder b = new Zero_shake();
                        d.produceShake(b);
                        if(param) d.lactoseFree(b);
                        else d.notLactoseFree(b);
                        if (td == '1') {
                            if(top =='1') d.candy(b);
                            else if(top =='2') d.cookie(b);
                            else if(top =='3')
                            {
                                d.candy(b);
                                d.cookie(b);
                            }
                        }
                        Product p = b.getShake();
                        bill += p.getTotalPrice();
                        slist.add(p);
                    }
                    System.out.println("\nYOU CAN ADD MORE SHAKES TO THIS ORDER BY PRESSING ANY OTHER KEY THAN 'E' AND 'O'");
                    System.out.println("YOU CAN EXIT THIS ORDER BY PRESSING 'E', THANKS!\n");

                    Scanner cont=new Scanner(System.in);
                    char z=cont.next().charAt(0);

                    if(z=='E')
                    {
                        for(int i=0;i<slist.size();i++)
                        {
                            Product show=slist.get(i);
                            show.printFunction();
                        }
                        ch='E';
                        System.out.println("\nTOTAL PRICE OF THIS ORDER: "+bill+"\n");
                    }
                    else if (z=='O')
                    {
                        System.out.println("YOU CANNOT OPEN ANOTHER ORDER WHILE CURRENT ORDER IS ONGOING, " +
                                           "YOU MUST EXIT THIS ORDER BY PRESSING 'E' FIRST TO DO SO, THANKS!");
                        System.out.println("DO YOU WANT TO ADD SOMETHING ELSE TO YOUR PREVIOUS ORDER? THEN CONTINUE ADDING.");
                        System.out.println("ELSE EXIT THIS ORDER BY PRESSING 'E', THANKS!\n");
                    }
                }
                else { System.out.println("INVALID INPUT"); }
            }
        }
    }
}
