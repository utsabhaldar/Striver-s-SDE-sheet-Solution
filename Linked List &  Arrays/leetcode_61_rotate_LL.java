// Striver's SDE Sheet - Linked List & Arrays - Leetcode Q61 - Java

// 61. Rotate List

// Given the head of a linked list, rotate the list to the right by k places.
// Example 1:
// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:
// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
// Constraints:
// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109



// Time:O(n) + O(n – (n%k)) [n is Length of List]
// Space:O(1)
public class leetcode_61_rotate_LL {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null) return head;

        ListNode cur = head; int len = 1;
        while(cur.next != null){
            len++; 
            cur = cur.next;
        }

        cur.next = head;
        k = k%len;
        k = len-k;
        while(k-- > 0) cur = cur.next;

        head = cur.next;
        cur.next = null;
        return head;
    }


    // This is ListNode  class. Not part of Solution in Leetcode.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
