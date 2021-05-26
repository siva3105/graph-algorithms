package algoritmchecker;

import models.VertexToDetectCycle;
import applications.dfs.CycleDetector;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionChecker implements Checker {
    @Override
    public void check() {
        VertexToDetectCycle VertexToDetectCycle0 = new VertexToDetectCycle(0);
        VertexToDetectCycle VertexToDetectCycle1 = new VertexToDetectCycle(1);
        VertexToDetectCycle VertexToDetectCycle2 = new VertexToDetectCycle(2);
        VertexToDetectCycle VertexToDetectCycle3 = new VertexToDetectCycle(3);
        VertexToDetectCycle VertexToDetectCycle4 = new VertexToDetectCycle(4);

        VertexToDetectCycle0.addAdjacentVertex(VertexToDetectCycle1);
        VertexToDetectCycle2.addAdjacentVertex(VertexToDetectCycle0);
        VertexToDetectCycle1.addAdjacentVertex(VertexToDetectCycle2);
        VertexToDetectCycle1.addAdjacentVertex(VertexToDetectCycle4);
        VertexToDetectCycle1.addAdjacentVertex(VertexToDetectCycle3);

        List<VertexToDetectCycle> graph = new ArrayList<>();
        graph.add(VertexToDetectCycle0);
        graph.add(VertexToDetectCycle1);
        graph.add(VertexToDetectCycle2);
        graph.add(VertexToDetectCycle3);
        graph.add(VertexToDetectCycle4);
        
        CycleDetector cycleDetector = new CycleDetector(graph);
        cycleDetector.detect();
        
    }
}
