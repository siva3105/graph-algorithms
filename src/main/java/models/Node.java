package models;

public class Node {

    private int id;
    private int rank;
    private Node parentNode;

    public Node(int id, int rank, Node parentNode) {
        this.id = id;
        this.rank = rank;
        this.parentNode = parentNode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }
}
