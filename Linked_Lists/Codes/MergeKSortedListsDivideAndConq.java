package Linked_Lists.Codes;

public class MergeKSortedListsDivideAndConq {
    public static void main(String[] args) {
        
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists,0,lists.length-1);
    }
    
    public ListNode mergeKLists(ListNode[] lists,int lo, int hi) {
        
        if(lo > hi) {
            return null;
        }
        
        if(lo == hi) {
            return lists[lo];
        }
        
        int mid = lo + (hi-lo)/2;
        ListNode leftHalf = mergeKLists(lists,lo,mid);
        ListNode rightHalf = mergeKLists(lists,mid + 1,hi);
        
        return mergeTwoLists(leftHalf,rightHalf);
    }
    
     public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
         ListNode dummy = new ListNode(-1);
         ListNode tail = dummy;
         
         while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            
            tail = tail.next;
         }
         
         if(head1 != null) tail.next = head1;
         else tail.next = head2;
         
         return dummy.next;
    }
}
