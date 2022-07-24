public class PerfectSquare {
    public static int numSquares(int n) {
        int min = 0;
        int res = 0;
        int initN = n;
        int initVal = (int) Math.sqrt(n);
        while(min == 0 || min >= res && initVal > 0) {
            int k = initVal;
            while(initN >= 1 && k > 0) {
                if (k * k > initN) {
                    k--;
                    continue;
                }
                initN -= k * k;
                res++;
            }
            if(min != 0 && min < res) {
                break;
            }
            min = res;
            res = 0;
            initN = n;
            initVal--;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(43));
    }
}
