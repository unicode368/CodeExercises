public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fastPointer = head;
        do {
            if(head == null || head.next == null
                    || fastPointer == null) {
                return false;
            }
            head = head.next;
            fastPointer = fastPointer.next == null ? null :
                    fastPointer.next.next;
        } while(head != fastPointer);

        return true;
    }

    public static ListNode createList(int[] number, int pos) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode cycle = null;
        for (int i = 0; i < number.length; i++) {
            temp.val = number[i];
            if (i == pos) {
                cycle = temp;
            }
            if (i != number.length - 1) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        if (cycle == null) {
            return result;
        } else {
            temp.next = cycle;
        }
        return result;
    }
}
