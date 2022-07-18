import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReverseIntegerTest {

    public static Stream<Arguments> getNumsAndReverse() {
        return Stream.of(
                Arguments.of( 123 , 321),
                Arguments.of( -123 , -321),
                Arguments.of( 9 , 9),
                Arguments.of( 0 , 0),
                Arguments.of( -2147483648 , 0)
        );
    }

    @ParameterizedTest(name = "Reverse of {0} is {1}")
    @MethodSource("getNumsAndReverse")
    public void testReverseNumber(int number, int expectedResult) {
        assertEquals(expectedResult,
                ReverseInteger.reverse(number));
    }
}
