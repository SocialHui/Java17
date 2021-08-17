import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int num = 0;   //用来记录这一行有几个数字
        num++;
        while (!queue.isEmpty()) {
            int num2 = 0;
            ArrayList<Integer> list1 = new ArrayList<>();
            while (num != 0) {
                TreeNode node = queue.poll();
                num--;
                list1.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    num2++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    num2++;
                }
            }
            num = num2;
            list.add(list1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i%2 != 0) {
                ArrayList<Integer> liss = list.get(i);
                int left = 0;
                int right = liss.size()-1;
                while (left < right) {
                    int num1 = liss.get(left);
                    liss.set(left,liss.get(right));
                    liss.set(right,num1) ;
                    left++;
                    right--;
                }
            }
        }
        return list;
    }
}