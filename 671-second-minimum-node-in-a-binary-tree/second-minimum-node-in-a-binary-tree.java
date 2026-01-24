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
   /* long secondMin=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        dfs(root,root.val);
        return (secondMin==Long.MAX_VALUE)?-1:(int)secondMin;
    }
    public void dfs(TreeNode node,int min){
        if(node==null)return;
        if(node.val>min && node.val<secondMin){
            secondMin=node.val;
        }
        dfs(node.left,min);
        dfs(node.right,min);
    }*/
    public int findSecondMinimumValue(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode node,int minVal){
        if(node==null)return -1;
        if(node.val>minVal)return node.val;
        int left=dfs(node.left,minVal);
        int right=dfs(node.right,minVal);
        if(left==-1)return right;
        if(right==-1)return left;
        return Math.min(left,right);
    }
}