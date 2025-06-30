//6.	Find the length of the longest substring without repeating characters.

import java.util.HashSet;
import java.util.*;

public class LongestSubsting {
    public static int longestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If currentChar is already in set, move the left pointer
             while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = longestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
