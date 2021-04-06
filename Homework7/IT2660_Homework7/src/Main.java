public class Main {


    public static void main(String[] args) {

        // Assuming Sorted List.
        // java.util.Arrays.sort(int[])

        Node rootOdd = new Node(new int [] {15, 25, 35, 45, 55, 65, 75});
        Node rootEven = new Node(new int [] {15, 25, 35, 45, 55, 65, 75, 85});

        rootOdd.treeSearch(rootOdd, 4);
        rootOdd.treeSearch(rootOdd, 75);
        rootEven.treeSearch(rootEven, 85);
    }
}
