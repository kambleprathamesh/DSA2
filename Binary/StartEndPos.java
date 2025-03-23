package Binary;

import java.util.Arrays;

public class StartEndPos {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 9 };
        int[] ans = answer(arr, 10);
        System.out.println("ANS " + Arrays.toString((ans)));
    }

    static int[] answer(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = SEPos(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = SEPos(arr, target, false);
        }
        return ans;
    }

    static int SEPos(int[] arr, int target, boolean firstPosition) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (firstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}
