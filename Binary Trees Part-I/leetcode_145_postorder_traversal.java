// Striver's SDE Sheet - Binary Trees 1 - Leetcode - Java

// 145. Binary Tree Postorder Traversal

// Given the root of a binary tree, return the postorder traversal of its nodes' values.
// Example 1:
// Input: root = [1,null,2,3]
// Output: [3,2,1]
// Constraints:
// The number of the nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100



// Time:O(n)
// Space:O(n)
import java.util.*;

public class leetcode_145_postorder_traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private void postorder(TreeNode root, List<Integer> ans){
        if(root != null){
            postorder(root.left, ans);
            postorder(root.right, ans);
            ans.add(root.val);
        }
    }
        
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        postorder(root, ans);
        return ans;
    }
}
