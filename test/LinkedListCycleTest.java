import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LinkedListCycleTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3,2,0,-4},
                        1, true),
                Arguments.of(new int[]{-1,2},
                        -1, false),
                Arguments.of(new int[]{1},
                        -1, false)
        );
    }

    @ParameterizedTest(name = "List {0} has cycle in position {1} - {2}")
    @MethodSource("provideParameters")
    public void testHasCycle(int[] list, int pos,
                             boolean expectedResult) {
        assertEquals(expectedResult, LinkedListCycle.hasCycle(
                LinkedListCycle.createList(list, pos)));
    }
}

