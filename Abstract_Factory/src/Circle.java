class Circle implements shape {

    private String name;
    private double radius;
    private  double surfaceArea;
    private double perimeter;

    public Circle(double r)
    {
        name="CIRCLE";
        radius=r;
        surfaceArea=0;
        perimeter=0;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public double surfaceArea() {
        surfaceArea=3.1416*radius*radius;
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        perimeter=2*3.1416*radius;
        return perimeter;
    }

    @Override
    public boolean display(computerFactory c) {
        if( 2*radius > c.getRes_height()) return false;
        else return true;
    }
}
