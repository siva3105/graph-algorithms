package algoritmchecker;

import models.Vertex;

import java.util.ArrayList;
import java.util.List;

public interface Checker {
    void check();

    default List<Vertex> getDefaultGraph() {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex1.addAdjacentVertex(vertex2);
        vertex1.addAdjacentVertex(vertex3);
        vertex3.addAdjacentVertex(vertex1);
        vertex3.addAdjacentVertex(vertex4);
        vertex4.addAdjacentVertex(vertex5);
        vertex2.addAdjacentVertex(vertex5);

        List<Vertex> graph = new ArrayList<>();
        graph.add(vertex1);
        graph.add(vertex2);
        graph.add(vertex3);
        graph.add(vertex4);
        graph.add(vertex5);

        return graph;
    }
}
