package Linked_Lists.Codes;

public class StartingPointOfALoop {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break;
        }
        
        if(fast == null || fast.next == null) return null;
        
        ListNode curr1 = head;
        ListNode curr2 = slow;
        
        while(curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr1;
    }
}
