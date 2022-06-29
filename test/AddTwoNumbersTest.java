import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AddTwoNumbersTest {


    @Test
    public void testSameSizes() {
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{2,4,3});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{5,6,4});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                AddTwoNumbers.createList(new int[]{7,0,8}).toString());
    }

    @Test
    public void testDifferentSizes() {
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{9,9,9,9,9,9,9});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{9,9,9,9});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                AddTwoNumbers.createList(new int[]{8,9,9,9,0,0,0,1}).toString());
    }

    @Test
    public void testZeros() {
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{0});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{0});
        Assertions.assertEquals(AddTwoNumbers.addTwoNumbers(l1, l2).toString(),
                AddTwoNumbers.createList(new int[]{0}).toString());
    }
}
