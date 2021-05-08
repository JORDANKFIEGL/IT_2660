public class Node {
    int n;
    boolean visited;

    Node(int n){
        this.n = n;
        visited = false;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}
