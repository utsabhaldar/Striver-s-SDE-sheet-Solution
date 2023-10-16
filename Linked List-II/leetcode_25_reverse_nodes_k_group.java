// Striver's SDE Sheet - Linked List 2 - Leetcode Q25 - Java

// 25. Reverse Nodes in k-Group

// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
// You may not alter the values in the list's nodes, only nodes themselves may be changed.
// Example 1:
// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]
// Example 2:
// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]
// Constraints:
// The number of nodes in the list is n.
// 1 <= k <= n <= 5000
// 0 <= Node.val <= 1000
// Follow-up: Can you solve the problem in O(1) extra memory space?



// Time:O(n)
// Space:O(1)
public class leetcode_25_reverse_nodes_k_group {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int cnt = 0;
        while(curr!=null && cnt != k){
            curr = curr.next;
            cnt++;
        }
        if(cnt == k){
            curr = reverseKGroup(curr, k);
            while(cnt >0){
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
                cnt--;
            }
            head = curr;
        }
        return head;
    }
}
