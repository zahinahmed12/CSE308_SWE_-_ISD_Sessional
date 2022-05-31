class Rectangle implements shape {

    private String name;
    private double length;
    private double width;
    private  double surfaceArea;
    private double perimeter;

    public Rectangle(double l,double b)
    {
        name="RECTANGLE";
        length=l;
        width=b;
        surfaceArea=0;
        perimeter=0;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public double surfaceArea() {
        surfaceArea=length*width;
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        perimeter=2*length+2*width;
        return perimeter;
    }

    @Override
    public boolean display(computerFactory c) {
        if(length>c.getRes_width() || width>c.getRes_height()) return false;
        else return true;
    }
}

