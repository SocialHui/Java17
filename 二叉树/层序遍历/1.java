import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list1 = new ArrayList<>();
            int num = queue.size();
            while (num != 0) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                list1.add(tmp.val);
                num--;
            }
            list.add(list1);
        }
        int l = 0;
        int r = list.size()-1;
        while (l < r) {
            ArrayList<Integer> tmp = list.get(l);
            list.set(l,list.get(r));
            list.set(r,tmp);
            l++;
            r--;
        }
        return list;
    }
}