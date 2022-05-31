class Product
{
    private String name;
    private String ingred1;
    private String ingred2;
    private String sweetening;
    private String milktype;
    private String topping1;
    private String topping2;
    private int basePrice;
    private int totalPrice;
    public int candyOn=50;
    public int lactoseFree=60;
    public int cookieOn=40;
    public boolean almondMilk=false;
    public boolean candy=false;
    public boolean cookie=false;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIngred1(String ingred1) {
        this.ingred1 = ingred1;
    }

    public String getIngred1() {
        return ingred1;
    }

    public void setIngred2(String ingred2) {
        this.ingred2 = ingred2;
    }

    public String getIngred2() {
        return ingred2;
    }

    public void setSweetening(String sweetening) {
        this.sweetening = sweetening;
    }

    public String getSweetening() {
        return sweetening;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setMilktype(String milktype) {
        this.milktype = milktype;
    }

    public String getMilktype() {
        return milktype;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping1() {
        return topping1;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping2() {
        return topping2;
    }

    public void printFunction()
    {
        System.out.println("\nTHE NAME OF THE SHAKE IS: "+getName());
        System.out.println("INGREDIENTS: ");
        System.out.println(getIngred1());
        System.out.println(getIngred2());
        System.out.println(getSweetening());
        System.out.println(getMilktype());

        if(candy || cookie)
        {
            System.out.println("\nADDED INGREDIENTS: ");
            if(candy)  System.out.println(getTopping1());
            if(cookie)  System.out.println(getTopping2());
        }

        System.out.println("\nTHE BASE PRICE OF THE SHAKE: "+getBasePrice()+" TK");
        if(almondMilk) System.out.println("SUBSTITUTING ALMOND MILK INSTEAD OF MILK COSTS: "+lactoseFree+" TK");
        if(candy) System.out.println("CANDY ON TOP COSTS: "+candyOn+" TK");
        if(cookie) System.out.println("COOKIE ON TOP COSTS: "+cookieOn+" TK");

        System.out.println("\nTOTAL PRICE OF THIS SHAKE: "+getTotalPrice());
    }
}
