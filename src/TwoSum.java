import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Set<Integer>> vals = new HashMap<>();
        or(int i = 0; i < n; i++) {
            Set<Integer> val = vals.get(target - nums[i]);
            if (vals.containsKey(target - nums[i])) {
                return new int[]{val.iterator().next(), i};
            } else {
                Set<Integer> set = vals.computeIfAbsent(nums[i], k -> new HashSet<>());
                set.add(i);
            }
        }
        return null;
    }
}
