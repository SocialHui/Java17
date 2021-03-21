public class Solution {
    //遍历思路求叶子节点个数
    int size = 0;
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            size++;
        }
        countNodes(root.left);
        countNodes(root.right);
        return size;
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
