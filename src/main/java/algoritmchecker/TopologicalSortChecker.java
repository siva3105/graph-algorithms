package algoritmchecker;

import models.Vertex;
import applications.dfs.TopologicalSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortChecker implements Checker {
    @Override
    public void check() {
        Vertex vertex0 = new Vertex(0);
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex2.addAdjacentVertex(vertex3);
        vertex3.addAdjacentVertex(vertex1);
        vertex4.addAdjacentVertex(vertex0);
        vertex4.addAdjacentVertex(vertex1);
        vertex5.addAdjacentVertex(vertex0);
        vertex5.addAdjacentVertex(vertex2);

        List<Vertex> graph = new ArrayList<>();
        graph.add(vertex0);
        graph.add(vertex1);
        graph.add(vertex2);
        graph.add(vertex3);
        graph.add(vertex4);
        graph.add(vertex5);

        TopologicalSort topologicalSort = new TopologicalSort(graph);
        Stack<Vertex> stack = topologicalSort.sort();
        topologicalSort.printStack(stack);
    }
}
