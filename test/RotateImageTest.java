import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2}, {3,4}},
                        new int[][]{{3,1}, {4,2}}),
                Arguments.of(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}},
                        new int[][]{{7,4,1}, {8,5,2}, {9,6,3}}),
                Arguments.of(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}},
                        new int[][]{{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}})
        );
    }

    @ParameterizedTest(name = "{1} can be created from {0} array by adding indexes - {2}")
    @MethodSource("provideParameters")
    public void testAddTwoNumbers(int[][] nums, int[][] expectedResult) {
        RotateImage res = new RotateImage(nums);
        res.rotate();
        assertArrayEquals(expectedResult,
                res.getMatrix());
    }
}
