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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 두 트리의 노드가 null이라면 같은 트리
        if(p == null && q == null) {
            return true;
        }
        
        // 둘 중 하나만 null이라면 다른 트리
        if(p == null || q == null) {
            return false;
        }
        
        if(p.val != q.val) {
            return false;
        } // 두 트리의 노드가 다른 값이라면 다른 트리
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // 트리의 오른쪽과 왼쪽을 검색
    }
}