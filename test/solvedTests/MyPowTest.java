package solvedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.MyPow;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPowTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(2, 10, 1024.0),
                Arguments.of(2, -2, 0.25),
                Arguments.of(0.4485, -5, 55.10458843733151),
                Arguments.of(1, 2147876, 1),
                Arguments.of(-1, 2147876, 1),
                Arguments.of(0, 2147876, 0),
                Arguments.of(2, 2147483647, Double.POSITIVE_INFINITY)
        );
    }

    @ParameterizedTest(name = "{0} to the power of {1} is {2}")
    @MethodSource("provideParameters")
    public void testMyPow(double num, int pow, double expectedResult) {
        assertEquals(expectedResult,
                new MyPow().myPow(num, pow));
    }
}
