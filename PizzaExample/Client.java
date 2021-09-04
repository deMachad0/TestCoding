package PizzaExample;

public class Client {
    private double id;
    private String name;
    private int order;

    public Client(double id, String name, int order) {
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", order=" + order + "]";
    }

}