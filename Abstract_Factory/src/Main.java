import java.io.*;
public class Main {
    public static void main(String[] args){

        System.out.println("ENTER THE NAME OF THE COMPUTER: 'A'/ 'B'/ 'C'");
        computerFactory c1=FactoryProducer.getComputer("a");
        System.out.println("A");
        cpu cA=c1.getCpu();
        mmu mA=c1.getMmu();

        //System.out.println("ENTER THE NAME OF THE SHAPE: ");
        //System.out.println("CIRCLE");
        shape c=new Circle(100);

        //System.out.println("ENTER RADIUS: "+c.getRadius());
        System.out.println();

        System.out.println("THE NAME OF THIS SHAPE IS: "+c.getName());
        System.out.println("THE SURFACE AREA IS: "+c.surfaceArea());
        System.out.println("THE PERIMETER IS: "+c.perimeter());
        System.out.println();

        System.out.println("THE NAME OF THIS COMPUTER: "+c1.getName());
        System.out.println("CPU: "+cA.getName());
        System.out.println("MMU: "+mA.getName());
        System.out.println("RESOLUTION: "+c1.getResolution());

        if(c.display(c1))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");

        System.out.println("ENTER THE NAME OF THE COMPUTER: 'A'/ 'B'/ 'C'");
        computerFactory c2=FactoryProducer.getComputer("b");
        System.out.println("B");
        cpu cB=c2.getCpu();
        mmu mB=c2.getMmu();

        shape s=new Square(150);

        System.out.println();

        System.out.println("THE NAME OF THIS SHAPE IS: "+s.getName());
        System.out.println("THE SURFACE AREA IS: "+s.surfaceArea());
        System.out.println("THE PERIMETER IS: "+s.perimeter());
        System.out.println();

        System.out.println("THE NAME OF THIS COMPUTER: "+c2.getName());
        System.out.println("CPU: "+cB.getName());
        System.out.println("MMU: "+mB.getName());
        System.out.println("RESOLUTION: "+c2.getResolution());

        if(s.display(c2))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");

        System.out.println("ENTER THE NAME OF THE COMPUTER: 'A'/ 'B'/ 'C'");
        computerFactory c3=FactoryProducer.getComputer("c");
        System.out.println("C");
        cpu cC=c3.getCpu();
        mmu mC=c3.getMmu();

        shape r=new Rectangle(200,150);

        System.out.println();

        System.out.println("THE NAME OF THIS SHAPE IS: "+r.getName());
        System.out.println("THE SURFACE AREA IS: "+r.surfaceArea());
        System.out.println("THE PERIMETER IS: "+r.perimeter());
        System.out.println();

        System.out.println("THE NAME OF THIS COMPUTER: "+c3.getName());
        System.out.println("CPU: "+cC.getName());
        System.out.println("MMU: "+mC.getName());
        System.out.println("RESOLUTION: "+c3.getResolution());

        if(r.display(c3))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");

        System.out.println("ENTER THE NAME OF THE COMPUTER: 'A'/ 'B'/ 'C'");
        computerFactory c4=FactoryProducer.getComputer("a");
        System.out.println("A");
        cpu cA2=c4.getCpu();
        mmu mA2=c4.getMmu();

        shape t=new Triangle(200,100,150);
        System.out.println();

        System.out.println("THE NAME OF THIS SHAPE IS: "+t.getName());
        System.out.println("THE SURFACE AREA IS: "+t.surfaceArea());
        System.out.println("THE PERIMETER IS: "+t.perimeter());
        System.out.println();

        System.out.println("THE NAME OF THIS COMPUTER: "+c4.getName());
        System.out.println("CPU: "+cA2.getName());
        System.out.println("MMU: "+mA2.getName());
        System.out.println("RESOLUTION: "+c4.getResolution());

        if(t.display(c4))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");

        /*shape cc=new Circle(250);
        if(cc.display(c1))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");
        if(cc.display(c3))  System.out.println("THIS SHAPE CAN BE DISPLAYED IN THIS RESOLUTION\n");
        else System.out.println("THIS SHAPE CANNOT BE DISPLAYED IN THIS RESOLUTION\n");*/

    }
}
