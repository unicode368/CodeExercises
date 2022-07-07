import java.util.Arrays;

public class ReverseString {

    char[] s;

    ReverseString(char[] s) {
        this.s = s;
    }

    public static void reverseString(char[] s) {
        char temp;
        for(int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public void reverseString() {
        char temp;
        for(int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    public char[] getS() {
        return s;
    }
}
