
package Binary;

public class InfiniteArray {
    public static void main(String args[]) {
        int arr[] = { 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 30, 40, 60, 90, 100, 111, 11, 113, 114, 115, 116, 117,
                118 };

        System.out.println("KEY " + range(arr, 118));
    }

    static int range(int arr[], int target) {
        int start = 0;
        int end = 1;

        while (target >= arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;

        }

        return searchArray(arr, target, start, end);

    }

    static int searchArray(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}