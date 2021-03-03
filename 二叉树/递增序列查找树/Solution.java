public class Solution {
    List<Integer> list = new ArrayList<>();
    inorder(root,list);
    TreeNode head = new TreeNode();
    TreeNode node = head;
        for (int val: list){
        node.right = new TreeNode(val);
        node = node.right;
    }
        return head.right;
}

    public void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
