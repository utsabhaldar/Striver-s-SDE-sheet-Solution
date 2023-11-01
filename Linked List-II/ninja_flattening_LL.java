// Striver's SDE Sheet - Linked List 2 - Coding Ninja - Flattening a Linked List - Java

// Flattening a Linked List

// Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
// (i) a next pointer to the next node,
// (ii) a child pointer to a linked list where this node is head.
// Each of the sub-linked-list is in sorted order.
// Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order.
// Try solving this in O(n*n*k), where ‘n’ denotes the number of head nodes and ‘k’ is the average number of child nodes in all 'n' sub-lists.     
// Try solving this without using any extra space. 
// 1 <= n <= 100
// 1 <= k <= 20
// 1 <= Node.data <= 10^9
// Time Limit: 1 sec



// Time:O(n) {n=sum of nodes in LL}
// Space:O(1)
public class ninja_flattening_LL {
    
    public static Node merge(Node a, Node b){
        Node tmp = new Node(0);
        Node ans = tmp;
        
        while(a!=null && b!=null){
            if(a.data < b.data){
                tmp.child = a;
                tmp = tmp.child;
                a = a.child;
            }
            else{
                tmp.child = b;
                tmp = tmp.child;
                b = b.child;
            }
        }
        
        if(a != null) tmp.child = a;
        else tmp.child = b;
        
        return ans.child; 
    }
    public static Node flattenLinkedList(Node head) {
        if(head == null || head.next == null) return head;
	    
	    Node x = flattenLinkedList(head.next);
        head.next = null;
	    Node res = merge(head, x);

	    return res;
    }
}

class Node {
    int data;
    Node child;
    Node next;

    public Node(int data) {
        this.data = data;
        this.child = null;
        this.next = null;
    }
}
