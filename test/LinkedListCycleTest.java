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
        int[][] params = new int[][] {
                new int[]{3,2,0,-4},
                new int[]{-1,2},
                new int[]{1},
        };
        return Stream.of(
                Arguments.of(LinkedListCycle.createList(params[0], 1),
                        Arrays.toString(params[0]), 1, true),
                Arguments.of(LinkedListCycle.createList(params[1], -1),
                        Arrays.toString(params[1]), -1, false),
                Arguments.of(LinkedListCycle.createList(params[2], -1),
                        Arrays.toString(params[2]), -1, false)
        );
    }

    @ParameterizedTest(name = "List {1} has cycle in position {2} - {3}")
    @MethodSource("provideParameters")
    public void testHasCycle(LinkedListCycle.ListNode list, String str, int pos,
                             boolean expectedResult) {
        assertEquals(expectedResult, LinkedListCycle.hasCycle(list));
    }
}

