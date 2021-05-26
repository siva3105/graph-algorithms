package minspanningtrees.kruskal;

import models.Edge;
import models.KruskalVertex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kruskal {

    private List<KruskalVertex> vertexList;
    private List<Edge<KruskalVertex>> edgeList;
    private List<Edge<KruskalVertex>> minSpanningTreeEdges;

    public Kruskal(List<KruskalVertex> vertexList, List<Edge<KruskalVertex>> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
        this.minSpanningTreeEdges = new ArrayList<>();
    }

    public void findMinSpanningTree() {
        DisjointSet disjointSet = new DisjointSet(this.vertexList);
        Collections.sort(edgeList);
        for (Edge<KruskalVertex> edge : edgeList) {
            KruskalVertex startVertex = edge.getStartVertex();
            KruskalVertex targetVertex = edge.getTargetVertex();
            if (disjointSet.find(startVertex.getNode()) != disjointSet.find(targetVertex.getNode())) {
                disjointSet.union(startVertex.getNode(), targetVertex.getNode());
                this.minSpanningTreeEdges.add(edge);
            }
            if(this.minSpanningTreeEdges.size() == this.vertexList.size() -1)
                break;
        }
        double minSum = 0;
        for (Edge<KruskalVertex> edge : this.minSpanningTreeEdges) {
            System.out.print(edge.getStartVertex().toString() + edge.getTargetVertex().toString() + " ( " +edge.getWeight() +" )"+" --> ");
            minSum = minSum + edge.getWeight();
        }
        System.out.println(minSum);

    }
}

