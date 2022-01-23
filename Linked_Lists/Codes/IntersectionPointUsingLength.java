package Linked_Lists.Codes;

public class IntersectionPointUsingLength {
    public int getSize(ListNode head) {
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        
        return size;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        
        if(sizeA > sizeB) {
            for(int i=0;i<sizeA-sizeB;i++)
                headA = headA.next;
        } else {
            for(int i=0;i<sizeB-sizeA;i++)
                headB = headB.next;
        }
        
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}
