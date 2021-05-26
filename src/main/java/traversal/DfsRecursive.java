package traversal;

import models.Vertex;

public class DfsRecursive implements Operation {
    @Override
    public void traverse(Vertex vertex) {
        if (vertex != null) {
            traverseDfs(vertex);
            System.out.print("END");
        }
    }

    private void traverseDfs(Vertex vertex) {
        vertex.setVisited(true);
        System.out.print(vertex.getdata() + " --> ");
        for (Vertex adjVertex : vertex.getAdjVertices()) {
            if (!adjVertex.isVisited()) {
                traverseDfs(adjVertex);
            }
        }
    }
}
