package Weekly.Week1;

public class PrimeNumberCheck {
    /**
     *
     * @param num is the input number that is to be checked.
     * @return true if prime and false if not
     */
    public static boolean isPrimeMethod1(int num){
        for (int i = 2; i<num;i++) {
            if(num%i==0){return false;}
        }
        return true;
    }
    public static boolean isPrimeMethod2(int num){
        for (int i = 2; i<=num/2;i++) {
            if(num%i==0){return false;}
        }
        return true;
    }
    public static boolean isPrimeMethod3(int num){
        for (int i = 2; i<(int)Math.sqrt(num);i++) {
            if(num%i==0){return false;}
        }
        return true;
    }

}