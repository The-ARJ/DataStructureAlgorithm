package Weekly.Week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFibonacciTest {

    @Test
    public void test(){
        assertEquals(9227465 ,FindFibonacci.fib(35));
    }

}