package solvedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.TrailingZeroes;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrailingZeroesTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(5, 1),
                Arguments.of(25, 6),
                Arguments.of(26, 6),
                Arguments.of(125, 31),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest(name = "Number of trailing zeroes for {0}! - {1}")
    @MethodSource("provideParameters")
    public void testTrailingZeroes(int fact, int expectedResult) {
        assertEquals(expectedResult,
                new TrailingZeroes().trailingZeroes(fact));
    }
}
