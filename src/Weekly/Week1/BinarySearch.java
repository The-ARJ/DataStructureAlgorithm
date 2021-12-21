package Weekly.Week1;

public class BinarySearch {

    public static boolean binarySearch(int[] arr, int head, int tail, int target){
        int midIndex = (int) ( (head + tail) * 0.5);
        if (target<arr[0]||target>arr[arr.length-1]) return false;
        else if (arr[midIndex]>target) return binarySearch(arr, head, midIndex-1, target);
        else if (arr[midIndex]<target) return binarySearch(arr, midIndex+1, tail, target);
        else if (arr[midIndex] == target) return true;
        else return false;
    }

    public static boolean binarySearch (int[] arr, int target){
        int head = 0;
        int tail = arr.length - 1;
        int midIndex = (int) (tail*0.5);

        while (arr[midIndex]!=target){

            if (target<arr[0]||target>arr[arr.length-1]) return false;

            if (target>arr[midIndex]){
                head = midIndex+1;
                midIndex = (int) ((head+tail)*0.5);
            }
            else if (target<arr[midIndex]){
                tail = midIndex-1;
                midIndex = (int) ((head+tail)*0.5);
            }
        }
        return arr[midIndex]==target;
    }

    public static boolean linearSearch(int[] arr, int target){
        int i = 0;
        while(arr[i]!=target){
            if (i>arr.length-1){
                return false;
            }
            else i++;
        }
        return arr[i]==target;
    }
}
