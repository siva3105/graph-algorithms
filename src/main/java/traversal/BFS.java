package traversal;

import models.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BFS implements Operation {

    private Queue<Vertex> queue = new LinkedList<>();

    @Override
    public void traverse(Vertex vertex) {
        queue.add(vertex);
        vertex.setVisited(true);
        while (!queue.isEmpty()) {
            Vertex dequeuedVertex = queue.remove();
            System.out.print(dequeuedVertex.getdata() + " --> ");
            for(Vertex adjVertex : dequeuedVertex.getAdjVertices()) {
                if (!adjVertex.isVisited()) {
                    queue.add(adjVertex);
                    adjVertex.setVisited(true);
                }
            }
        }
        System.out.print("END");
    }
}
