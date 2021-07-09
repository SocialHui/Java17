public class BinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        //构造方法
        public Node(int key) {
            this.key = key;
        }
    }

    private Node root = null;    //根节点

    /**
     * 在二叉搜索树中查找key，找到返回key所在的节点，否则返回null
     */
    public Node search(int key) {
        Node node = root;
        while (node != null) {
            if (node.key == key) {
                return node;
            } else if (node.key > key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    public boolean insert(int key) {
        if (root == null) {
            //代表没有数据，插入的数据直接就是头节点
            root = new Node(key);
            return true;
        }

        Node node = root;
        Node parent = null;

        while (node != null) {
            parent = node;
            if (key > node.key) {
                node = node.right;
            } else if (key < node.key) {
                node = node.left;
            } else {
                return false;
            }
        }
        //到这里代表已经找到了正确的位置，可以进行插入了
        node = new Node(key);
        if (key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    /**
     * 删除成功返回true， 删除失败返回false
     * 删除分为三种情况
     * 第一种情况：要删除的节点没有左子树
     *           1.要删除的节点是根节点
     *           2.要删除的节点是父节点的左树  parent.left = node.right
     *           3.要删除的节点是父节点的右树  parent.right = node.right
     * 第二种情况：要删除的节点没有右子树
     *           1.要删除的节点是根节点  root = root.left
     *           2.要删除的节点是父节点的左树    parent.left = node.left;
     *           3.要删除的节点是父节点的右树    parent.right = node.left;
     * 第三种情况：要删除的节点左右子树都有
     *
     * @param key
     * @return
     */
    public boolean remove(int key) {
        //先判断二叉树里面有没有这个节点
        Node node = root;
        Node parent = null;
        while (node != null) {
            if (node.key == key) {
                break;
            } else if (key > node.key) {
                parent = node;
                node = node.right;
            } else {
                parent = node ;
                node = node.left;
            }
        }

        if (null == node) {
            return false;
        }

        //上面没返回代表存在这个数字，进行删除操作
        if (node.left == null) {
            //三种情况
            if (node == root) {
                //要删除的节点是根节点
                root = root.right;
            } else if (node == parent.left) {
                parent.left = node.right;
            } else if (node == parent.right){
                parent.right = node.right;
            }
        } else if (node.right == null) {
            //三种情况
            if (node == root) {
                //要删除的节点是根节点
                root = root.left;
            } else if (node == parent.left) {
                parent.left = node.left;
            } else if (node == parent.right){
                parent.right = node.left;
            }
        } else {
            //最难的一种情况
            Node leftMin = node.right;   //在右边找最小值
            Node leftMinParent = null;
            while (leftMin.left != null) {
                leftMinParent = leftMin;
                leftMin = leftMin.left;
            }

            int tmp = node.key;
            node.key = leftMin.key;
            leftMin.key = tmp;

            if (node.right == leftMin) {
                node.right = leftMin.right;
            } else {
                leftMinParent.left = leftMin.right;
            }
        }
        return true;
    }
}