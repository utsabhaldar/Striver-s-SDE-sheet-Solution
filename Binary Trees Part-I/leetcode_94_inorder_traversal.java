// Striver's SDE Sheet - Binary Trees 1 - Leetcode - Java

// 94. Binary Tree Inorder Traversal

// Given the root of a binary tree, return the inorder traversal of its nodes' values.
// Example 1:
// Input: root = [1,null,2,3]
// Output: [1,3,2]
// Constraints:
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100



// Time:O(n)
// Space:O(n)
import java.util.*;

public class leetcode_94_inorder_traversal {
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

    private void inorder(TreeNode root, List<Integer> ans){
        if(root != null){
            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right, ans);
        }
    }
        
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);
        return ans;
    }
}
