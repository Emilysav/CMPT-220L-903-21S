package base;

public class BinarySearchTree {

    //creating the elements that will be in the binary Search tree
    public static class Node{
        int data;
        Node LeftChild;
        Node RightChild;

        public Node(int data){
            this.data = data;
            this.LeftChild = null;
            this.RightChild = null; } }

    //creating the root variable
    public Node root;

    public BinarySearchTree(){
        root = null; }

    //This code will determine the root and begin to sort left or right
    public void add(int data) {
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return; }

        else {
            Node child = root, parent = null;
            while(true) {
                parent = child;
                if(data < child.data) {
                    child = child.LeftChild;
                    if(child == null) {
                        parent.LeftChild = newNode;
                        return; } }

                else {
                    child = child.RightChild;
                    if(child == null) {
                        parent.RightChild = newNode;
                        return; } } } } }

     //an if/else loop to prove/disprove if an element exists in the BST
    static boolean elementfinder( Node node, int value) {
        if (node == null){
            return false;}

        if (node.data == value){
            return true;}

        boolean result1 = elementfinder(node.RightChild, value);
        if(result1) {
            return true; }

        boolean result2 = elementfinder(node.LeftChild, value);
        return result2; }

// Loop Checks amount of children sorted on each side whichever side has more children it keeps and + 1 for base root
    int height(Node node) {
        if (node == null)
            return 0;

        else {
            if (height(node.LeftChild) < height(node.RightChild)){
                return (height(node.RightChild) + 1);}
            else{
                return (height(node.LeftChild) + 1); } } }

    //find the largest element (rightmost element )
    int Largest(Node node) {
        Node value = node;

        while (value.RightChild != null) {
            value = value.RightChild;
        }
        return (value.data); }

    //Find the smallest element (left most element)
    int Smallest(Node node) {
        Node value = node;
        while (value.LeftChild != null) {
            value = value.LeftChild;
        }
        return (value.data); }

// Finding the Nth Largest Element in the Binary tree
    public class count {
        int value = 0;}
    void NthLargestelement(Node node, int N, count count) {

        if (node == null || count.value >= N){
            return;}

        this.NthLargestelement(node.RightChild, N, count);
        count.value++;
        if (count.value== N) {
            System.out.println("The" + N + " Largest element is: " +
                    node.data);
            return; }

        this.NthLargestelement(node.LeftChild, N, count); }

    void NthLargestelement(int N) {
        count value = new count();
        this.NthLargestelement(this.root, N, value); }

    // Depth First Search (in order preorder adn post order sorting of binary tree)
    //left, root, right
    public void inorder(Node node) {
        if(node.LeftChild!= null)
            inorder(node.LeftChild);
        System.out.print(node.data + " ");
        if(node.RightChild!= null)
            inorder(node.RightChild); }

    //root, left, right
    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.LeftChild);
        printPreorder(node.RightChild); }
    void printPreorder() { printPreorder(root); }

    //Left, right, root
    void Postorder(Node node){
        if (node == null)
            return;
        Postorder(node.LeftChild);
        Postorder(node.RightChild);
        System.out.print(node.data + " "); }
    void Postorder() { Postorder(root); }


    //Deleting the element, and reorganizng the tree
    void removeElement(int value) { root = deletenode(root, value); }
    Node deletenode(Node root, int value) {
        if (root == null)
            return root;

        if (value < root.data){
            root.LeftChild = deletenode(root.LeftChild, value);}

        else if (value > root.data){
            root.RightChild = deletenode(root.RightChild, value);}

        else {
            if (root.LeftChild == null){
                return root.RightChild;}
            else if (root.RightChild == null){
                return root.LeftChild;}
            root.data = Smallest(root.RightChild);{
                root.RightChild = deletenode(root.RightChild, root.data); }}

        return root; }

        Node reorganize(Node root, int value) {
        if (value < root.data)
            root.LeftChild = reorganize(root.LeftChild, value);
        else if (value > root.data)
            root.RightChild = reorganize(root.RightChild, value);
        return root; }


    void BreadthSearch() {
        int height = height(root);
        int i;
        for (i=1; i<=height; i++)
            BreadthTraversal(root, i);
    }

    void BreadthTraversal (Node root ,int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            BreadthTraversal(root.LeftChild, level-1);
            BreadthTraversal(root.RightChild, level-1); } }


}



