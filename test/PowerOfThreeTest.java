import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfThreeTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(27, true),
                Arguments.of(19647, false),
                Arguments.of(1, true),
                Arguments.of(0, false),
                Arguments.of(-3, false)
        );
    }
    @ParameterizedTest(name = "{0} is power of three - {1}")
    @MethodSource("provideParameters")
    public void testIsPowerOfThree(int number, boolean expectedResult) {
        assertEquals(expectedResult,
                PowerOfThree.isPowerOfThree(number));
    }
}
