import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int start = 0;
        int j = 0;
        for(int i = 0; i < wordDict.size(); i++) {
            if (start + j >= s.length()) {
                break;
            }
            String word = wordDict.get(i);
            while(j < word.length()) {
                if(s.charAt(start + j) != word.charAt(j)) {
                    return false;
                }
                j++;
            }
            start += word.length();
            if(i == wordDict.size() - 1 && start + j < s.length()) {
                i = -1;
            }
            j = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("apple");
        s.add("pen");
        wordBreak("applepenapple", s);
    }
}
