// Striver's SDE Sheet - Linked List 2 - Leetcode Q234 - Java

// 234. Palindrome Linked List

// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
// Example 1:
// Input: head = [1,2,2,1]
// Output: true
// Example 2:
// Input: head = [1,2]
// Output: false
// Constraints:
// The number of nodes in the list is in the range [1, 105].
// 0 <= Node.val <= 9
// Follow up: Could you do it in O(n) time and O(1) space?



// Time:O((n/2) + (n/2) + (n/2))
// Space:O(1)
public class leetcode_234_palindrome_LL {
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head, p,t;

        while(f !=  null && f.next != null){
            s = s.next;
            f = f.next.next;
        }

        p = s; 
        s = s.next; 
        p.next=null;

        while(s != null){
            t = s.next;
            s.next = p;
            p = s;
            s = t;
        }

        f = head;
        s = p;
        while(s != null){
            if(f.val != s.val) return false;
            f = f.next;
            s = s.next;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
