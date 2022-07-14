public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int counter = 0;
        int mul = 1;
        for(int i = n; i > 0; i--) {
            if(i % 5 == 0) {
                mul = i * (i - 1);
                while(mul % 10 == 0) {
                    mul /= 10;
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(50));
    }
}
