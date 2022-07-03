package listUtils;

public class ListNodeString extends ListNode {

    public ListNodeString() {super();}
    public ListNodeString(int val) { super(val); }
    ListNodeString(int val, ListNode next) { super(val, next); }

    public String toString() {
        ListNode curr = this;
        var sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val).append(" ");
            curr = curr.next;
        }
        return sb.toString();
    }
}
