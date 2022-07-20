import listUtils.ListNodeString;
import listUtils.ListUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class MergeTwoSortedListsTest {
    ListNodeString list1;
    ListNodeString list2;
    ListNodeString expectedResult;
    String description;

    public MergeTwoSortedListsTest(ListNodeString list1,
                                   ListNodeString list2,
                                   ListNodeString expectedResult,
                                   String description) {
        this.list1 = list1;
        this.list2 = list2;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection lists() {
        return Arrays.asList(new Object[][] {
                { ListUtils.createList(new int[]{1,2,4}) ,
                        ListUtils.createList(new int[]{1,3,4}) ,
                        ListUtils.createList(new int[]{1,1,2,3,4,4}) ,
                        "Two plain lists" },
                { null , null , null , "Two lists are null" },
                { null , ListUtils.createList(new int[]{0}) ,
                        ListUtils.createList(new int[]{0}) ,
                        "One list is null, second is not" }
        });
    }

    @Test
    public void testMergeLists() {
        System.out.println(description);
        ListNodeString result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(expectedResult != null ? expectedResult.toString() : "",
                result != null ? result.toString() : "");
    }
}
