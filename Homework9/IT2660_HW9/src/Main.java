import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        Graph randomGraph = new Graph(1000);

        // Print the graph
        System.out.println("The generated random graph :");
        for (int i = 0;
             i < randomGraph.adjacencyList.size(); i++) {
            System.out.print(i + " -> { ");

            List<Integer> list
                    = randomGraph.adjacencyList.get(i);

            if (list.isEmpty())
                System.out.print(" No adjacent vertices ");
            else {
                int size = list.size();
                for (int j = 0; j < size; j++) {

                    System.out.print(list.get(j));
                    if (j < size - 1)
                        System.out.print(" , ");
                }
            }

            System.out.println("}");


            printShortestDistance((List<List<Integer>>) randomGraph, 0, 100, 1000);
        }
    }
}
