package Linked_Lists.Codes;

public class LengthOfLoop {
    static int countNodesinLoop(Node head)
    {
        
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break;
        }
        
        if(fast == null || fast.next == null) return 0;
        
        Node curr1 = head;
        Node curr2 = slow;
        
        while(curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        Node p = curr1;
        int dist = 1;
        p = p.next;
        while(p != curr1) {
            p = p.next;
            dist +=1;
        }
        
        return dist;
    }
}
