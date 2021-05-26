import algoritmchecker.*;

public class Main {
    public static void main(String[] args) {
        BfsChecker bfsChecker = new BfsChecker();
        bfsChecker.check();

        System.out.println();

        DfsStackChecker dfsStackChecker = new DfsStackChecker();
        dfsStackChecker.check();

        System.out.println();

        DfsRecursiveChecker dfsRecursiveChecker = new DfsRecursiveChecker();
        dfsRecursiveChecker.check();

        System.out.println();

        TopologicalSortChecker topologicalSortChecker = new TopologicalSortChecker();
        topologicalSortChecker.check();

        System.out.println();

        CycleDetectionChecker cycleDetectionChecker = new CycleDetectionChecker();
        cycleDetectionChecker.check();

        System.out.println();

        DijkstraChecker dijkstraChecker = new DijkstraChecker();
        dijkstraChecker.check();

        System.out.println();

        BellmanFordChecker bellmanFordChecker = new BellmanFordChecker();
        bellmanFordChecker.check();

        System.out.println();

        DagShortestPathChecker dagShortestPathChecker = new DagShortestPathChecker();
        dagShortestPathChecker.check();

        System.out.println();

        Kruskalchecker kruskalchecker = new Kruskalchecker();
        kruskalchecker.check();

    }
}
