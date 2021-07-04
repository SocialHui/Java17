class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = gaoDu(root.left);
        int right = gaoDu(root.right);
        //得出左右字数的高度以后进行相减，相减的结果如果超过1就代表不是平衡二叉树

        // if (Math.abs(left-right) <= 1) {
        //     //代表是平衡二叉树
        //     return true;
        // }
        //不需要加上面的这一段代码！！！！！！！

        if (Math.abs(left-right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int gaoDu(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(gaoDu(root.left),gaoDu(root.right))+1;
    }
}