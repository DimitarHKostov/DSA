package graphAlgorithms.unweighted;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DFS {
    private void DFSUtil(int currentNode, Set<Integer> visited, Map<Integer, Set<Integer>> adjTable) {
        visited.add(currentNode);
        
        System.out.println(currentNode);

        for (int neighbor : adjTable.get(currentNode)) {
            if (!visited.contains(neighbor)) {
                DFSUtil(neighbor, visited, adjTable);
            }
        }
    }

    public void start(DirectedGraph graph, int startNode) {
        DFSUtil(startNode, new HashSet<>(), graph.getNodes());
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.start(FixedGraph.getInstance(), FixedStartNode.getInstance());
    }
}
