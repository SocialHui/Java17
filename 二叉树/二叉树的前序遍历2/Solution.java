import java.util.LinkedList;
import java.util.List;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            list.add(root.val);
            List<Integer> listLeft = preorderTraversal(root.left);
            list.addAll(listLeft);
            List<Integer> listRight = preorderTraversal(root.right);
            list.addAll(listRight);
        }
        return list;
    }
}
