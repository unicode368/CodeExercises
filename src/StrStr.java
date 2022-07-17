public class StrStr {
    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        boolean fullOccurence = true;
        int i = 0;
        try {
            for(i = 0; i <= haystackLength - needleLength; i++) {
                if(haystack.charAt(i) == needle.charAt(0)) {
                    for(int j = 1; j < needleLength && i + j < haystackLength; j++) {
                        if (haystack.charAt(i + j)
                                != needle.charAt(j)) {
                            fullOccurence = false;
                            break;
                        }
                    }
                    if (fullOccurence) {
                        return i;
                    }
                    fullOccurence = true;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            if (needle.length() == 0) {
                return i;
            }
        }

        return -1;
    }

}
