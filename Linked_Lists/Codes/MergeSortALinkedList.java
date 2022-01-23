package Linked_Lists.Codes;

public class MergeSortALinkedList {
    public ListNode sortList(ListNode head) {
        return helper(head);
     }
     
     public ListNode helper(ListNode head) {
         
         if(head == null || head.next == null) {
             return head;
         }
         
         ListNode mid = getMiddle(head);
         ListNode list2 = mid.next;
         mid.next = null;
         
         ListNode list1 = head;
         
         ListNode leftSortedList = helper(list1);
         ListNode rightSortedList = helper(list2);
         
       return  mergeTwoLists(leftSortedList, rightSortedList);
     }
     
     public ListNode getMiddle(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
         ListNode prev = null;
         
         while(fast != null && fast.next != null) {
             prev = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
         
         if(fast == null) return prev; //this is even case
         return slow;
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
