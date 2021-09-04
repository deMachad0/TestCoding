package PizzaExample;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> itens = new ArrayList<>();

    public void addItem(Item item) {
        itens.add(item);
    }

    public Double sumValues() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            double price = 0;
            Item item = itens.get(i);
            price = item.valueTotal();
            total = total + price;
        }
        return total;
    }
    

}