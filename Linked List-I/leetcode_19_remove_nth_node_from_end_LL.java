// Striver's SDE Sheet - Linked List 1 - Leetcode Q19 - Java

// 19. Remove Nth Node From End of List

// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Example 1:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:
// Input: head = [1], n = 1
// Output: []
// Example 3:
// Input: head = [1,2], n = 1
// Output: [1]
 
// Constraints:
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
 
// Follow up: Could you do this in one pass?



// Time:O(n)
// Space:O(1)
public class leetcode_19_remove_nth_node_from_end_LL {
    
    /*
      
        public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = head;
        ListNode f = head;
        for(int i=0; i<n; i++) f = f.next;
        if(f == null) return head.next;
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return head;
        }

    */
}
