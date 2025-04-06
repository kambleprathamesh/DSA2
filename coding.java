public class coding {

    public static void main(String args[]) {
        String str = "loveleetcode";
        int ans = findIndex(str);
        System.out.println(ans);
    }

    static int findIndex(String str) {

        char chars[] = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[i + 1]) {
                return i;
            }
        }
        return -1;

    }
}

// Given a string, find the first non-repeating character and return its index.
// If all characters are repeating, return -1.

// Example 1:

// Input: "leetcode"
// Output: 0
// Example 2:

// Input: "loveleetcode"
// Output: 2

// Example 3:

// Input: "aabb"
// Output: -1