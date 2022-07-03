import listUtils.ListNode;

public class LinkedListCycle {
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

}
