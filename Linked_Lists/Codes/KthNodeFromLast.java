package Linked_Lists.Codes;

public class KthNodeFromLast {
    public static void main(String[] args) {
        
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int k)
    {
    	 Node slow = head;
        Node fast = head;
        
        while(fast != null && k-- > 0) {
            fast = fast.next;
            
        }
        
        if(k > 0) {
            return -1;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
            
        }
        
        return slow.data;
    }
}