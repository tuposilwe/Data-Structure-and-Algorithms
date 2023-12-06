package Data_Structure;

public class Tree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node4(5));
        tree.insert(new Node4(1));
        tree.insert(new Node4(9));
        tree.insert(new Node4(2));
        tree.insert(new Node4(7));
        tree.insert(new Node4(3));
        tree.insert(new Node4(6));
        tree.insert(new Node4(4));
        tree.insert(new Node4(8));

        tree.remove(1);
         tree.display();
        System.out.println(tree.search(9));


    }
}