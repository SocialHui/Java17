import java.util.HashMap;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(28);
        binarySearchTree.insert(37);
        binarySearchTree.insert(15);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(100);
        binarySearchTree.insert(7);
        System.out.println(binarySearchTree.search(55));
        System.out.println(binarySearchTree.search(10).key);
        binarySearchTree.remove(5);
    }
    public static void main1(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,3,2,4,3,5,6,4,6,3};
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
        solution.heapSort(array);
        solution.put(10);
        solution.remove();
    }
}
