package PizzaExample;

public interface Item {

    public double getPrice();

    public double setPrice();

    public double getNumberOf();

    public double setNumberOf();

    public default double valueTotal() {
        return getNumberOf() * getPrice();
    }

}