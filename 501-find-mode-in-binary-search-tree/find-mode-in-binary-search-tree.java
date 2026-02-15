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
    public int[] findMode(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        inorder(root,list);
        Map<Integer,Integer>map=new HashMap<>();
        int maxFreq=0;

        for(int num:list){
            int freq=map.getOrDefault(num,0)+1;
            map.put(num,freq);
            maxFreq=Math.max(maxFreq,freq);
        }

        List<Integer>mode=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==maxFreq){
                mode.add(key);
            }
        }

        int arr[]=new int[mode.size()];
        for(int i=0;i<mode.size();i++){
            arr[i]=mode.get(i);
        }
        return arr;
    }
    public void inorder(TreeNode root,List<Integer>result){
        if(root==null)return;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}