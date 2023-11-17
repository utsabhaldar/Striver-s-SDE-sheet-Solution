// Striver's SDE Sheet - Binary Trees 1 - Leetcode - Java

// 144. Binary Tree Preorder Traversal

// Given the root of a binary tree, return the preorder traversal of its nodes' values.
// Example 1:
// Input: root = [1,null,2,3]
// Output: [1,2,3]
// Constraints:
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100



// Time:O(n)
// Space:O(n)
import java.util.*;

public class Q144_preorder_traversal {
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

    private void preorder(TreeNode root, List<Integer> ans){
        if(root != null){
            ans.add(root.val);
            preorder(root.left, ans);
            preorder(root.right, ans);
        }
    }
        
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);
        return ans;
    }
}
