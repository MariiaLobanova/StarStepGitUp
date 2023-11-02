package scr.MorningSession.Class3110Graphs;

import java.util.HashSet;
import java.util.Set;

//.Depth-First Search (DFS):
//Create a method named dfs that takes a Graph object, a starting vertex v, and a Set to keep track of visited vertices.
//Inside the dfs method, mark the current vertex v as visited by adding it to the visited set.
//Print the value of the current vertex v to show the traversal order.
//Iterate through the neighbors of v using graph.getNeighbors(v) and recursively call the dfs method for unvisited neighbors.
//
//Depth-First Search (DFS) is a traversal algorithm that explores as far as possible along each branch before backtracking
public class E2 {
    public static void dfs(Graphs graphs, int v, Set<Integer> visited){
        visited.add(v);
        System.out.println(v);

        for (int neighbor: graphs.getNeighbors(v)){
            if (!visited.contains(neighbor)){
                dfs(graphs, neighbor,visited);
            }
        }
    }

    public static void main(String[] args) {
        Graphs graphs = new Graphs();

        graphs.addVertex(1);
        graphs.addVertex(2);
        graphs.addVertex(3);
        graphs.addVertex(4);

        graphs.addEdge(1, 2);
        graphs.addEdge(2, 3);
        graphs.addEdge(3, 4);
        graphs.addEdge(4, 1);

        Set<Integer> visited = new HashSet<>();

    }

}
