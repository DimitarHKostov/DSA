package graphAlgorithms.unweighted;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFS {
    public void start(DirectedGraph graph, int startNode) {
        Map<Integer, Set<Integer>> nodes = graph.getNodes();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(startNode);
        queue.add(startNode);

        while(!queue.isEmpty()){
            int out = queue.poll();

            System.out.println(out);

            for(int neighbor: nodes.get(out)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.start(FixedGraph.getInstance(), FixedStartNode.getInstance());
    }
}
