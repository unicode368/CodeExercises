public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public String toString() {
            var curr = this;
            var sb = new StringBuilder();
            while (curr != null) {
                sb.append(curr.val).append(" ");
                curr = curr.next;
            }
            return sb.toString();
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
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

    public static ListNode createList(int[] number) {
        ListNode result = new ListNode();
        ListNode temp = result;
        for (int i = 0; i < number.length; i++) {
            temp.val = number[i];
            if (i != number.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return result;
    }
}
