public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n <= 0) {
            return false;
        }

        while(n % 3 == 0 && n > 3) {
            n /= 3;
        }

        return n == 1 || n % 3 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
