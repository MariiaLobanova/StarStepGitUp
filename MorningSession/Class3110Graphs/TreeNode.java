package scr.MorningSession.Class3110Graphs;

// 1.Binary Tree Node:
//Create a class named TreeNode with an integer data field.
//Include fields for left and right child references (left and right) in the TreeNode class.
//Write a constructor for the TreeNode class that initializes the data field and sets left and right to null
public class TreeNode {

    private  int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }
    public int getData() {
        return data;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(2);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        System.out.println(root.getData());
        System.out.println("Left Child: " + root.getLeft().getData());
        System.out.println("Right Child: " + root.getRight().getData());

    }
}
