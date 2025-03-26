import java.util.Arrays;
import java.util.HashSet;

public class DistinctString {
    public static void main(String args[]) {

        String str[] = { "abc", "cde", "fgh", "abc", "trs" };

        int answer = distStr(str);
        System.out.println("Total number of Distinct Strings " + answer);
    }

    static int distStr(String str[]) {

        HashSet<String> set = new HashSet<>();

        for (String s : str) {
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            set.add(new String(tempArray));
        }

        return set.size();

    }
}
