package Weekly.Week1;

// O(5n)
public class FindFibonacci {
    public static int fib(int number){
        return number>=0 ? fibO(number): 0;
    }
    private static int fibO(int number){
        int fibonacci = 0; // O(1);
        int previous = 0; // O(1);
        int current = 1; // O(1);
        if (number == 0){return 0;} // O(1);
        else if (number == 1){return 1;} // O(1);
        else {
            for (int i = 1; i < number; i++) { // O(n)
                fibonacci = previous + current; // O(n)
                previous = current; // O(n)
                current = fibonacci; // O(n)
            }
        }return fibonacci; // O(1)
    }

}
