import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            var idx = indexMap.get(target - nums[i]);
            if(idx != null) {
                return new int[] { idx, i };
            }
            indexMap.putIfAbsent(nums[i], i);
        }
        return null;
    }
}
