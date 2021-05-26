package shortestpathalgo;

import models.Edge;
import models.Vertex;
import models.VertexForWeightedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DagShorteshPath {

    private Stack<VertexForWeightedGraph> stack;
    private List<VertexForWeightedGraph> graph;

    public DagShorteshPath(List<VertexForWeightedGraph> graph) {
        this.stack = new Stack<>();
        this.graph = graph;
    }


    public void shortestPathFromSource(VertexForWeightedGraph source) {
        Stack<VertexForWeightedGraph> vertexList = topologicalSort();
        Collections.reverse(vertexList);
        source.setMinDistance(0);
        for (VertexForWeightedGraph vertex : vertexList) {
            for (Edge<VertexForWeightedGraph> edge : vertex.getAdjEdges()) {
                VertexForWeightedGraph u = edge.getStartVertex();
                VertexForWeightedGraph v = edge.getTargetVertex();
                if (u.getMinDistance() == Double.MAX_VALUE)
                    continue;
                if (u.getMinDistance() + edge.getWeight() < v.getMinDistance()) {
                    v.setMinDistance(u.getMinDistance() + edge.getWeight());
                    v.setPrcedecessor(u);
                }
            }
        }
        for (VertexForWeightedGraph vertex : graph) {
            if (vertex.getMinDistance() == Double.MAX_VALUE) {
                System.out.println("not path between source vertex " + source.getName() + " to target vertex " + vertex.getName());
            } else {
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

    public Stack<VertexForWeightedGraph> topologicalSort() {
        for (int i = 0; i < this.graph.size(); i++) {
            if (!graph.get(i).isVisited()) {
                dfsHelper(graph.get(i));
            }
        }
//        printStack();
        return this.stack;
    }

    private void dfsHelper(VertexForWeightedGraph vertex) {
        vertex.setVisited(true);
        for (Edge<VertexForWeightedGraph> edge : vertex.getAdjEdges()) {
            if (!edge.getTargetVertex().isVisited()) {
                dfsHelper(edge.getTargetVertex());
            }
        }
        this.stack.push(vertex);
    }
}
