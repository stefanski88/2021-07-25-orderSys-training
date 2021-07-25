import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    @Test
    @DisplayName("show list")
    public void listTest() {
        // GIVEN
        ProductDB productDB = new ProductDB();

        // WHEN
        String actual = productDB.list();
        // THEN
        String expected = "1 Schuhe 2 Hose 3 TShirt";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("get product")
    public void getTest() {
        // GIVEN
        ProductDB productDB = new ProductDB();
        productDB.get(productDB.product1);
        // WHEN
        String actual = productDB.get(productDB.product1);
        // THEN
        String expected = "1Schuhe";
        assertEquals(expected, actual);
    }
}