class Solution29 {
    public void reorderList(ListNode head) {

        if (head == null) return;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode t = first.next;
            first.next = second;
            first = t;

            t = second.next;
            second.next = first;
            second = t;
        }
    }
}