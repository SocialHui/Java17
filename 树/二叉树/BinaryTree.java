import java.util.List;

class BTNode {
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode(char val) {
        this.val = val;
    }

}

public class BinaryTree {

    /**
     * 穷尽创建二叉树
     * 后面用遍历的方式创建二叉树
     */
    public BTNode createdTree () {
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    //前序遍历
    public void preOrderTraversal (BTNode btNode) {
        if (btNode == null) return;
        System.out.print(btNode.val);
        preOrderTraversal(btNode.left);
        preOrderTraversal(btNode.right);
    }

/*
    class Solution {
        List<Integer> list  = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if(root == null)
                return list;
            pre(root);
            return list;
        }
        public void pre(TreeNode root){
            if(root==null) return;
            list.add(root.val);
            pre(root.left);
            pre(root.right);
        }
    }*/

    /*
    class Solution {

        //子问题
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root != null) {
                list.add(root.val);
                //System.out.print(root.val);
                List<Integer> leftList = preorderTraversal(root.left);
                list.addAll(leftList);
                List<Integer> rightList = preorderTraversal(root.right);
                list.addAll(rightList);
            }
            return list;
        }
    }*/


    // 中序遍历
    void inOrderTraversal(BTNode btNode) {
        if (btNode == null) return;
        inOrderTraversal(btNode.left);
        System.out.print(btNode.val);
        inOrderTraversal(btNode.right);
    }


    //后序遍历
    public void postOrderTraversal (BTNode btNode) {
        if (btNode == null) return;
        postOrderTraversal(btNode.left);
        postOrderTraversal(btNode.right);
        System.out.print(btNode.val);
    }

    //遍历思路，求节点个数
    static int size = 0;
    public void getSize1 (BTNode btNode) {
        if (btNode == null) return;
        size++;
        getSize1(btNode.left);
        getSize1(btNode.right);
    }

    //子问题思路，求节点个数
    public int getSize2 (BTNode btNode) {
        if (btNode == null) return 0;
        return getSize2(btNode.left) + getSize2(btNode.right) + 1;
    }

    //遍历思路，求叶子节点个数
    static int letfSize = 0;
    public void getLeftSize1 (BTNode btNode) {
        if (btNode == null) return;
        if (btNode.left == null && btNode.right ==null){
            letfSize++;
        }
        getLeftSize1(btNode.left);
        getLeftSize1(btNode.right);
    }

    //子问题思路，求叶子节点个数
    public int getLeftSize2 (BTNode btNode) {
        if (btNode == null) return 0;
        if (btNode.left == null && btNode.right ==null){
            return 1;
        }
        return getLeftSize2(btNode.left) + getLeftSize2(btNode.right);
    }

    //子问题思路，求第k层节点个数
    public int getLevelSize (BTNode btNode,int k) {
        if (btNode == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getLevelSize(btNode.left,k-1) + getLevelSize(btNode.right,k-1);
    }

    //获取二叉树的高度
    //时间复杂度o（n）
    public int getHeight (BTNode btNode) {
        if (btNode == null) {
            return 0;
        }
        /*if (btNode.left == null && btNode.right == null) {
            return 0;
        }
         */
        int leftHeight = getHeight(btNode.left);
        int rightHeight = getHeight(btNode.right);
        return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
    }

    //查找val所在节点，没有找到返回null
    //前序遍历查找
    //一旦找到，立刻返回，不要继续在其他位置查找
    //错误的！！！！！！！！！！！！！！！！
    public BTNode find (BTNode btNode, int val) {
        if (btNode == null) return null;
        if (btNode.val == val) return btNode;
        BTNode btNode1 = find(btNode.left,val);
        BTNode btNode2 = find(btNode.right,val);
        return btNode1 == null && btNode2 == null ? null : btNode1 != null? btNode1 : btNode2;
    }

}
