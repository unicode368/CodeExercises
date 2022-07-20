import listUtils.ListNodeString;
import listUtils.ListUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solved.ContainsDuplicates;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteNodeTest {
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(ListUtils.createList(new int[]{4,5,1,9}), 5,
                        ListUtils.createList(new int[]{4,1,9})),
                Arguments.of(ListUtils.createList(new int[]{4,5,1,9}), 1,
                        ListUtils.createList(new int[]{4,5,9})),
                Arguments.of(ListUtils.createList(new int[]{4,5,1,9}), 6,
                        ListUtils.createList(new int[]{4,5,1,9})),
                Arguments.of(ListUtils.createList(new int[]{}), 5,
                        ListUtils.createList(new int[]{}))
        );
    }

    @ParameterizedTest(name = "{0} list after deletion of {1} - {2}")
    @MethodSource("provideParameters")
    public void testDeleteNode(ListNodeString head, int val,
                               ListNodeString expectedResult) {
        DeleteNode res = new DeleteNode(head);
        res.navigateAndDelete(val);
        assertEquals(expectedResult == null ? null : expectedResult.toString(),
                res.head == null ? null :res.head.toString());
    }
}
