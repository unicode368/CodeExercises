public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }

        int n1 = 1;
        int n2 = 2;
        int res = 0;
        int temp;
        for(int i = 2; i < n; i++) {
            res = n1 + n2;
            temp = n2;
            n2 = res;
            n1 = temp;
        }
        return res;
    }
}
