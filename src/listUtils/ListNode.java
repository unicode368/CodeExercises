package listUtils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
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
