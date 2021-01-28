public class LowestCommonAncestor {
    //找公共祖先
    //前序遍历的方式
    public BTNode lowestCommonAncestor (BTNode root, BTNode node1, BTNode node2) {
        if (root == null) return null;
        if (root == node1 || root == node2) return root;
        BTNode btNode1 = lowestCommonAncestor(root.left, node1, node2);
        BTNode btNode2 = lowestCommonAncestor(root.right, node1, node2);
        if (btNode1 != null && btNode2 != null) return root;
        if (btNode1 != null || btNode2 != null) return btNode1 != null ? btNode1 : btNode2;
        return null;
    }
}
