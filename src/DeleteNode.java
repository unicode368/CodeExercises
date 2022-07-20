import listUtils.ListNode;
import listUtils.ListUtils;

public class DeleteNode {
    public static void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode curr = node;
        while(curr.next.next != null) {
            curr.val = curr.next.val;
            curr = curr.next;
        }
        curr.val = curr.next.val;
        curr.next = null;
    }

    public static void navigateAndDelete(ListNode head, int val) {
        ListNode curr = head;
        while (curr != null && curr.val != val) {
            curr = curr.next;
        }
        deleteNode(curr);
    }

}
