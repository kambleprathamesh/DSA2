package Binary;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 4, 6, 7 };

        System.out.println("KEY " + floor(arr, 5));
    }

    static int floor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) {
            return -1;
        }
        while (start <= end) {
            // mid
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
