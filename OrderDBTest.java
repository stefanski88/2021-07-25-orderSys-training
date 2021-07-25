import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    @Test
    @DisplayName("get whole order, includes orderID, productID & productName")
    public void listTest() {
        // GIVEN
        OrderDB orderDB = new OrderDB();
        // WHEN
        String actual = orderDB.list();
        // THEN
        String expected = "11 1 Schuhe22 2 Hose33 3 TShirt";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("receive a complete order")
    public void getTest() {
        // GIVEN
        OrderDB orderDB = new OrderDB();
        // WHEN
        String actual = orderDB.get(orderDB.order1);
        // THEN
        String expected = "11 1 Schuhe";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("check list size after adding an order")
    public void addTest() {
        // GIVEN
        List<Order> orderDB = new ArrayList<>();
        Order order1 = new Order(11, new Product(1, "Schuhe"));
        Order order2 = new Order(22, new Product(2, "Hose"));
        orderDB.add(order1);
        orderDB.add(order2);
        int actual = orderDB.size();
        // WHEN
        Order order3 = new Order(400, new Product(4, "Schuhe Nike"));
        orderDB.add(order3);
        // THEN
        int expected = orderDB.size();
        assertEquals(expected, actual);
    }

}