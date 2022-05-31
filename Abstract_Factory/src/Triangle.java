import static java.lang.Math.*;
class Triangle implements shape {

    private String name;
    private double side1;
    private double side2;
    private double side3;
    private double surfaceArea;
    private double perimeter;

     public Triangle(double a, double b, double c)
     {
         name="TRIANGLE";
         side1=a;
         side2=b;
         side3=c;
         surfaceArea=0;
         perimeter=0;
     }

     public String getName() {
         return name;
     }

     @Override
     public double surfaceArea() {
         double s=(side1+side2+side3)/2;
         surfaceArea=sqrt(s*(s-side1)*(s-side2)*(s-side3));
         return surfaceArea;
     }

     @Override
     public double perimeter() {
         perimeter = side1+side2+side3;
         return perimeter;
     }

    @Override
    public boolean display(computerFactory c) {

        double base1= side1;
        double height1=(2*surfaceArea)/base1;
        double base2= side2;
        double height2=(2*surfaceArea)/base2;
        double base3= side3;
        double height3=(2*surfaceArea)/base3;
        if(base1<=c.getRes_width() && height1<=c.getRes_height()) return true;
        else if(base2<=c.getRes_width() && height2<=c.getRes_height()) return true;
        else if(base3<=c.getRes_width() && height3<=c.getRes_height()) return true;
        else return false;
    }
}
