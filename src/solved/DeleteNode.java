package solved;

import listUtils.ListNode;
import listUtils.ListNodeString;

public class DeleteNode {
    public ListNodeString head;

    public DeleteNode(ListNodeString head) {
        this.head = head;
    }

    public void deleteNode(ListNode node) {
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

    public void navigateAndDelete(int val) {
        ListNode curr = head;
        while (curr != null && curr.val != val) {
            curr = curr.next;
        }
        deleteNode(curr);
    }

}
