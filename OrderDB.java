import java.util.ArrayList;
import java.util.List;

public class OrderDB {

    List<Order> orderDB = new ArrayList<>();

    Order order1 = new Order(11, new Product(1, "Schuhe"));
    Order order2 = new Order(22, new Product(2, "Hose"));
    Order order3 = new Order(33, new Product(3, "TShirt"));

    public OrderDB() {
        orderDB.add(order1);
        orderDB.add(order2);
        orderDB.add(order3);
    }

    public String list() {

        String result ="";
        for (Order o:orderDB) {
            result += o.getOrderID() + " " + o.getProduct().getProductID() + " " + o.getProduct().getName();
        }
        return result;
    }

    public String get(Order order) {
        return order.getOrderID() + " " + order.getProduct().getProductID() + " " + order.getProduct().getName();
    }

    public void add(Order order) {
        orderDB.add(order);
    }
}
