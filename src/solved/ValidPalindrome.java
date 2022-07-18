package solved;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(s.charAt(i))
                    != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("");
    }
}
