import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class MergeTwoSortedListsTest {
    MergeTwoSortedLists.ListNode list1;
    MergeTwoSortedLists.ListNode list2;
    MergeTwoSortedLists.ListNode expectedResult;
    String description;

    public MergeTwoSortedListsTest(MergeTwoSortedLists.ListNode list1,
                                   MergeTwoSortedLists.ListNode list2,
                                   MergeTwoSortedLists.ListNode expectedResult,
                                   String description) {
        this.list1 = list1;
        this.list2 = list2;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { MergeTwoSortedLists.createList(new int[]{1,2,4}) ,
                        MergeTwoSortedLists.createList(new int[]{1,3,4}) ,
                        MergeTwoSortedLists.createList(new int[]{1,1,2,3,4,4}) ,
                        "Two plain lists" },
                { null , null , null , "Two lists are null" },
                { null , MergeTwoSortedLists.createList(new int[]{0}) ,
                        MergeTwoSortedLists.createList(new int[]{0}) ,
                        "One list is null, second is not" }
        });
    }

    @Test
    public void testMergeLists() {
        System.out.println(description);
        MergeTwoSortedLists.ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(expectedResult != null ? expectedResult.toString() : "",
                result != null ? result.toString() : "");
    }
}
