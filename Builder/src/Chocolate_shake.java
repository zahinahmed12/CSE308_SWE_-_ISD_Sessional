class Chocolate_shake extends Builder
{
     private Product product=new Product();

     public Chocolate_shake()
     {
         product.setName("Chocolate_Shake");
         product.setBasePrice(230);
     }
     public void addSugar()
    {
        product.setSweetening("Sugar");
    }

    public void addIngredients()
    {
        product.setIngred1("Chocolate_syrup");
        product.setIngred2("Chocolate_icecream");
    }

    public Product getShake()
    {
        return product;
    }
}
