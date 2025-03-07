public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(new Node(5));
        tree.insert(new Node(100));
        tree.insert(new Node(13));
        tree.insert(new Node(3));
        tree.insert(new Node(22));
        tree.display();
        System.out.println(tree.search(15));
        System.out.println(tree.TreeMax());
        System.out.println(tree.TreeMin());


    }
}
