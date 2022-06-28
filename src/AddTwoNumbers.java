public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public String toString() {
            String result = val + " ";
            if (next != null) {
                result += next.toString();
            }
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj){
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            ListNode temp = (ListNode) obj;
            return this.toString().equals(temp.toString());
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addUp = 0;
        ListNode result = new ListNode();
        ListNode temp = result;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                temp.val += l2.val;
                l2 = l2.next;
            } else if(l2 == null) {
                temp.val += l1.val;
                l1 = l1.next;
            } else {
                temp.val += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            addUp = 0;
            if(temp.val >= 10) {
                addUp = 1;
                temp.val -= 10;
            }
            if(l1 != null || l2 != null || addUp > 0) {
                temp.next = new ListNode(addUp);
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
