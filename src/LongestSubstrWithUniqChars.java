import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstrWithUniqChars {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> uniqSubstr = new HashMap<>();
        int i = 0;
        int max = 0;
        while (i < s.length()) {
            if (uniqSubstr.size() > 0 && uniqSubstr.putIfAbsent(s.charAt(i), i) != null) {
                if (max < uniqSubstr.size()) {
                    max = uniqSubstr.size();
                }
                uniqSubstr = new HashMap<>();
                if(s.charAt(i - 1) == s.charAt(i)) {

                }
            } else {
                uniqSubstr.put(s.charAt(i), i);
                i++;
            }
        }
        return Math.max(max, uniqSubstr.size());
    }
}
