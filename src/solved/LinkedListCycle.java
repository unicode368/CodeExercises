package solved;

import listUtils.ListNode;
import listUtils.ListUtils;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fastPointer = head;
        do {
            head = head.next;
            fastPointer = fastPointer.next == null ? null :
                    fastPointer.next.next;
        } while(head != fastPointer && fastPointer != null);

        return fastPointer != null;
    }

    public static void main(String[] args) {
        hasCycle(ListUtils.createListWithCycles(new int[]{3,2,0,4}, 1));
    }

}
