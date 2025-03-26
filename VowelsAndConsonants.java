public class VowelsAndConsonants {
    public static void main(String[] args) {
        String str = "aeiou";
        int ans[] = VAS(str);

        System.out.println("VOWELS " + ans[0] + " " + "Consonants " + ans[1]);
    }
    static int[] VAS(String str) {
        int[] ans = { 0, 0 };

        String newStr = str.toLowerCase();
        // convert to chararry
        for (char c : newStr.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ans[0]++;
            } else {
                ans[1]++;
            }
        }
        return ans;
    }
}
