import java.io.*;
import java.util.*;

// Need to randomly create the edges (1-5)

// To achieve the random value of the node, will need to create an array list of nodes and linked list of edges


public class Graph {

    private int vertices;
    private int edges;



    // generating random function
    Random random = new Random();

    public List<List<Integer>> adjacencyList;

    Graph(int vert){
        this.vertices = vert;
        this.edges = random.nextInt(computeMaxEdges(vertices)) + 1; // Attempt to make this 1-5 # of edges
                                                                    // Instead this creates 0-7??

        adjacencyList = new ArrayList<>(vertices);
//        adj = new LinkedList[vert];
        for (int i = 0; i < vertices; i++)
            adjacencyList.add(new ArrayList<>());

        // loop to randomly generate edges
        for (int i = 0; i < edges; i++) {
            // randomly select two vertices
            // and create an edge between them
            int v = random.nextInt(vertices); // random vertex connects to
            int w = random.nextInt(vertices); // this random vertex

            // add an edge between them
            addEdge(v, w);
        }

    }

    int computeMaxEdges(int numOfVertices)
    {
        return 4 * ((numOfVertices - 1) / 2); // If this number is just 5 - will only create 5 in the whole graph
    }                                         // rather than 1-5 each vertex

    void addEdge(int v, int w)
    {
        adjacencyList.get(v).add(w);


        adjacencyList.get(w).add(v);
    }


    // Code to add BFS search - Don't know how to make the adjacency list input end up working for the graph
    public static void printShortestDistance(List<List<Integer>> adjacencyList, int s, int dest, int v){
        int pred[] = new int[v];
        int dist[] = new int[v];

        // Search not found
        if (BFS(adjacencyList, s, dest, v, pred, dist) == false) {
            System.out.println("Given Source and Destination are not Connected");
            return;
        }

        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        System.out.println("Shortest path length is: " + dist[dest]);

        System.out.println("Path is :");
        for (int i = path.size() -1; i >= 0; i--) {
            System.out.print(path.get(i) + " ");
        }
    }


    private static boolean BFS(List<List<Integer>> adjacencyList, int src, int dest, int v, int[] pred, int[] dist)
    {
       LinkedList<Integer> queue = new LinkedList<Integer>();

       boolean visited[] = new boolean[v];


       for (int i = 0; i < v; i++) {
           visited[i] = false;
           dist[i] = Integer.MAX_VALUE;
           pred[i] = -1;
       }

       visited [src] = true;
       dist[src] = 0;
       queue.add(src);

       while (!queue.isEmpty()) {
           int u = queue.remove();
           for (int i = 0; i < adjacencyList.get(u).size(); i++ ) {
               if (visited[adjacencyList.get(u).get(i)] == false) {
                   visited[adjacencyList.get(u).get(i)] = true;
                   dist[adjacencyList.get(u).get(i)] = dist[u] + 1;
                   pred[adjacencyList.get(u).get(i)] = u;
                   queue.add(adjacencyList.get(u).get(i));

                   if (adjacencyList.get(u).get(i) == dest)
                       return true;
               }
           }
       }
       return false;
    }

}
