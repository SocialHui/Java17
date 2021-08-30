 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        if (pre.length <= 0 || vin.length <= 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        int num = pre[0];
        int i = 0;
        for (; i < vin.length; i++) {
            if (vin[i] == num){
                break;
            }
        }
        node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(vin,0,i));
        node.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(vin,i+1,vin.length));
        return node;
    }
}