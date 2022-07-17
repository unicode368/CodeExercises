import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new char[]{'h','e','l','l', 'o'}, new char[]{'o','l','l','e', 'h'}),
                Arguments.of(new char[]{'a','b','c','d', 'e', 'f'},
                        new char[]{'f','e','d','c', 'b', 'a'}),
                Arguments.of(new char[]{'h', 'e'}, new char[]{'e','h'}),
                Arguments.of(new char[]{'h'}, new char[]{'h'}),
                Arguments.of(new char[]{'a', 'b', 'b', 'a'}, new char[]{'a', 'b', 'b', 'a'})
        );
    }

    @ParameterizedTest(name = "Reverse of {0} is {1}")
    @MethodSource("provideParameters")
    public void testReverseString(char[] string, char[] expectedResult) {
        ReverseString actual = new ReverseString(string);
        actual.reverseString();
        assertArrayEquals(expectedResult, actual.getS());
    }
}
