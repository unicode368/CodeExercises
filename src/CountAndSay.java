public class CountAndSay {
    public String countAndSay(int n) {
        int count = 0;
        int start = 0;
        int end = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                res.append("1");
            } else {
                String s = res.toString();
                res = new StringBuilder();
                while (end < s.length()) {
                    if(s.charAt(start) == s.charAt(end)) {
                        ++count;
                        ++end;
                    } else {
                        res.append(count);
                        res.append(s.charAt(start));
                        start = end;
                        count = 0;
                    }
                }
                res.append(count);
                res.append(s.charAt(start));
                start = 0;
                end = start;
                count = 0;
            }
        }
        return res.toString();
    }
}
