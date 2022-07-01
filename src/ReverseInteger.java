public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        int mod = Math.abs(x);
        int i = (int) Math.log10(mod);
        if(i == 0 && (mod > 10 || mod < -10)) {
            return 0;
        }
        while(x != 0 && i >= 0) {
            res += (x % 10) * Math.pow(10, i);
            x /= 10;
            i--;
        }
        if(res > 2147483647 ||
                res < -2147483648) {
            return 0;
        } else {
            return (int) res;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
        //System.out.println(Math.abs(-1));
    }
}
