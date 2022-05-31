class Square implements shape {

    private String name;
    private double sideLength;
    private  double surfaceArea;
    private double perimeter;

    public Square(double l)
    {
        name="SQUARE";
        sideLength=l;
        surfaceArea=0;
        perimeter=0;
    }

    public String getName()
    {
        return name ;
    }

    @Override
    public double surfaceArea() {
        surfaceArea=sideLength*sideLength;
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        perimeter=4*sideLength;
        return perimeter;
    }

    @Override
    public boolean display(computerFactory c) {
        if(sideLength > c.getRes_height()) return false;
        else return true;
    }
}
