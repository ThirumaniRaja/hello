package DSA;

import java.util.Arrays;

public class TreeMain {
    public static TreeNode buildSampleTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        node3.setLeftNode(node6);

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


    public static void main(String[] args) {
        TreeNode root = buildSampleTree();
        printLeafNodes(root);
        System.out.println("All nodes");
        printAllNodes(root);
        System.out.println("args = " + root.getValue());
        // create subtree from pre-order and post-order


}
}
