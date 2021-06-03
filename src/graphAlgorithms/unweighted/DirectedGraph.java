package graphAlgorithms.unweighted;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DirectedGraph {
    private final Map<Integer, Set<Integer>> nodes;

    public DirectedGraph() {
        this.nodes = new HashMap<>();
    }

    Map<Integer, Set<Integer>> getNodes() {
        return nodes;
    }

    public void addEdge(int source, int target) {
        nodes.computeIfAbsent(source,  k -> new HashSet<>());
        nodes.computeIfAbsent(target, k -> new HashSet<>());
        nodes.get(source).add(target);
    }
}
