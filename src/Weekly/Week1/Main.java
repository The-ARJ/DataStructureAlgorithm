package Weekly.Week1;

//HW miscellaneous sequence and series and AP GP HP
public class Main {
    public static void main(String[] args) {


    }
    public static void func1(){ // O(n^2log n)
        int count = 0;
        int n= 12;
        for (int i=n/2; i<=n;i++){
            for (int j=1; j+(n/2)<=n; j++){
                for (int k = 1; k<=n; k=k*2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void func2(int n){ // O(sqrt(n))
        int i =1;int s = 1;
        while(s<=n){
            i++;
            s += i;
        }
        System.out.println(s);
    }

}
