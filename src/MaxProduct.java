public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int max = 0;
        int res = 1;
        int i;
        for(i = 0; i < nums.length - 1; i++) {
            res *= nums[i];
            if(nums[i] > nums[i + 1]) {
                if(max < res) {
                    max = res;
                }
                res = 1;
            }
        }
        if(i == 0) {
            max = nums[i];
        } else if(i == nums.length - 1 && nums[i - 1] <= nums[i]) {
            res *= nums[i];
            if(max < res) {
                max = res;
            }
        }
        return max;
    }

    public static void main(String[] args) {
       maxProduct(new int[]{-3,-1,-1});
    }
}
