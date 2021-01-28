import sun.awt.image.ImageWatched;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        List<String> list = new CreatedTree();
//        CreatedTree tree = new LinkedList<String>();
        CreatedTree createdTree = new CreatedTree();
        BTNode root = createdTree.createdTree(str);
        createdTree.inOrderTraversal(root);
        //new CreatedTree().inOrderTraversal(new CreatedTree().createdTree(str));
    }

}