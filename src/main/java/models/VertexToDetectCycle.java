package models;

import java.util.ArrayList;
import java.util.List;

public class VertexToDetectCycle {
    private int data;
    private boolean visited;
    private boolean beingVisited;
    private List<VertexToDetectCycle> adjVertices;

    public VertexToDetectCycle(int data) {
        this.data = data;
        this.adjVertices = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<VertexToDetectCycle> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(List<VertexToDetectCycle> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public void addAdjacentVertex(VertexToDetectCycle vertex) {
        this.adjVertices.add(vertex);
    }
}
