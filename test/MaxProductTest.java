import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3,-1,-2}, 3),
                Arguments.of(new int[]{-3,-1,-4}, 4),
                Arguments.of(new int[]{-2,0,-1}, 0),
                Arguments.of(new int[]{-2,0,1}, 1)
        );
    }
    @ParameterizedTest(name = "Max product for array {0} is {1}")
    @MethodSource("provideParameters")
    public void testMaxProduct(int[] array, int expectedResult) {
        assertEquals(expectedResult,
                new MaxProduct().maxProduct(array));
    }
}
