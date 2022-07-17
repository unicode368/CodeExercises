import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAndSayTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "11"),
                Arguments.of(3, "21"),
                Arguments.of(4, "1211"),
                Arguments.of(10, "13211311123113112211")
        );
    }

    @ParameterizedTest(name = "CountAnsSay({0}) = {1}")
    @MethodSource("provideParameters")
    public void testAddTwoNumbers(int num, String expectedResult) {
        assertEquals(expectedResult,
                new CountAndSay().countAndSay(num));
    }
}
