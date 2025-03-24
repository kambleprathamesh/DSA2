package Binary;

public class PeakElement {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2 };
        System.out.println(Peak(arr));
    }

    static int Peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            // calc mid
            mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // bcz arr[mid] is possible answer
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {

                // bcz arr[mid] is less than mid+1 so start is mid+1
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
