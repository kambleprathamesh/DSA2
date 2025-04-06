// package Binary;

// public class PeakElement {
//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2 };
//         System.out.println(Peak(arr));
//     }

//     static int Peak(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;
//         int mid = 0;
//         while (start < end) {
//             // calc mid
//             mid = start + (end - start) / 2;

//             if (arr[mid] > arr[mid + 1]) {
//                 // bcz arr[mid] is possible answer
//                 end = mid;
//             } else if (arr[mid] < arr[mid + 1]) {

//                 // bcz arr[mid] is less than mid+1 so start is mid+1
//                 start = mid + 1;
//             }
//         }

//         return arr[start];
//     }
// }

package Binary;

public class PeakElement {
    public static void main(String args[]) {
        int arr[] = { 10, 5, 4, 3, 2, 1, 4, 5, 10 };
        int index = PeakElement(arr);
        if (index == -1) {
            System.out.println("Peak Index: " + index + " & Peak Element: 0");
        } else {
            System.out.println("Peak Index: " + index + " & Peak Element: " + arr[index]);

        }
    }

    static int PeakElement(int[] arr) {
        int index = -1;
        int start = 0, end = arr.length;

        while (start <= end) {
            // cal mid
            int mid = start + (end - start) / 2;
            if (mid + 1 > arr.length - 1) {
                return mid;
            } else if (mid - 1 == -1) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                // check for adjascent elements also
                if (arr[mid - 1] < arr[mid]) {
                    end = mid + 1;
                } else {
                    return mid;
                }

            } else {
                start = mid - 1;
            }
        }

        return index;
    }
}