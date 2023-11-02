package scr.MorningSession.Class3110Graphs;
//2.Binary Tree Creation:
//Create a binary tree by manually specifying its structure, including a root node and its children.
//Use the TreeNode class you created in the previous task to build the binary tree.
//Print the values of the nodes to demonstrate the structure of the tree.
public class BinaryTree {

    private  int data;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }
    public int getData() {
        return data;
    }
    public void setLeft(BinaryTree left) {
        this.left = left;
    }
    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public BinaryTree insertElement(BinaryTree root, int value) {
        if (root == null) {
            return new BinaryTree((value));
        }
        if (value < root.getData()) {
            root.setLeft(insertElement(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(insertElement(root.getRight(), value));
        }return  root;
    }

        public static void inOrderTraversal(BinaryTree node) {
            if (node != null) {
                inOrderTraversal(node.getLeft());
                System.out.print("Left Childs" + node.getLeft().getData() + " ");
                inOrderTraversal(node.getRight());
                System.out.print("Right Childs" + node.getRight().getData() + " ");
            }
        }

    public static void main(String[] args) {


        BinaryTree root = new BinaryTree(5);
        root = root.insertElement(root, 3);
        root = root.insertElement(root, 8);
        root = root.insertElement(root, 1);
        root = root.insertElement(root, 4);
        root = root.insertElement(root, 7);
        root = root.insertElement(root, 11);


        System.out.println(root.getData());
        System.out.println("Left Child: " + root.getLeft().getData());
        System.out.println("Right Child: " + root.getRight().getData());

         ;

    }
}
