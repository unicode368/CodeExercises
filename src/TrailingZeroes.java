public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int twosCounter = 0;
        int fivesCounter = 0;
        for(int i = n; i > 0; i--) {
            if(i % 5 == 0) {
                fivesCounter++;
            } else if (i % 2 == 0) {
                twosCounter++;
            }
        }
        return Math.max(fivesCounter, twosCounter);
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(50));
    }
}
