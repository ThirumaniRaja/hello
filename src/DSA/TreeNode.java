package DSA;

public class TreeNode {

    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf(){
        if(leftNode == null && rightNode == null) {
            return true;
        }
        return false;
    }

}
