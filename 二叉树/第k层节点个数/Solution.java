import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    //求第k层节点个数
    public int countNodes(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k < 1) {
            System.out.println("层数不合理");
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int kSize = 0;
        while (!queue.isEmpty() && k != 1) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            k--;
        }
        if (queue.isEmpty()) {
            System.out.println("不存在第k层");
            return 0;
        } else {
            while (!queue.isEmpty()) {
                kSize++;
                queue.poll();
            }
        }
        return kSize;
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
