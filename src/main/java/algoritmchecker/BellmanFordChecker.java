package algoritmchecker;

import models.Edge;
import models.VertexForWeightedGraph;
import shortestpathalgo.BellmanFord;
import shortestpathalgo.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordChecker implements Checker {
    @Override
    public void check() {
        VertexForWeightedGraph vertexA = new VertexForWeightedGraph("A");
        VertexForWeightedGraph vertexB = new VertexForWeightedGraph("B");
        VertexForWeightedGraph vertexC = new VertexForWeightedGraph("C");
        VertexForWeightedGraph vertexD = new VertexForWeightedGraph("D");
        VertexForWeightedGraph vertexE = new VertexForWeightedGraph("E");
        VertexForWeightedGraph vertexF = new VertexForWeightedGraph("F");
        VertexForWeightedGraph vertexG = new VertexForWeightedGraph("G");
        VertexForWeightedGraph vertexH = new VertexForWeightedGraph("H");

        Edge<VertexForWeightedGraph> edgeAB = new Edge<>(vertexA, vertexB, 5);
        Edge<VertexForWeightedGraph> edgeAH = new Edge<>(vertexA, vertexH, 8);
        Edge<VertexForWeightedGraph> edgeAE = new Edge<>(vertexA, vertexE, 9);
        Edge<VertexForWeightedGraph> edgeEH = new Edge<>(vertexE, vertexH, 5);
        Edge<VertexForWeightedGraph> edgeEF = new Edge<>(vertexE, vertexF, 4);
        Edge<VertexForWeightedGraph> edgeEG = new Edge<>(vertexE, vertexG, 20);
        Edge<VertexForWeightedGraph> edgeBH = new Edge<>(vertexB, vertexH, 4);
        Edge<VertexForWeightedGraph> edgeBC = new Edge<>(vertexB, vertexC, 12);
        Edge<VertexForWeightedGraph> edgeBD = new Edge<>(vertexB, vertexD, 15);
        Edge<VertexForWeightedGraph> edgeHC = new Edge<>(vertexH, vertexC, 7);
        Edge<VertexForWeightedGraph> edgeHF = new Edge<>(vertexH, vertexF, 6);
        Edge<VertexForWeightedGraph> edgeCD = new Edge<>(vertexC, vertexD, 3);
        Edge<VertexForWeightedGraph> edgeCG = new Edge<>(vertexC, vertexG, 11);
        Edge<VertexForWeightedGraph> edgeFC = new Edge<>(vertexF, vertexC, 1);
        Edge<VertexForWeightedGraph> edgeFG = new Edge<>(vertexF, vertexG, 13);
        Edge<VertexForWeightedGraph> edgeDG = new Edge<>(vertexD, vertexG, 9);

        vertexA.addEdge(edgeAB);
        vertexA.addEdge(edgeAH);
        vertexA.addEdge(edgeAE);
        vertexB.addEdge(edgeBD);
        vertexB.addEdge(edgeBC);
        vertexB.addEdge(edgeBH);
        vertexH.addEdge(edgeHC);
        vertexH.addEdge(edgeHF);
        vertexE.addEdge(edgeEH);
        vertexE.addEdge(edgeEF);
        vertexE.addEdge(edgeEG);
        vertexD.addEdge(edgeDG);
        vertexC.addEdge(edgeCD);
        vertexC.addEdge(edgeCG);
        vertexF.addEdge(edgeFC);
        vertexF.addEdge(edgeFG);

        List<VertexForWeightedGraph> vertexList = new ArrayList<>();
        vertexList.add(vertexA);
        vertexList.add(vertexB);
        vertexList.add(vertexC);
        vertexList.add(vertexD);
        vertexList.add(vertexE);
        vertexList.add(vertexF);
        vertexList.add(vertexG);
        vertexList.add(vertexH);

        List<Edge<VertexForWeightedGraph>> edgeList = new ArrayList<>();
        edgeList.add(edgeAB);
        edgeList.add(edgeAH);
        edgeList.add(edgeAE);
        edgeList.add(edgeEH);
        edgeList.add(edgeEF);
        edgeList.add(edgeEG);
        edgeList.add(edgeBH);
        edgeList.add(edgeBC);
        edgeList.add(edgeBD);
        edgeList.add(edgeHC);
        edgeList.add(edgeHF);
        edgeList.add(edgeCD);
        edgeList.add(edgeCG);
        edgeList.add(edgeFC);
        edgeList.add(edgeFG);
        edgeList.add(edgeDG);

        List<VertexForWeightedGraph> graph = new ArrayList<>();
        graph.add(vertexA);
        graph.add(vertexB);
        graph.add(vertexC);
        graph.add(vertexD);
        graph.add(vertexE);
        graph.add(vertexF);
        graph.add(vertexG);
        graph.add(vertexH);

        algoCaller(vertexList, edgeList, graph);

        System.out.println();

        VertexForWeightedGraph vertex1A = new VertexForWeightedGraph("A");
        VertexForWeightedGraph vertex1B = new VertexForWeightedGraph("B");
        VertexForWeightedGraph vertex1C = new VertexForWeightedGraph("C");
        VertexForWeightedGraph vertex1D = new VertexForWeightedGraph("D");

        Edge<VertexForWeightedGraph> edge1AB = new Edge<>(vertex1A, vertex1B, 1);
        Edge<VertexForWeightedGraph> edge1BC = new Edge<>(vertex1B, vertex1C, 2);
        Edge<VertexForWeightedGraph> edge1CB = new Edge<>(vertex1C, vertex1B, -4);
        Edge<VertexForWeightedGraph> edge1CD = new Edge<>(vertex1C, vertex1D, 3);

        vertex1A.addEdge(edge1AB);
        vertex1B.addEdge(edge1BC);
        vertex1C.addEdge(edge1CB);
        vertex1C.addEdge(edge1CD);

        List<VertexForWeightedGraph> graphWithNegativeCycle = new ArrayList<>();
        graphWithNegativeCycle.add(vertex1A);
        graphWithNegativeCycle.add(vertex1B);
        graphWithNegativeCycle.add(vertex1C);
        graphWithNegativeCycle.add(vertex1D);

        List<VertexForWeightedGraph> vertexList1= new ArrayList<>();
        vertexList1.add(vertex1A);
        vertexList1.add(vertex1B);
        vertexList1.add(vertex1C);
        vertexList1.add(vertex1D);

        List<Edge<VertexForWeightedGraph>> edgeList1 = new ArrayList<>();
        edgeList1.add(edge1AB);
        edgeList1.add(edge1BC);
        edgeList1.add(edge1CD);
        edgeList1.add(edge1CB);

        algoCaller(vertexList1, edgeList1, graphWithNegativeCycle);
    }

    private void algoCaller(List<VertexForWeightedGraph> vertexList, List<Edge<VertexForWeightedGraph>> edgeList, List<VertexForWeightedGraph> graph) {
        BellmanFord bellmanFord = new BellmanFord(vertexList, edgeList);
        VertexForWeightedGraph sourceVertex = vertexList.get(0);
        bellmanFord.shortestPathFromSource(sourceVertex, graph);

    }

}
