package solvedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.LongestSubstrWithUniqChars;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstrWithUniqCharsTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("abcbcawbc", 4),
                Arguments.of("bbbb", 1),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("dvdf", 3)
        );
    }

    @ParameterizedTest(name = "Length of longest substring with unique characters of {0} is {1}")
    @MethodSource("provideParameters")
    public void testLongestSubstrWithUniqChars(String string, int expectedResult) {
        assertEquals(expectedResult,
                new LongestSubstrWithUniqChars()
                        .lengthOfLongestSubstring(string));
    }
}
