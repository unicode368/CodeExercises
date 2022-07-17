import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstrWithUniqChars {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqSubstr = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            if (!uniqSubstr.add(s.charAt(end))) {
                if (max < uniqSubstr.size()) {
                    max = uniqSubstr.size();
                }
                uniqSubstr = new HashSet<>();
                start++;
                end = start;
            } else {
                uniqSubstr.add(s.charAt(end));
                end++;
            }
        }
        return Math.max(max, uniqSubstr.size());
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
