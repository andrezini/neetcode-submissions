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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> tn = new LinkedList<>();
        tn.offer(root);
        while(!tn.isEmpty()){
            int levelSize = tn.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i<levelSize; i++){
                TreeNode currentNode = tn.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    tn.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    tn.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }


        return result;
    }
}
