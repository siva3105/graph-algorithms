package algoritmchecker;

import models.Vertex;
import traversal.BFS;

import java.util.List;

public class BfsChecker implements Checker {
    @Override
    public void check() {
        List<Vertex> graph = new BfsChecker().getDefaultGraph();
        BFS bfs = new BFS();
        bfs.traverse(graph.get(0));
    }
}
