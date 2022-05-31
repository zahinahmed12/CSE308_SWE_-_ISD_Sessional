class Zero_shake extends Builder
{
    private Product product=new Product();

    public Zero_shake()
    {
        product.setName("Zero_Shake");
        product.setBasePrice(240);
    }
    public void addSugar()
    {
        product.setSweetening("Sweetener");
    }

    public void addIngredients()
    {
        product.setIngred1("Vanilla_flavoring");
        product.setIngred2("Sugar_free_jello");
    }

    public Product getShake()
    {
        return product;
    }
}

