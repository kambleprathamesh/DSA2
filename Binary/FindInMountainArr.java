package Binary;

public class FindInMountainArr {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 1 };
        int ans = leastIndex(arr, 3);
        System.out.println("The least Index Number is: " + ans);
    }

    static int leastIndex(int arr[], int target) {

        int start = 0, end = arr.length - 1;
        int index = Integer.MAX_VALUE;

        while (start <= end) {

            // calculate mid
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                // check mid and store
                if (index > mid) {
                    index = mid;
                    end = mid - 1;
                }

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (index == Integer.MAX_VALUE) {
            // tagret not present
            index = -1;
        }

        return index;
    }
}
