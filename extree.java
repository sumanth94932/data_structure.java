class Node {
    int data;
    Node left, right;
    int height;

    Node(int data) {
        this.data = data;
        left = right = null;
        height = 1;  // new node height = 1
    }
}

class AVL {
    Node root;

    // Height
    int height(Node n) {
        if (n == null) return 0;
        return n.height;
    }

    // Balance factor
    int getBalance(Node n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    // Right Rotation (LL case)
    Node rightRotation(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        // Rotate
        x.right = y;
        y.left = t2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;  // new root
    }

    // Left Rotation (RR case)
    Node leftRotation(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        // Rotate
        y.left = x;
        x.right = t2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;  // new root
    }

    // Insert with balancing
    Node insert(Node node, int key) {
        // Normal BST insert
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node;  // duplicates not allowed

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Balance factor
        int balance = getBalance(node);

        // CASE 1: Left Left
        if (balance > 1 && key < node.left.data)
            return rightRotation(node);

        // CASE 2: Right Right
        if (balance < -1 && key > node.right.data)
            return leftRotation(node);

        // CASE 3: Left Right
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }

        // CASE 4: Right Left
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        return node;  // unchanged
    }

    // Public insert
    void insert(int key) {
        root = insert(root, key);
    }

    // Traversals -------------------------

    // Inorder (L - Root - R)
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder (Root - L - R)
    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder (L - R - Root)
    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}


// MAIN CLASS ----------------------------------
public class extree {
    public static void main(String[] args) {
        AVL tree = new AVL();
        int[] arr = {30, 40, 28, 10, 23};

        for (int i : arr) {
            tree.insert(i);
        }

        System.out.println("Inorder of AVL Tree:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder of AVL Tree:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder of AVL Tree:");
        tree.postorder(tree.root);
    }
}