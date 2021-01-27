public class isSameTree {
    //判断两个树是否相同
    public boolean isSameTree(BTNode p, BTNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null || q == null && p != null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
