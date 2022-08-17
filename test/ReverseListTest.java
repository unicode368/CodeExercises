import listUtils.ListNode;
import listUtils.ListNodeString;
import listUtils.ListUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(ListUtils.createList(new int[]{1,2,3,4,5}),
                        ListUtils.createList(new int[]{5,4,3,2,1})),
                Arguments.of(ListUtils.createList(new int[]{1,2}),
                        ListUtils.createList(new int[]{2,1})),
                Arguments.of(ListUtils.createList(new int[]{1}),
                        ListUtils.createList(new int[]{1})),
                Arguments.of(ListUtils.createList(new int[]{}),
                        ListUtils.createList(new int[]{}))
        );
    }

    @ParameterizedTest(name = "{0} list after reverse - {1}")
    @MethodSource("provideParameters")
    public void testReverseList(ListNodeString head, ListNodeString expectedResult) {
        ListNodeString res = new ReverseList().reverseList(head);
        assertEquals(res == null ? null : res.toString(),
                expectedResult == null ? null : expectedResult.toString());
    }
}
