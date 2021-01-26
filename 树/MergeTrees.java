public class MergeTrees {
    //合并二叉树

    class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;
        TreeNode1() {}
        TreeNode1(int val) { this.val = val; }
        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution1 {
        public TreeNode1 mergeTrees(TreeNode1 t1, TreeNode1 t2) {
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
            TreeNode1 merged = new TreeNode1(t1.val + t2.val);
            merged.left = mergeTrees(t1.left, t2.left);
            merged.right = mergeTrees(t1.right, t2.right);
            return merged;
        }
    }
}


/**
 * 错误的代码
 *
 class Solution1 {
 TreeNode node = new TreeNode();
 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
 newTree(t1,t2);
 return t1;
 }

 public void newTree(TreeNode t1, TreeNode t2) {
 //先序遍历
 if (t1 == null && t2 == null || t1 != null && t2 == null || t1 == null && t2 != null) return;

 TreeNode node = new TreeNode(t1.val + t2.val);

 if (t1.left == null && t2.left != null) {
 t1.left = t2.left;
 return;
 }

 newTree(t1.left,t2.left);
 newTree(t1.right,t2.right);

 if (t1.right == null && t2.right != null) {
 t1.right = t2.right;
 }
 }
 }
 */

