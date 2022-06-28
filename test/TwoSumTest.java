import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TwoSumTest {
    @Test
    public void testNine() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{0,1},
                TwoSum.twoSum(nums, target));
    }

    @Test
    public void testSixTwoEdgy() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{1,2},
                TwoSum.twoSum(nums, target));
    }

    @Test
    public void testSixWithTwoOnly() {
        int[] nums = new int[]{3,3};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{0,1},
                TwoSum.twoSum(nums, target));
    }

    @Test
    public void testAbsent() {
        int[] nums = new int[]{3,3};
        int target = 1;
        Assertions.assertNull(TwoSum.twoSum(nums, target));
    }
}
