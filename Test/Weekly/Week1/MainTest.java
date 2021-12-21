package Weekly.Week1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void arrayFlip() {
        assertEquals("Not Matched",
                Arrays.toString(new int[] {1,2,3,4,5}),
                Arrays.toString(ArrayFlip.reverseArray(new int[]{5, 4, 3, 2, 1})));
    }

    @Test
    public void numberReverse(){
        assertEquals("Not Matched", 321, NumberReverse.reverse(123));
    }

    @Test
    public void isPrimeMethod1(){
        assertTrue(PrimeNumberCheck.isPrimeMethod1(1000000007));
    }
    @Test
    public void isPrimeMethod2(){
        assertTrue(PrimeNumberCheck.isPrimeMethod2(1000000007));
    }
    @Test
    public void isPrimeMethod3(){
        assertTrue(PrimeNumberCheck.isPrimeMethod3(1000000007));
    }
}
