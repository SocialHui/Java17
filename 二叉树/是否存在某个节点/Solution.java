public class Solution {
    //判断是否存在某个节点
    public TreeNode find(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode leftNode = find(root.left,val);
        if (leftNode != null) {
            return leftNode;
        }
        TreeNode rightNode = find(root.right,val);
        if (rightNode != null) {
            return rightNode;
        }
        return null;
    }

    public TreeNode createTree() {
        TreeNode head = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(6);
        head.left = node;
        head.right = node1;
        node.left = node2;
        node.right = node3;
        node1.left = node4;
        return head;
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
