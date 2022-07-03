import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrStrTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("hello", "ll", 2),
                Arguments.of("aaaaa", "bba", -1),
                Arguments.of("aaaaa", "", 0),
                Arguments.of("hello", "ll", 2),
                Arguments.of("hello", "ll", 2)
        );
    }

    @ParameterizedTest(name = "Index of {1} in {0} is {2}")
    @MethodSource("provideParameters")
    public void testStrStr(String haystack, String needle,
                           int expectedResult) {
        assertEquals(expectedResult,
                StrStr.strStr(haystack, needle));
    }
}
