class Vanilla_shake extends Builder
{
    private Product product=new Product();

    public Vanilla_shake()
    {
        product.setName("Vanilla_Shake");
        product.setBasePrice(190);
    }

    public void addSugar()
    {
        product.setSweetening("Sugar");
    }

    public void addIngredients()
    {
        product.setIngred1("Vanilla_flavoring");
        product.setIngred2("Jello");
    }

    public Product getShake()
    {
        return product;
    }
}

