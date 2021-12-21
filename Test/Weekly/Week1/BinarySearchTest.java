package Weekly.Week1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BinarySearchTest {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
    int element = 1000000000;
    int[] bigArr = new int[element];

    int endValue = 999999999;
    int startValue = 1;

    @Before
    public void init(){
        for(int i=0; i<element; i++){
            bigArr[i] = i;
        }
    }

    @Test
    public void testBinary(){
        int arrLength = bigArr.length-1;
        assertTrue(BinarySearch.binarySearch(bigArr,0,arrLength,endValue));
    }
    @Test
    public void test(){
        assertTrue(BinarySearch.binarySearch(arr,1));

    }

    @Test
    public void testRegular(){
        assertTrue(BinarySearch.linearSearch(bigArr,endValue));
    }
    //CONCLUSION : Binary is ~ 500 ms faster when searching for last element
    // and ~ 250 ms for mid and ~ 100 for 1/4
}