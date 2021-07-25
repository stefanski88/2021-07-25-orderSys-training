public class Order {
    private int orderID;
    private Product product;

    public Order(int orderID, Product product) {
        this.orderID = orderID;
        this.product = product;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
