package listUtils;

public class ListUtils {
    public static ListNodeString createList(int[] number) {
        if (number.length == 0) {
            return null;
        }
        ListNodeString result = new ListNodeString();
        ListNode temp = result;
        for (int i = 0; i < number.length; i++) {
            temp.val = number[i];
            if (i != number.length - 1) {
                temp.next = new ListNodeString();
                temp = temp.next;
            }
        }
        return result;
    }

    public static ListNode createListWithCycles(int[] number, int cyclePos) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode cycle = null;
        for (int i = 0; i < number.length; i++) {
            temp.val = number[i];
            if (i == cyclePos) {
                cycle = temp;
            }
            if (i != number.length - 1) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }

        temp.next = cycle;
        return result;
    }
}
