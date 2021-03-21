class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int highLeft = depth(root.left);
        int highRight = depth(root.right);
        if (Math.abs(highLeft-highRight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHigh = depth(root.left) + 1;
        int rightHigh = depth(root.right) + 1;
        return leftHigh > rightHigh ? leftHigh : rightHigh;
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
