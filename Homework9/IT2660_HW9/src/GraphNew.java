// This is supposed to be the DFS, but unfortunately I'm just frantically copying from this tutorial instead of thinking about it critically to adapt to this problem//
// Link to tutorial: https://stackabuse.com/graphs-in-java-depth-first-search-dfs/

import java.util.HashMap;
import java.util.LinkedList;

public class GraphNew {

    private HashMap<Node, LinkedList<Node>> adjacencyMap;
    private boolean directed;

    public GraphNew(boolean directed){
        this.directed = directed;
        adjacencyMap = new HashMap<>();
    }

    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        }
        else tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a, tmp);
    }

    public void addEdge(Node source, Node destination) {

        // We make sure that every used node shows up in our .keySet()
        if (!adjacencyMap.keySet().contains(source))
            adjacencyMap.put(source, null);

        if (!adjacencyMap.keySet().contains(destination))
            adjacencyMap.put(destination, null);

        addEdgeHelper(source, destination);

        // If a graph is undirected, we want to add an edge from destination to source as well
        if (!directed) {
            addEdgeHelper(destination, source);
        }

        public void printEdges() {
            for (Node node : adjacencyMap.keySet()) {
                System.out.print("The " + node.n + " has an edge towards: ");
                for (Node neighbor : adjacencyMap.get(node)) {
                    System.out.print(neighbor.n + " ");
                }
                System.out.println();
            }
        }

        public boolean hasEdge(Node source, Node destination) {
            return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(destination);
        }

        public void resetNodesVisited(){
            for(Node node : adjacencyMap.keySet()){
                node.unvisit();
            }
        }
    }
}
