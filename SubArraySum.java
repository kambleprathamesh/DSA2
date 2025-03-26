public class SubArraySum {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 2, 1, 5, 4, 9, 5, 9, 4, 6, 2, 3, 1 };

        int answer = Answer(arr);
        System.out.println(answer);
    }

    static int Answer(int arr[]) {

        int subArry[] = new int[3];
        int totalValidArray = 0;
        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i; j <= i + 2; j++) {
                subArry[counter] = arr[j];
                counter++;
            }
            counter = 0;

            // check for sum of array
            if (subArry[1] == subArry[0] + subArry[2]) {
                totalValidArray++;
            }
        }

        return totalValidArray;
    }
}
