public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] palindrome = s.replaceAll("[^a-zA-Z\\d\\s]", "")
                .replaceAll(" +", "").toLowerCase().toCharArray();
        for (int i = 0; i < palindrome.length - i; i++) {
            if (palindrome[i] !=
                    palindrome[palindrome.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("");
    }
}
