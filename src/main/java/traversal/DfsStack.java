package traversal;

import models.Vertex;

import java.util.Stack;

public class DfsStack implements Operation {
    private Stack<Vertex> stack = new Stack<>();

    @Override
    public void traverse(Vertex vertex) {
        vertex.setVisited(true);
        stack.push(vertex);
        while (!stack.isEmpty()) {
            Vertex popedVertex = stack.pop();
            System.out.print(popedVertex.getdata() + " --> ");
            for (Vertex adjVertex : popedVertex.getAdjVertices()) {
                if (!adjVertex.isVisited()) {
                    adjVertex.setVisited(true);
                    stack.push(adjVertex);
                }
            }
        }
        System.out.print("END");
    }
}
