import listUtils.ListNode;
import listUtils.ListNodeString;

public class MergeTwoSortedLists {

    public static ListNodeString mergeTwoLists(ListNode list1, ListNode list2) {
        ListNodeString result = new ListNodeString();
        ListNode temp = result;
        if(list1 == null && list2 == null) {
            return null;
        }
        while(list1 != null || list2 != null) {
            if (list2 == null ||
                    list1 != null && list1.val <= list2.val) {
                temp.val = list1.val;
                list1 = list1.next;
            } else {
                temp.val = list2.val;
                list2 = list2.next;
            }

            if(list1 != null || list2 != null) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return result;
    }
}
