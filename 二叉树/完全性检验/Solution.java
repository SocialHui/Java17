
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode  cur = queue.poll();
        while (cur != null) {
            queue.offer(cur.left);
            queue.offer(cur.right);
            cur = queue.poll();
        }
        while (!queue.isEmpty()) {
            if(queue.poll() != null) {
                return false;
            }
        }
        return true;
    }
    }
}
