package algoritmchecker;

import models.Vertex;
import traversal.DfsStack;

import java.util.List;

public class DfsStackChecker implements Checker {
    @Override
    public void check() {
        List<Vertex> graph = new DfsStackChecker().getDefaultGraph();
        DfsStack dfsStack = new DfsStack();
        dfsStack.traverse(graph.get(0));
    }
}
