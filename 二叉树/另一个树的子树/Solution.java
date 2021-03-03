public class Solution {
    public boolean isSubtreeChild(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null && t != null || s != null && t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSubtreeChild(s.left,t.left) && isSubtreeChild(s.right,t.right);
    }


    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if(isSubtreeChild(s,t)) {
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}
