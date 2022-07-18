package solvedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.ContainsDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class ContainsDuplicatesTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, false),
                Arguments.of(new int[]{3,4,2,2,1}, true),
                Arguments.of(new int[]{0}, false),
                Arguments.of(new int[]{3,2,4,5,4,3}, true)
        );
    }

    @ParameterizedTest(name = "{0} has duplicates - {1}")
    @MethodSource("provideParameters")
    public void testContainsDuplicate(int[] nums, boolean expectedResult) {
        assertEquals(expectedResult,
                ContainsDuplicates.containsDuplicate(nums));
    }
}
