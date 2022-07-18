public class MyPow {
    public static double myPow(double x, int n) {
        if(x == 1.0 || x == 0.0) {
            return x;
        } else if(x == -1) {
            return -1 * (n % 2 == 0 ? -1 : 1);
        }
        double base = x;
        if(n == 0) {
            return 1.0;
        } else if(n > 0) {
            while(n > 1 && (x <= 10000 && Math.abs(base) > 1 || Math.abs(x) > .0000000001)) {
                x *= base;
                --n;
            }
        } else {
            while(n < -1) {
                x *= base;
                ++n;
            }
            x = 1/x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.44894,-5));
    }
}
