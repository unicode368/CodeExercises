import listUtils.ListNode;
import listUtils.ListUtils;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode temp = result;
        while(l1 != null || l2 != null || carry > 0) {
            var v1 = l1 == null ? 0 : l1.val;
            var v2 = l2 == null ? 0 : l2.val;
            var v = carry + v1 + v2;
            temp.val = v % 10;
            carry = v / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if(l1 != null || l2 != null || carry > 0) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        return result;
    }

}
