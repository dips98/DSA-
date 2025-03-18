
public class Node {
    int data;
    Node left, right;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

class Tree {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        n4.left = n7;
        n4.right = n8;

        System.out.println("Pre order ");
        preOrder(n1);
        System.out.println(" ");

        System.out.println("Post order ");
        postOrder(n1);
        System.out.println(" ");

        System.out.println("In order ");
        inOrder(n1);
        System.out.println(" ");
    }

    private static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    private static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print( root.data + " ");
    }

    private static void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

}