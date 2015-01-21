package mycart;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class UtilTest {

    @Test
    public void testGetPriceInDollars() throws Exception {
        int priceInCents = 100;
        String priceInDollar = "$1.00";
        assertEquals(priceInDollar,Util.getPriceInDollars(priceInCents));
    }
}