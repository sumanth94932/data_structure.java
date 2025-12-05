class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeMethod {
    Node root = null;

    public Node insert(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public String search(Node root, int value){
        if(root == null) return "no data";
        if(root.data == value) return "found";
        if(value < root.data) return search(root.left, value);
        return search(root.right, value);
    }

    public void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public int minvalue(Node node){
        Node current = node;
        while(current.left != null) current = current.left;
        return current.data;
    }

    public int maxvalue(Node node){
        Node current = node;
        while(current.right != null) current = current.right;
        return current.data;
    }

    public Node deletebyvalue(Node node, int value){
        if(node == null) return null;
        if(value < node.data){
            node.left = deletebyvalue(node.left, value);
        } else if(value > node.data){
            node.right = deletebyvalue(node.right, value);
        } else {
            if(node.left == null) return node.right;
            if(node.right == null) return node.left;
            node.data = minvalue(node.right);
            node.right = deletebyvalue(node.right, node.data);
        }
        return node;
    }

    public void reflect(Node node){
        if(node == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        reflect(node.left);
        reflect(node.right);
    }
}

public class binarysearch {
    public static void main(String[] args){
        BinaryTreeMethod t = new BinaryTreeMethod();
        int[] arr = {3,4,8,9,2,5};
        for(int i : arr){
            t.root = t.insert(t.root, i);
        }

        System.out.println("Preorder:");
        t.preorder(t.root);
        System.out.println("\nInorder:");
        t.inorder(t.root);

        System.out.println("\nSearch 0: " + t.search(t.root, 0));
        System.out.println("Min value: " + t.minvalue(t.root));
        System.out.println("Max value: " + t.maxvalue(t.root));

        t.root = t.deletebyvalue(t.root, 4); // delete node 4
        System.out.println("After deletion (inorder):");
        t.inorder(t.root);

        System.out.println("\nReflecting tree...");
        t.reflect(t.root);
        System.out.println("Inorder of mirrored tree:");
        t.inorder(t.root);
    }
}
