



public class BinaryTree  {


    Node root;

    public void insert(Node node) {
        root = insert(root, node);
    }

    public Node insert(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data)
            root.left = insert(root.left, node);
        else
            root.right = insert(root.right, node);


        return root;
    }

    public void display() {
        //display(root);
    }

//    private void display(Node root) {
//        if (root != null) {
//            display(root.left);
//            System.out.println(root.data);
//            display(root.right);
//        }
//    }
//
//                  Search

    public Node search(int data) {

        return search(root, data);
    }

    private Node search(Node current, int data) {
        if (current == null || current.data == data){
            return current;
        } else if (current.data > data) {
            return search(current.left, data);
        } else
            return search(current.right, data);
    }
    //              Find maximum
    public Node TreeMax() {
        return (TreeMax(root));
    }

    public Node TreeMax(Node current) {
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
    //              Find minimum
    public Node TreeMin() {
        return (TreeMin(root));

    }

    public Node TreeMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}
//    public void remove(int data) {
//    }
//
//    public Node removeHelper(Node root, int data) {
//        return null;
//    }
//
//    private int successor(Node root) {
//        return 0;
//    }
//
//    private int predecessor(Node root) {
//        return 0;
//    }
//}

