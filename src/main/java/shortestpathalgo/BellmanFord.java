package shortestpathalgo;

import models.Edge;
import models.VertexForWeightedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {

    private List<VertexForWeightedGraph> vertexList;
    private List<Edge<VertexForWeightedGraph>> edgeList;
    private boolean negativeCycle;

    public BellmanFord(List<VertexForWeightedGraph> vertexList, List<Edge<VertexForWeightedGraph>> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public void shortestPathFromSource(VertexForWeightedGraph source, List<VertexForWeightedGraph> graph) {
        source.setMinDistance(0);
        boolean isAnyDistanceChanged = false;
        // we do vertex length -1 because max distance between any two vertex can ber v-1 we are checking all posibilities and picking min one.
        for (int i = 0; i < vertexList.size() - 1; i++) {
            for (Edge edge : edgeList) {
                VertexForWeightedGraph u = (VertexForWeightedGraph) edge.getStartVertex();
                VertexForWeightedGraph v = (VertexForWeightedGraph) edge.getTargetVertex();
                if (u.getMinDistance() == Double.MAX_VALUE)
                    continue;
                if (u.getMinDistance() + edge.getWeight() < v.getMinDistance()) {
                    v.setMinDistance(u.getMinDistance() + edge.getWeight());
                    v.setPrcedecessor(u);
                }
            }
        }
        //if distances changes after v-1 iteration which means we have negative cycle
        for (Edge<VertexForWeightedGraph> edge : edgeList) {
            if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
                if(hasNegativeCycle(edge)){
                    System.out.println("contains negative cycle");
                    this.negativeCycle=true;
                    return;
                }
            }
        }

        if (!this.negativeCycle){
            for (VertexForWeightedGraph vertex : graph) {
                System.out.println("shortest distance from " + source.toString() + " to " + vertex.toString());
                getShortestPath(vertex);
            }
        }

    }

    private void getShortestPath(VertexForWeightedGraph targetVertex) {
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

    private boolean hasNegativeCycle(Edge<VertexForWeightedGraph> edge) {
        return edge.getStartVertex().getMinDistance() + edge.getWeight() < edge.getTargetVertex().getMinDistance();
    }
}
