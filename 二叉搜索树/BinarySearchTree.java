import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    //静态内部类
    public static class Node{
        public int key;
        public Node left;
        public Node right;

        public Node(int key){
            this.key = key;
        }
    }

    public Node head = null;

    public Node search(int val) {
        Node root = this.head;
        while (root != null) {
            if (root.key == val) {
                return root;
            } else if (val > root.key) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }

    public boolean insert(int val) {
        Node cur = this.head;
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return true;
        }
        Node parent = null;
        while (cur != null) {
            parent = cur;
            if (val > cur.key) {
                cur = cur.right;
            } else if (val < cur.key) {
                cur = cur.left;
            } else {
                System.out.println("本来就存在，不需要插入");
                return false;
            }
        }
        if (val > parent.key) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return true;
    }

    public boolean remove(int val) {
        //先判断是否存在这个数字
        Node node = search(val);
        if (node == null) {
            System.out.println("不存在这个数字，无法删除");
            return false;
        }
        Node cur = this.head;
        Node parent = cur;
        if (node.left == null) {
            //判断要删除的节点是不是根节点
            if (node == this.head) {
                this.head = this.head.right;
            } else {
                while (cur.key != val) {
                    parent = cur;
                    if (val > cur.key) {
                        cur = cur.right;
                    } else{
                        cur = cur.left;
                    }
                }
                parent.left = cur.right;
            }
        } else if (node.right == null) {
            //判断要删除的节点是不是根节点
            if (node == this.head) {
                this.head = this.head.left;
            } else {
                while (cur.key != val) {
                    parent = cur;
                    if (val > cur.key) {
                        cur = cur.right;
                    } else{
                        cur = cur.left;
                    }
                }
                parent.right = cur.left;
            }

        } else {
            /*if (node == this.head) {
                //代表要删除的节点是头节点，但是头节点的左右都不为空
                //在左边找最大的数字，和他进行交换然后删除左边最大的这个数字所在的地址
                cur = this.head.left;
                while (cur.right != null) {
                    parent = cur;
                    cur = cur.right;
                }
                int tmp = this.head.key;
                this.head.key = cur.key;
                cur.key = tmp;
                parent.right = cur.left;
            } else {*/
                parent = node;
                cur = node.left;
                while (cur.right != null) {
                    parent = cur;
                    cur = cur.right;
                }
                int tmp = node.key;
                node.key = cur.key;
                cur.key = tmp;
                if (parent == node) {
                    parent.left = cur.left;
                } else {
                    parent.right = cur.left;
                }
            }
        //}
        return true;
    }
}
