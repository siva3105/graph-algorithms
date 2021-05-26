package applications.dfs;

import models.Vertex;

import java.util.List;
import java.util.Stack;

public class TopologicalSort{
    private Stack<Vertex> stack;
    private List<Vertex> graph;

    public TopologicalSort(List<Vertex> graph) {
        this.graph = graph;
        this.stack = new Stack<>();
    }

    public void printStack(Stack<Vertex> stack) {
        while (!stack.isEmpty()){
            System.out.print(stack.pop().getdata() + " --> ");
        }
        System.out.print("END");
    }

    public Stack<Vertex> sort() {
        for (int i = 0; i < this.graph.size(); i++) {
            if (!graph.get(i).isVisited()) {
                dfsHelper(graph.get(i));
            }
        }
//        printStack();
        return this.stack;
    }

    private void dfsHelper(Vertex vertex) {
        vertex.setVisited(true);
        for (Vertex adj : vertex.getAdjVertices()) {
            if (!adj.isVisited()) {
                dfsHelper(adj);
            }
        }
        this.stack.push(vertex);
    }
}
