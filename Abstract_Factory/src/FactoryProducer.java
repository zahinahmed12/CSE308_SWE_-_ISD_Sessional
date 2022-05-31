public class FactoryProducer
{
    public static computerFactory getComputer(String type)
    {
        if(type==null) return null;
        if(type.equalsIgnoreCase("A")) return new computerA();
        else if(type.equalsIgnoreCase("B")) return new computerB();
        else if(type.equalsIgnoreCase("C")) return new computerC();
        return null;
    }
}
