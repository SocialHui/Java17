import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {
//递增顺序查找二叉树
    class TreeNode {
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


    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            newTree(root,list);
            TreeNode current = new TreeNode(list.get(0));
            TreeNode res = current;
            for (int i = 1; i < list.size(); i++) {
                TreeNode right = new TreeNode(list.get(i));
                current.left = null;
                current.right = right;
                current = current.right;
            }
            return res;
        }

        public void newTree(TreeNode node , List<Integer> list) {
            if (node == null) return;
            newTree (node.left, list);
            list.add(node.val);
            newTree(node.right,list);
        }
    }

}
