public class CountAndSay {
    public static String countAndSay(int n) {
        int count = 1;
        int j = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                res.append("1");
            } else {
                String s = res.toString();
                do {
                    if(j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                        ++count;
                    } else {
                        res.insert(0, count);
                        count = 1;
                    }
                    ++j;
                } while (j < s.length() - 1);
                j = 0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        countAndSay(3);
    }
}
