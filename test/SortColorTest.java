import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2,0,2,1,1,0}, new int[]{0,0,1,1,2,2}),
                Arguments.of(new int[]{2,0,1}, new int[]{0,1,2}),
                Arguments.of(new int[]{2,1,2}, new int[]{1,2,2}),
                Arguments.of(new int[]{1,1,0,0,0}, new int[]{0,0,0,1,1}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest(name = "{0} array sorted by colors - {1}")
    @MethodSource("provideParameters")
    public void testAddTwoNumbers(int[] nums, int[] expectedResult) {
        SortColor sortColor = new SortColor(nums);
        sortColor.sortColors();
        assertArrayEquals(expectedResult,
                sortColor.getUnsortedArray());
    }
}
