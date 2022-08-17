import listUtils.ListNode;
import listUtils.ListNodeString;

public class ReverseList {

    ReverseList() {

    }
    public ListNodeString reverseList(ListNodeString head) {
        if (head == null) {
            return null;
        }
        return reverse(new ListNodeString(), head);
    }

    public ListNodeString reverse(ListNodeString reverse, ListNode head) {
        if (head.next == null) {
            reverse.val = head.val;
        } else {
            reverse(reverse, head.next);
            head.next = null;
            ListNode cur = reverse;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = head;
        }

        return reverse;
    }

}
