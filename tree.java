class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Binarytree {
    Node root;

    Binarytree() {
        this.root = null;
    }

    
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    
    public void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    
    public void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    
    public int countOfNodes(Node node) {
        if (node == null) return 0;
        return 1 + countOfNodes(node.left) + countOfNodes(node.right);
    }


    public int findHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }
    
    public int sumOfNodes(Node node) {
        if (node == null) return 0;
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    
    public int sumOfLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            return node.data;
        }
        return sumOfLeafNodes(node.left) + sumOfLeafNodes(node.right);
    }
}

public class tree {
    public static void main(String[] args) {
        Binarytree t = new Binarytree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(7);
        t.root.right.right = new Node(6);

        System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println();

        System.out.print("Preorder: ");
        t.preorder(t.root);
        System.out.println();

        System.out.print("Postorder: ");
        t.postorder(t.root);
        System.out.println();

        System.out.println("Count of nodes: " + t.countOfNodes(t.root));
        System.out.println("Height of tree: " + t.findHeight(t.root));
        System.out.println("Sum of all nodes: " + t.sumOfNodes(t.root));
        System.out.println("Sum of leaf nodes: " + t.sumOfLeafNodes(t.root));
    }
}
