package _Java.Interview;

public class BinarySearch {

    public static void main(String[] args){
        int arr[]={1,3,5,8,9,10,12};
        System.out.println(binarySearch(arr,0,arr.length-1,5));
    }

    public static int binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid-1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            return -1;
        }

        return -1;
    }

}