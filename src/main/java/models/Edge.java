package models;

public class Edge<T> implements Comparable<Edge>{
    private T startVertex;
    private T targetVertex;
    private double weight;

    public Edge(T startVertex, T targetVertex, double weight) {
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
        this.weight = weight;
    }

    public T getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(T startVertex) {
        this.startVertex = startVertex;
    }

    public T getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(T targetVertex) {
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Double.compare(this.getWeight(),o.getWeight());
    }
}
