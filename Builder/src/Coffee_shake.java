class Coffee_shake extends Builder {
    private Product product=new Product();

    public Coffee_shake()
    {
        product.setName("Coffee_Shake");
        product.setBasePrice(230);
    }

    public void addSugar()
    {
        product.setSweetening("Sugar");
    }

    public void addIngredients()
    {
        product.setIngred1("Coffee");
        product.setIngred2("Jello");
    }

    public Product getShake()
    {
        return product;
    }
}
