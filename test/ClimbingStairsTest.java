import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.PowerOfThree;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(4, 5),
                Arguments.of(5, 8),
                Arguments.of(6, 13)
        );
    }
    @ParameterizedTest(name = "Ways to climb {0} stairs - {1}")
    @MethodSource("provideParameters")
    public void testClimbStairs(int number, int expectedResult) {
        assertEquals(expectedResult,
                new ClimbingStairs().climbStairs(number));
    }
}
