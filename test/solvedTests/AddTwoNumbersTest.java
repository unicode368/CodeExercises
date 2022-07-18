package solvedTests;

import listUtils.ListNode;
import listUtils.ListUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import solved.AddTwoNumbers;

public class AddTwoNumbersTest {


    @Test
    public void testSameSizes() {
        ListNode l1 = ListUtils.createList(new int[]{2,4,3});
        ListNode l2 = ListUtils.createList(new int[]{5,6,4});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                ListUtils.createList(new int[]{7,0,8}).toString());
    }

    @Test
    public void testDifferentSizes() {
        ListNode l1 = ListUtils.createList(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = ListUtils.createList(new int[]{9,9,9,9});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                ListUtils.createList(new int[]{8,9,9,9,0,0,0,1}).toString());
    }

    @Test
    public void testZeros() {
        ListNode l1 = ListUtils.createList(new int[]{0});
        ListNode l2 = ListUtils.createList(new int[]{0});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                ListUtils.createList(new int[]{0}).toString());
    }
}
