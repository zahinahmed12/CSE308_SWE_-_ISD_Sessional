class Strawberry_shake extends Builder {

    private Product product=new Product();

    public Strawberry_shake()
    {
        product.setName("Strawberry_Shake");
        product.setBasePrice(200);
    }

    public void addSugar()
    {
        product.setSweetening("Sugar");
    }


    public void addIngredients()
    {
        product.setIngred1("Strawberry_syrup");
        product.setIngred2("Strawberry_icecream");
    }

    public Product getShake()
    {
        return product;
    }
}
