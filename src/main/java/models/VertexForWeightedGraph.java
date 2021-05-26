package models;

import java.util.ArrayList;
import java.util.List;

public class VertexForWeightedGraph implements Comparable<VertexForWeightedGraph> {

    private String name;
    private List<Edge> adjEdges;
    private boolean visited;
    private double minDistance = Double.MAX_VALUE;
    private VertexForWeightedGraph prcedecessor;

    public VertexForWeightedGraph(String name) {
        this.name = name;
        this.adjEdges = new ArrayList<>(); // to avoid npe
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjEdges() {
        return adjEdges;
    }

    public void setAdjEdges(List<Edge> adjEdges) {
        this.adjEdges = adjEdges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public VertexForWeightedGraph getPrcedecessor() {
        return prcedecessor;
    }

    public void setPrcedecessor(VertexForWeightedGraph prcedecessor) {
        this.prcedecessor = prcedecessor;
    }

    public void addEdge(Edge edge) {
        this.adjEdges.add(edge);
    }

    @Override
    public int compareTo(VertexForWeightedGraph otherVertex) {
        return Double.compare(this.minDistance,otherVertex.getMinDistance());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
