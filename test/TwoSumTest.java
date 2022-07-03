import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,4,2}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1}),
                Arguments.of(new int[]{3,3}, 7, null),
                Arguments.of(new int[]{2,4,15,15,2,7,11,15}, 22, new int[]{2,5}),
                Arguments.of(new int[]{2,7,15,15,21,7,1,15}, 22, new int[]{1,2})
        );
    }

    @ParameterizedTest(name = "{1} can be created from {0} array by adding indexes - {2}")
    @MethodSource("provideParameters")
    public void testAddTwoNumbers(int[] nums, int target, int[] expectedResult) {
        assertArrayEquals(expectedResult,
                TwoSum.twoSum(nums, target));
    }
}
