package Binary;

public class Ceil {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 10, 13, 17 };

        int ans = ceil(arr, 20);
        System.out.println("KEY " + ans);
    }

    static int ceil(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            // find mid
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}