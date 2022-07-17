import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstrWithUniqChars {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqSubstr = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            if (!uniqSubstr.add(s.charAt(end))) {
                if (max < uniqSubstr.size()) {
                    max = uniqSubstr.size();
                }
                uniqSubstr.remove(s.charAt(start));
                start++;
            } else {
                end++;
            }
        }
        return Math.max(max, uniqSubstr.size());
    }
}
