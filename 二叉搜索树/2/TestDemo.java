public class TestDemo {
    public static void main(String[] args) {
        //二叉搜索树
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.push(20);
        binarySearchTree.push(30);
        binarySearchTree.push(10);
        binarySearchTree.push(8);
        binarySearchTree.push(5);
        binarySearchTree.push(38);
        binarySearchTree.push(15);

        System.out.println(binarySearchTree.search(40));

        System.out.println(binarySearchTree.remove(10));
    }
}
