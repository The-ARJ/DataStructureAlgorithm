package Weekly.Week1;

import java.util.Arrays;

public class ArrayFlip {
    public static int[] reverseArray(int[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        } return arr;
    }
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(reverseArray(new int[]{4, 5, 2})));
//    }
}
