public class BinarySearchTree<T extends Comparable<T>> {

    public class Node{
        private T val;
        private Node left;
        private Node right;

        public Node(T val) {
            this.val = val;
        }

        public Node() {

        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public Node head = null;

    public boolean push(T val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return true;
        }
        Node cur = this.head;
        Node parent = null;
        while (cur != null) {
            if (val.compareTo(cur.val) > 0) {
                parent = cur;
                cur = cur.right;
            } else if (val.compareTo(cur.val) < 0) {
                parent = cur;
                cur = cur.left;
            } else {
                System.out.println("存在这个数字，不需要插入");
                return false;
            }
        }
        if (val.compareTo(parent.val) > 0) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return true;
    }

    public boolean search(T val) {
        if (isEmpty()) {
            return false;
        }
        Node cur = this.head;
        while (cur != null) {
            if (val == cur.val) {
                return true;
            } else if (cur.val.compareTo(val) < 0) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.head==null;
    }

    public boolean remove(T val) {
        if (isEmpty()) {
            return false;
        }
        if (!search(val)) {
            return false;
        }
        Node cur = this.head;
        Node parent = null;
        while (cur.val != val) {
            if (cur.val.compareTo(val) < 0) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
        //cur现在存放的是要删除的节点

        if (cur.right == null) {
            if (cur == this.head) {
                this.head = this.head.left;
            } else {
                if (val.compareTo(parent.val) > 0) {
                    parent.right = cur.left;
                } else {
                    parent.left = cur.left;
                }
            }
            return true;
        } else if (cur.left == null){
            if (cur == this.head) {
                this.head = this.head.right;
            } else {
                if (val.compareTo(parent.val) > 0) {
                    parent.right = cur.right;
                } else {
                    parent.left = cur.right;
                }
            }
            return true;
        } else {
            //代表要删除节点的左右均不为空
            //在要删除的节点的左边找最大值(在要删除的节点右边找最小值)然后和要删除的节点交换值
            Node node = cur.left;
            Node nodeParent = null;
            while (node != null) {
                nodeParent = node;
                node = node.right;
            }
            //交换
            T tmp = nodeParent.val;
            nodeParent.val = cur.val;
            cur.val = tmp;
            //删除
            if (nodeParent == cur.left) {
                cur.left = nodeParent.left;
            } else {
                nodeParent.right = node.left;
            }
            return true;
        }
    }
}
