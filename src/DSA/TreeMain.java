package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeMain {
    public static TreeNode buildSampleTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        node3.setLeftNode(node6);
        node3.setRightNode(node7);


        return node1;
    }

    public static void printLeafNodes(TreeNode node) {
        if (node == null) return;

        if (node.isLeaf()) {
            System.out.println(node.getValue());
            return;
        }

        printLeafNodes(node.getLeftNode());
        printLeafNodes(node.getRightNode());
    }

    public static void printAllNodes(TreeNode node) {
        if (node == null) return;

//        if (node.isLeaf()) {
//            System.out.println(node.getValue());
//            return;
//        }
        System.out.println(node.getValue());

        printAllNodes(node.getLeftNode());
        printAllNodes(node.getRightNode());
    }

    public static void printInOrder(TreeNode node, List<Integer> outPut){
        if (node == null) return;
//        System.out.println(node.getValue());

        printInOrder(node.getLeftNode(),outPut);
        outPut.add(node.getValue());
//        printInOrder(node.getValue());
        printInOrder(node.getRightNode(),outPut);
    }

//    public static void printPreOrder(TreeNode node, List<Integer> outPut){
//        if (node == null) return;
//        System.out.println(node.getValue());
//        outPut.add(node.getValue());
//        printInOrder(node.getLeftNode(),outPut);
//        printInOrder(node.getRightNode(),outPut);
//    }

    public static void printPreOrder(TreeNode node, List<Integer> outPut) {
        if (node == null) return;

        outPut.add(node.getValue());                // Root
        printPreOrder(node.getLeftNode(), outPut);  // Left
        printPreOrder(node.getRightNode(), outPut); // Right
    }


    public static void main(String[] args) {
        TreeNode root = buildSampleTree();
        printLeafNodes(root);
        System.out.println("All nodes");
        printAllNodes(root);
        System.out.println("args = " + root.getValue());

        List<Integer> inOrderResult = new ArrayList<>();
        List<Integer> preOrderResult = new ArrayList<>();

        printInOrder(root,inOrderResult);

        System.out.println("In order list"+inOrderResult);

        printPreOrder(root,preOrderResult);
        System.out.println("pre order list"+preOrderResult);

        // create subtree from pre-order and post-order


}
}
