package minspanningtrees.kruskal;

import models.KruskalVertex;
import models.Node;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNodes; //representives

    public DisjointSet(List<KruskalVertex> vertices) {
        this.rootNodes = new ArrayList<>();
        for (KruskalVertex vertex : vertices) {
            Node node = new Node(rootNodes.size(), 0, null);
            node.setParentNode(node);
            vertex.setNode(node);
            this.rootNodes.add(node); //ith index node will be the ith index rootnode
            nodeCount++;
            setCount++;
        }
    }

    //find by path compression all the path nodes from n to root will set their parents as root
    public Node find(Node n) {
        if (n.getParentNode() != n){
            Node node = find(n.getParentNode());
            n.setParentNode(node);
            return node;
        }
        else {
            return n;
        }
    }
    // union by rank the smaller rank node will be attached to higher rank node
    public void union(Node node1, Node node2){
        int index1 = find(node1).getId();
        int index2 = find(node2).getId();
        if (index1 == index2)
            return;
        Node root1 = this.rootNodes.get(index1);
        Node root2 = this .rootNodes.get(index2);
        if (root1.getRank() > root2.getRank()){
            root2.setParentNode(root1);
        } else if (root1.getRank() < root2.getRank()) {
            root1.setParentNode(root2);
        } else {
            root1.setParentNode(root2);
            root2.setRank(root2.getRank() + 1);
        }
        this.setCount--;
    }
}
