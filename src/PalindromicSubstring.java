//	Find the longest palindromic substring in a given string.

public class PalindromicSubstring {

    public static String Palindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCentre(s, i, i);      // Odd length palindrome
            int len2 = expandAroundCentre(s, i, i + 1);  // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCentre(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = Palindrome(input);
        System.out.println("Longest Palindromic Substring is: " + longestPalindrome);
    }
}
