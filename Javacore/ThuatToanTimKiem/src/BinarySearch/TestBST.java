package BinarySearch;

public class TestBST {
    public static void main(String[] args) {

        BST<Integer> tree = new BST<>();
        tree.insert(4);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);

        System.out.print("Inorder (sorted)");
        tree.inorder();

        System.out.println("The number of the nodes is: " + tree.getSize());

        System.out.println("Is number 1 has tree? \n" + tree.search(1));
        System.out.println("Is number 5 has tree? \n" + tree.search(5));
        System.out.println("Is number 7 has tree? \n" + tree.search(7));
        System.out.println("Is number 4 has tree? \n" + tree.search(4));
        System.out.println("Is number 8 has tree? \n" + tree.search(8));

        tree.postorder();

        tree.preorder();
    }
}
