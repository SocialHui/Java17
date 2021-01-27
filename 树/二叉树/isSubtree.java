public class isSubtree {

    public boolean isSameTree(BTNode p, BTNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null || q == null && p != null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //判断一个树是否是另一个树的子树
    public boolean isSubtree(BTNode s, BTNode t) {
        if (isSameTree(s,t)) return true;
        if (isSubtree(s.left,t)) return true;
        if (isSubtree(s.right,t)) return true;
        return false;
    }
}