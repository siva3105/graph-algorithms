package models;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> adjVertices;

    public Vertex(int data) {
        this.data = data;
        this.adjVertices = new ArrayList<>();
    }

    public int getdata() {
        return data;
    }

    public void setdata(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(List<Vertex> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public void addAdjacentVertex(Vertex vertex) {
        this.adjVertices.add(vertex);
    }
}
