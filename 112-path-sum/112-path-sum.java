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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 트리노드가 비어있다면 false 리턴
        if(root == null){
            return false;
        }
        
        int temp = targetSum - root.val;
        
        // 이진트리를 끝까지 탐색하고, temp가 0이라면 targetSum을 달성하는 방법이 있는 것이므로 true를 리턴
        if(temp == 0 && root.left == null && root.right == null){
            return true;
        }
        
        // 아직 마지막 자식노드까지 도달하지 못했다면 hasPathSum 메소드를 재귀적으로 실행시켜 이진트리를 탐색진행
        return hasPathSum(root.left, temp) || hasPathSum(root.right, temp);
        

    }
}