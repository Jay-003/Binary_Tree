import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //initialising an array list.
        ArrayList<BinaryTree<String>> tree = new ArrayList<>();

        //taking string inputs and storing them in an array list to build a tree until user inputs "done".
        System.out.print("Enter name or done: ");
        String in = kb.nextLine();

        while (!in.equals("done")) {
            BinaryTree<String> A = new BinaryTree<>();
            A.makeRoot(in);
            tree.add(A);
            System.out.print("Enter name or done: ");
            in = kb.nextLine();

        }

        //defining the root of the tree.
        BinaryTree<String> curr = tree.get(0);

        //building the tree by attaching the individual roots stored in an arraylist.
        for (int i=0; i< tree.size(); i++) {
            if (2*i+1 < tree.size()) {
                tree.get(i).attachLeft(tree.get(2 * i + 1));
            }
            if (2*i+2 < tree.size()) {
                tree.get(i).setRight(tree.get(2 * i + 2));
            }

        }

        // test statements
        System.out.printf("Height of the tree is: %d\n", BinaryTree.height(curr));

        System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.nodes(curr));


        System.out.println();

        System.out.print("Inorder:\t");
        BinaryTree.inorder(curr);
        System.out.println();

        System.out.print("Preorder:\t");
        BinaryTree.preorder(curr);
        System.out.println();

        System.out.print("Postorder:\t");
        BinaryTree.postorder(curr);
        System.out.println();

        System.out.print("Level order:\t");
        BinaryTree.levelOrder(curr);
        System.out.println();
        System.out.println();

        System.out.printf("The height of the tree is: %d\n", BinaryTree.height(curr));
        System.out.printf("And is it height balanced... %s\n", BinaryTree.heightBalanced(curr) ? "Yes!" : "No.");

        System.out.println();


    }

}
