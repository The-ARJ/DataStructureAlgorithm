package Weekly.Week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RainWaterTrapTest {
    @Test
    public void test1(){
        int[] testData = {2,3,1,2,5};
        int ans = RainWaterTrap.trap(testData);
        assertEquals(3,ans);
        System.out.println( ans + " units of water is trapped.");
    }

}