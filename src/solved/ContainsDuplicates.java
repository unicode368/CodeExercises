package solved;

import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqNumbers = new HashSet<>();
        for (int num : nums) {
            if (!uniqNumbers.add(num)) {
                return true;
            }
        }
        return false;
    }
}
