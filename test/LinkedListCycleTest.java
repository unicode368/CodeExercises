import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class LinkedListCycleTest {
    LinkedListCycle.ListNode list;
    boolean expectedResult;
    String description;

    public LinkedListCycleTest(LinkedListCycle.ListNode list, boolean expectedResult,
                        String description) {
        this.list = list;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { LinkedListCycle.createList(new int[]{3,2,0,-4}, 1) , true, "Has cycle" },
                { LinkedListCycle.createList(new int[]{-1,2}, -1) , false, "Doesn't have cycle" },
                { LinkedListCycle.createList(new int[]{1}, -1) , false, "One element" }
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult, LinkedListCycle.hasCycle(list));
    }
}

