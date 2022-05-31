class Director
{
    Builder myBuilder;
    public void produceShake(Builder builder)
    {
        myBuilder=builder;
        myBuilder.addIngredients();
        myBuilder.addSugar();
    }
    public void lactoseFree(Builder b)
    {
        myBuilder=b;
        myBuilder.addAlmondmilk();
    }
    public void notLactoseFree(Builder b)
    {
        myBuilder=b;
        myBuilder.addMilk();
    }
    public void candy(Builder b)
    {
        myBuilder=b;
        myBuilder.addCandy();
    }
    public void cookie(Builder b)
    {
        myBuilder=b;
        myBuilder.addCookie();
    }


}