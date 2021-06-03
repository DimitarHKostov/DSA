package graphAlgorithms.unweighted;

public class FixedGraph {
    private static final DirectedGraph directedGraph = initialize();

    private static DirectedGraph initialize() {
        DirectedGraph graph = new DirectedGraph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);


        return graph;
    }

    public static DirectedGraph getInstance() {
        return directedGraph;
    }
}
