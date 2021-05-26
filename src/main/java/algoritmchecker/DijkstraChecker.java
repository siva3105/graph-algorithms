package algoritmchecker;

import models.Edge;
import models.VertexForWeightedGraph;
import shortestpathalgo.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class DijkstraChecker implements Checker {
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

        List<VertexForWeightedGraph> graph = new ArrayList<>();
        graph.add(vertexA);
        graph.add(vertexB);
        graph.add(vertexC);
        graph.add(vertexD);
        graph.add(vertexE);
        graph.add(vertexF);
        graph.add(vertexG);
        graph.add(vertexH);

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPathFromSource(vertexA);
        for(VertexForWeightedGraph vertex : graph){
            System.out.println("shortest distance from " + vertexA.toString()+ " to "+vertex.toString());
            dijkstra.getShortestPath(vertex);
        }

    }
}
