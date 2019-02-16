import com.sun.source.tree.BinaryTree;

/* 
    BST Tree Traversal
    Algorithm Inorder(tree)
    1. Traverse the left subtree, call the Inorder (left-subtree)
    2. Visit the root.
    3. Traverse the right subtree, call Inorder (right-subtree)
*/

/* 
    Algorithm Preorder (tree)
    1. Visit the root.
    2. Traverse the left subtree (call Preorder left-subtree)
    3. Traverse the right subtree (call Preorder right-subtree)
*/
class Node {
    int key;
    Node left, right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class TreeTraversal {
    Node root;

    TreeTraversal() {
        root = null;
    }

    void printPostOrder(Node node) {
        if( node == null) 
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);

        System.out.print(node.key + " ");
    }

    void printInOrder(Node node) {
        if(node == null)
            return;

        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if(node == null) 
            return;
        
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder() { printPostOrder(root);  }
    void printInOrder() { printInOrder(root ); }
    void printPreOrder() { printPreOrder(root); }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder();

        System.out.println("\nPostOrder traversal of binary tree is ");
        tree.printPostOrder();
    }
}

