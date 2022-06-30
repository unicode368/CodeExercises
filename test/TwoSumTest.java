import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(Parameterized.class)
public class TwoSumTest {
    int[] nums;
    int target;
    int[] expectedResult;
    String description;

    public TwoSumTest(int[] nums, int target,
                         int[] expectedResult, String description) {
        this.nums = nums;
        this.target = target;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { new int[]{2,7,11,15} , 9, new int[]{0,1}, "Sum is two first numbers" },
                { new int[]{3,4,2} , 6, new int[]{1,2}, "Sum is two last numbers" },
                { new int[]{3,3} , 6, new int[]{0,1}, "Only two numbers of array" },
                { new int[]{3,3} , 7, null, "No such numbers" },
                { new int[]{2,4,15,15,2,7,11,15}, 22, new int[]{2,5}, "Numbers in th middle" },
                { new int[]{2,7,15,15,21,7,1,15}, 22, new int[]{1,2}, "Two occurences" }
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertArrayEquals(expectedResult,
                TwoSum.twoSum(nums, target));
    }
}
