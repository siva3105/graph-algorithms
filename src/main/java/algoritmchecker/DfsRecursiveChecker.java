package algoritmchecker;

import models.Vertex;
import traversal.DfsRecursive;

import java.util.List;

public class DfsRecursiveChecker implements Checker {
    @Override
    public void check() {
        List<Vertex> graph = new DfsRecursiveChecker().getDefaultGraph();
        DfsRecursive dfsRecursive = new DfsRecursive();
        dfsRecursive.traverse(graph.get(0));
    }
}
