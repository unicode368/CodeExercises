public class MyPow {
    public static double myPow(double x, int n) {
        if(x == 1.0 || x == 0.0) {
            return x;
        } else if(x == -1) {
            return -1 * (n % 2 == 0 ? -1 : 1);
        }
        double res = myPowDividedByTwo(x, n);
        if(n < 0) {
            return 1 / res;
        } else {
            return res;
        }
    }

    public static double myPowDividedByTwo(double x, int n) {
        if(x == 1.0 || x == 0.0) {
            return x;
        }
        if (n == 0) {
            return 1;
        }

        double res = myPowDividedByTwo(x, n / 2);
        res = res * res;

        if (n % 2 != 0) {
            res = x * res;
        }
        return res;
    }
}
