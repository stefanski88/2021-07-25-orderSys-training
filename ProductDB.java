import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    List<Product> productDB = new ArrayList<>();

    Product product1 = new Product(1, "Schuhe");
    Product product2 = new Product(2, "Hose");
    Product product3 = new Product(3, "TShirt");

    public ProductDB() {
        productDB.add(product1);
        productDB.add(product2);
        productDB.add(product3);
    }

    public String list() {

        String result = "";
        for (Product p:productDB) {
            result += p.getProductID() + " " + p.getName();
        }
        return result;
    }

    public String get(Product product) {
        return product.getProductID() + product.getName();
    }



}
