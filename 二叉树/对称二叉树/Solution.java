
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        if (leftTree.val != rightTree.val) {
            return false;
        }
        return isSameTree(leftTree.left, rightTree.right) && isSameTree(leftTree.right, rightTree.left);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
