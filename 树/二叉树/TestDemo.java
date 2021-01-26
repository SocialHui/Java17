import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode btNode = binaryTree.createdTree();
        binaryTree.preOrderTraversal(btNode);
        System.out.println();
        binaryTree.inOrderTraversal(btNode);
        System.out.println();
        binaryTree.postOrderTraversal(btNode);
        System.out.println();

        System.out.println(binaryTree.getHeight(btNode));
    }
}
