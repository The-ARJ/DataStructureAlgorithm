package Weekly.Week1;

public class NumberReverse {

    public static int reverse(int number){
        int reversed = 0;
        for(;number != 0; number *= 0.1) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        } return reversed;
    }
}
