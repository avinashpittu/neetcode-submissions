/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSame(TreeNode val1, TreeNode val2){
        if(val1 == null && val2 ==null)
            return true;
        if(val1 == null && val2 != null)
            return false;
        if(val1 != null && val2 == null)
            return false;
        if(val1.val == val2.val){ 
            return isSame(val1.left, val2.left) && isSame(val1.right, val2.right);
        }
        else
            return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return isSame(p,q);
        
    }
}
