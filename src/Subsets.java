import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        int start = 0;
        int end = 0;
        List<Integer> resElement;
        List<List<Integer>> res = new ArrayList<>();
        do {
            resElement = new ArrayList<>();
            for(int i = start; i < end; i++) {
                resElement.add(nums[i]);
            }
            res.add(resElement);
            ++end;
        } while (end <= nums.length);
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = subsets(new int[]{1,2,3});
        for (List<Integer> arrEl : arr) {
            System.out.println(Arrays.toString(arrEl.toArray()));
        }
    }
}
