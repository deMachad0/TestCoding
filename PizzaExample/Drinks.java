package PizzaExample;

public class Drinks implements Item {

    public String name;
    public double price;
    public int numberOf;

    public Drinks(String name, double price, int numberOf) {
        this.name = name;
        this.price = price;
        this.numberOf = numberOf;
    }

    @Override
    public String toString() {
        return "Drinks [name=" + name + ", numberOf=" + numberOf + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    @Override
    public double getNumberOf() {
        return numberOf;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double setNumberOf() {
        return 0;
    }

    @Override
    public double setPrice() {
        return 0;
    }

    @Override
    public double valueTotal() {
        return Item.super.valueTotal();
    }

}