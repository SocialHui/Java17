class BTNode {
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode(char val) {
        this.val = val;
    }
}


public class CreatedTree {



    //二叉树的构建
    public int i = 0;
    public BTNode createdTree (String str) {
        if (str == null || str.length() <= 0) return null;
        BTNode root = null;
        if (str.charAt(i) != '#') {
            root = new BTNode(str.charAt(i));
            i++;
            root.left = createdTree(str);
            root.right = createdTree(str);
        } else {
            i++;
        }
        return root;
    }

    //中序遍历
    public void inOrderTraversal (BTNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);
    }

}
