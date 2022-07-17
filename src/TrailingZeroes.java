public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int twosCounter = 0;
        int fivesCounter = 0;
        int val;
        fivesCounter = n / 5;
        for(int i = n; i > 0; i--) {
            val = i;
            while (val % 2 == 0) {
                twosCounter++;
                val /= 2;
            }
        }
        return Math.min(fivesCounter, twosCounter);
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}
