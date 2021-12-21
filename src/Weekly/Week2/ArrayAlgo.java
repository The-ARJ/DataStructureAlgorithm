package Weekly.Week2;

import java.util.Arrays;

public class ArrayAlgo {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,0};
        int[] b = {1,2,3,4,5};
        System.out.println(Arrays.toString(intAtEmptyPos(a,3,10,5)));
        System.out.println(Arrays.toString(insAtAnyPos(b,3,8)));
        System.out.println(Arrays.toString(delAtAnyPos(b,2)));
        rainWaterTrapped(b);
        System.out.println(trap(b));

    }
    /**
     *  <H2>Inserting value in a array</H2>
     * @param arr int array
     * @param pos position to be inserted
     * @param value value to be inserted
     * @return new int array
     */
    public static int[] insAtAnyPos(int[] arr, int pos, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos - 1) newArr[i] = arr[i];
            else if (i == pos - 1) newArr[i] = value;
            else newArr[i] = arr[i-1];
        } return newArr;
    }

    /**
     * <H2>Inserting value at empty array pos</H2>
     * @param arr int array
     * @param pos position to be inserted
     * @param value value to be inserted
     * @param n empty pos (number of inserted element)
     * @return updated int array
     */
    public static int[] intAtEmptyPos(int[] arr, int pos, int value, int n){
        for (int i = n-1; i >= pos-1; i--) arr[i + 1] = arr[i];
        arr[pos-1] = value;
        return arr;
    }

    /**
     * <H2>Deleting value in a array</H2>
     * @param arr int array
     * @param pos position to be deleted
     * @return int array
     */
    public static int[] delAtAnyPos(int[] arr, int pos){
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i<newArr.length;i++){
            if (i==pos-1) newArr[i] = arr[i+1];
            else if (i>pos-1) newArr[i] = arr[i+1];
            else newArr[i] = arr[i];
        } return newArr;
    }
    public static int[] delAtAnyPos(int[] arr, int pos, int n){
        for (int i = n-1; i < arr.length ; i++) {
            if(i>=pos-1){
                int cache = arr[i];
                arr[i] = arr[i+1];
            }
        } return arr;
    }
    public static int rainWaterTrapped(int[] arr){
        int countLeft = arr[0];
        int countRight = 0;
        for (int i = 0; i<arr.length;i++){
            System.out.println(countRight +" "+ countLeft);
            if (i==arr.length-1) return countLeft;
            countLeft = arr[i]>arr[i+1] ? arr[i] : countLeft;
            countRight = arr[i] < arr[i+1] ? arr[i] : countRight;
        }
        return countLeft;
    }

    public static int trap(int[] arr){
        int ans = 0;
        int n= arr.length;
        for(int i=0; i<n;i++){
            int leftMax = arr[i];
            for (int j=i-1;j>=0;j--){
                leftMax = Math.max(leftMax, arr[j]);
            }
            int rightMax = arr[i];
            for (int j=i+1;j<n;j++){
                rightMax = Math.max(rightMax,arr[j]);
            }
            ans = ans + (Math.min(leftMax,rightMax)-arr[i]);
        }
        return ans;
    }
}
