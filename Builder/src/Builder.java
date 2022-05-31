public abstract class Builder
{
    Product p;
    abstract void addSugar();
    abstract void addIngredients();
    abstract Product getShake();

    void addMilk()
    {
        p=getShake();
        p.setMilktype("Milk");
        p.setTotalPrice(p.getBasePrice());
    }
    void addAlmondmilk()
    {
        p=getShake();
        p.setMilktype("Almond Milk");
        p.setTotalPrice(p.getBasePrice()+ p.lactoseFree);
        p.almondMilk=true;

    }
    void addCandy()
    {
        p=getShake();
        p.setTopping1("Candy");
        p.setTotalPrice(p.getTotalPrice()+p.candyOn);
        p.candy=true;
    }
    void addCookie()
    {
        p=getShake();
        p.setTopping2("Cookie");
        p.setTotalPrice(p.getTotalPrice()+p.cookieOn);
        p.cookie=true;
    }

}
