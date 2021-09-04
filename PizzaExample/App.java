package PizzaExample;

public class App {
    public static void main(String[] args) {

        Client c = new Client(32424242, "James", 1);
        Order order = new Order();
        Item pizza = new Pizza("Marguerita", 14.5, 2);
        Item Desert = new Desert("pie", 5, 1);
        Item Drinks = new Drinks("beer", 6, 2);
        order.addItem(pizza);
        order.addItem(Desert);
        order.addItem(Drinks);
        order.sumValues();
        Double total = order.sumValues();

        System.out.println("Welcome to the Pizza Order ");
        System.out.println("Enter your ID and name: ");
        System.out.println("Enter the Quantity of pizzas you would like to order: ");
        System.out.println("Enter the Flavour of your pizza: ");
        System.out.println("Enter the Quantity of Drinks you would like to order: ");
        System.out.println("Enter the quantity of Desert you would like to order: ");
        System.out.println("The amount of your order is: ");
        System.out.println(c.toString());
        System.out.println(pizza.toString());
        System.out.println(Desert.toString());
        System.out.println(Drinks.toString());

        System.out.println(total);

    }
}