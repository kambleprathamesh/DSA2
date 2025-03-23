package Binary;

public class InfiniteArray {
    public static void main(String[] args) {

    }

    static int answer(int arr[], int target) {
        int key = 0;
        int start = 0;
        int end = 1;
        while (target >= arr[end]) {
            int newStart = end + 1;
            end = end - start + 1;
            start = newStart;
        }
        return SearchArray(arr, target, start, end);
    }

    static int SearchArray(int arr[], int target, int start, int end) {
        int key = 0;
        return key;
    }
}
