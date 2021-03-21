public class Solution {
    //求二叉树的高度
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHigh = countNodes(root.left);
        int rightHigh = countNodes(root.right);
        return leftHigh>rightHigh ? leftHigh+1 : rightHigh+1;
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
