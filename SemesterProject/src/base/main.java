package base;

import java.util.Arrays;

import static base.BinarySearchTree.elementfinder;

public class main {

    public static void main(String[] args) {

        BinarySearchTree binarystree = new BinarySearchTree();
        binarystree.add(45);
        binarystree.add(81);
        binarystree.add(14);
        binarystree.add(76);
        binarystree.add(56);
        binarystree.add(23);

        int value = 77;
        if (elementfinder(binarystree.root, value))
            System.out.println("Element exists");
        else
            System.out.println("Element does not exist");

        System.out.println("Height of tree: " + binarystree.height(binarystree.root));

        System.out.print("Smallest Element: " + binarystree.Smallest(binarystree.root));

        System.out.println("\nlargest element: " + binarystree.Largest(binarystree.root));

        for (int i = 5; i <= 5; i++) {
            binarystree.NthLargestelement(i); }

        System.out.println("Depth First Search: ------");
        System.out.println("In order Traversal: ");
        binarystree.inorder(binarystree.root);

        System.out.println("\nPreorder traversals: ");
        binarystree.printPreorder();

        System.out.println("\nPostorder traversals: ");
        binarystree.Postorder();

        System.out.println("\nend of search ------");

        System.out.println("Breadth first search:  ");binarystree.BreadthSearch();

        binarystree.removeElement(56);
        System.out.println("\nBST with removed element :");
        binarystree.inorder(binarystree.root); } }









