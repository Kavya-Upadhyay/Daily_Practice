// Last updated: 7/31/2025, 12:21:31 PM
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
    private int i;
    private Map<Integer,Integer>inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        i=0;
        inorderMap = new HashMap<>();
        for(int idx=0;idx<inorder.length;idx++){
            inorderMap.put(inorder[idx],idx);
        }
        return helper(preorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int j,int k){
        if(j>k){
            return null;
        }
        int nodeVal=preorder[i++];
        TreeNode node = new TreeNode(nodeVal);
        int idx = inorderMap.get(nodeVal);
        node.left = helper(preorder, j, idx - 1);
        node.right = helper(preorder, idx + 1, k);
        
        return node;
    }
}