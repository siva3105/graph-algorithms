package algoritmchecker;

import minspanningtrees.kruskal.Kruskal;
import models.Edge;
import models.KruskalVertex;

import java.util.ArrayList;
import java.util.List;

public class Kruskalchecker implements Checker {
    @Override
    public void check() {
        List<KruskalVertex> vertexList = new ArrayList<>();
        vertexList.add(new KruskalVertex("A"));
        vertexList.add(new KruskalVertex("B"));
        vertexList.add(new KruskalVertex("C"));
        vertexList.add(new KruskalVertex("D"));
        vertexList.add(new KruskalVertex("E"));
        vertexList.add(new KruskalVertex("F"));
        vertexList.add(new KruskalVertex("G"));
        vertexList.add(new KruskalVertex("H"));

        List<Edge<KruskalVertex>> edgeList = new ArrayList<>();
        edgeList.add(new Edge<>(vertexList.get(0), vertexList.get(1), 3));
        edgeList.add(new Edge<>(vertexList.get(0), vertexList.get(2), 2));
        edgeList.add(new Edge<>(vertexList.get(0), vertexList.get(3), 5));
        edgeList.add(new Edge<>(vertexList.get(1), vertexList.get(5), 13));
        edgeList.add(new Edge<>(vertexList.get(1), vertexList.get(3), 2));
        edgeList.add(new Edge<>(vertexList.get(2), vertexList.get(4), 5));
        edgeList.add(new Edge<>(vertexList.get(2), vertexList.get(3), 2));
        edgeList.add(new Edge<>(vertexList.get(3), vertexList.get(4), 4));
        edgeList.add(new Edge<>(vertexList.get(3), vertexList.get(5), 6));
        edgeList.add(new Edge<>(vertexList.get(3), vertexList.get(6), 3));
        edgeList.add(new Edge<>(vertexList.get(4), vertexList.get(6), 6));
        edgeList.add(new Edge<>(vertexList.get(5), vertexList.get(6), 2));
        edgeList.add(new Edge<>(vertexList.get(5), vertexList.get(7), 3));
        edgeList.add(new Edge<>(vertexList.get(6), vertexList.get(7), 6));

        Kruskal kruskal = new Kruskal(vertexList, edgeList);
        kruskal.findMinSpanningTree();
    }
}
