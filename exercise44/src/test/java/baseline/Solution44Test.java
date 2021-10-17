package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    @Test
    void getJSONData() {
        Solution44 s = new Solution44();
        s.getJSONData();

        assertEquals("Widget", s.inv.product.get(0).getItemName());
        assertEquals(25.0, s.inv.product.get(0).getPrice());
        assertEquals(5, s.inv.product.get(0).getQuantity());
    }
}