package applications.dfs;



import models.VertexToDetectCycle;

import java.util.List;

public class CycleDetector {

    private List<VertexToDetectCycle> graph;

    public CycleDetector(List<VertexToDetectCycle> graph) {
        this.graph = graph;
    }

    public void detect() {
        VertexToDetectCycle vertexToDetectCycle = this.graph.get(0);
        vertexToDetectCycle.setBeingVisited(true);
        vertexToDetectCycle.setVisited(true);
        dfsHelper(vertexToDetectCycle);

    }

    public void dfsHelper(VertexToDetectCycle vertexToDetectCycle) {

        vertexToDetectCycle.setVisited(false);
        for(VertexToDetectCycle adj : vertexToDetectCycle.getAdjVertices()) {
            if(adj.isBeingVisited())
            {
                System.out.println("Cycle detected");
                return;
            }
            if(!adj.isVisited()) {
                adj.setVisited(true);
                adj.setBeingVisited(true);
                dfsHelper(adj);
            }
        }
        vertexToDetectCycle.setBeingVisited(false);
        vertexToDetectCycle.setVisited(true);
    }
}
