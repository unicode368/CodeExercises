public class StrStr {
    public static int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int haystackLength = haystackChars.length;
        int needleLength = needleChars.length;
        if(needleLength == 0) {
            return 0;
        } else if(haystackLength == 0) {
            return -1;
        }
        int intermediateVar;
        boolean fullOccurence = true;
        for(int i = 0; haystackLength - i >= needleLength; i++) {
            if(haystackChars[i] == needleChars[0]) {
                for(intermediateVar = 1; intermediateVar < needleLength;
                    intermediateVar++) {
                    if (haystackChars[i + intermediateVar]
                            != needleChars[intermediateVar]) {
                        fullOccurence = false;
                    }
                }
                if (fullOccurence) {
                    return i;
                }
                fullOccurence = true;
            }
        }
        return -1;
    }
}
