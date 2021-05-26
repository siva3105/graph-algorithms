package shortestpathalgo;

import models.Edge;
import models.Vertex;
import models.VertexForWeightedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    private PriorityQueue<VertexForWeightedGraph> queue;

    public Dijkstra() {
        this.queue = new PriorityQueue<>();
    }

    public void shortestPathFromSource(VertexForWeightedGraph source) {
        //dijkstra will work for negitive weights edges but not work for negtive weighted cycle --> cycle whose sum of all edges is negative
        this.queue.add(source);
        source.setMinDistance(0);
        while (!this.queue.isEmpty()) {
            VertexForWeightedGraph vertex = this.queue.remove();
            vertex.setVisited(true);
            vertex.getAdjEdges().forEach(adjEdge -> {
                VertexForWeightedGraph adjVertex = (VertexForWeightedGraph) adjEdge.getTargetVertex();
                if (!adjVertex.isVisited()) {
                    if (vertex.getMinDistance() + adjEdge.getWeight() < adjVertex.getMinDistance()) {
                        adjVertex.setMinDistance(vertex.getMinDistance() + adjEdge.getWeight());
                        adjVertex.setPrcedecessor(vertex);
                    }
                    this.queue.add(adjVertex);
                }
            });
        }

    }

    public void getShortestPath(VertexForWeightedGraph targetVertex) {
        List<VertexForWeightedGraph> vertexForWeightedGraphs = new ArrayList<>();
        vertexForWeightedGraphs.add(targetVertex);
        VertexForWeightedGraph temp = targetVertex;
        while (temp.getPrcedecessor() != null) {
            vertexForWeightedGraphs.add(temp.getPrcedecessor());
            temp = temp.getPrcedecessor();
        }
        Collections.reverse(vertexForWeightedGraphs);
        for (VertexForWeightedGraph vertex : vertexForWeightedGraphs) {
            System.out.print(vertex.toString() + " --> ");
        }
        System.out.println(targetVertex.getMinDistance());
    }
}