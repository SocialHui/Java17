public class IsSymmetric {
    //对称二叉树
    public boolean isSymmetricChild (BTNode leftTree, BTNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        if (leftTree.val != rightTree.val) {
            return false;
        }
        boolean m = isSymmetricChild(leftTree.left,rightTree.right);
        boolean n = isSymmetricChild(leftTree.right,rightTree.left);
        return m && n;
    }

    public boolean isSymmetric(BTNode root) {
        if (root == null) return true;
        return isSymmetricChild(root.left,root.right);
    }
}
