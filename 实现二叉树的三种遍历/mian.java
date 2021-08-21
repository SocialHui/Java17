import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    
    List<Integer> pre = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    List<Integer> post = new ArrayList<>();
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if (root == null) {
            return new int[][]{{}};
        }
        List<List<Integer>> list = new ArrayList<>();
        preOrder(root);
        inOrder(root);
        postOrder(root);
        int[][] res = new int[3][pre.size()];
        for (int j = 0; j < pre.size(); j++) {
            res[0][j] = pre.get(j);
            res[1][j] = in.get(j);
            res[2][j] = post.get(j);
        }
        return res;
    }
    
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        pre.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        in.add(node.val);
        inOrder(node.right);
    }
    
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        post.add(node.val);
    }
}