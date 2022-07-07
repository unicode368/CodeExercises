public class MyPow {
    public static double myPow(double x, int n) {
        if(x == 1.0 || x == 0.0) {
            return x;
        }
        double base = x;
        if(n > 0) {
            while(n > 1 && (x <= 10000 && Math.abs(base) > 1 || Math.abs(x) > .0000000001) ) {
                x *= base;
                --n;
            }
        } else {
            while(n <= 0 && (x <= 10000 && Math.abs(base) > 1|| Math.abs(x) > 0.0000000001)) {
                x /= base;
                ++n;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2147483648));
    }
}
