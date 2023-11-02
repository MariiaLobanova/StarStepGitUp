package scr.MorningSession.Class3110Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
 //3.Breadth-First Search (BFS):
 //Create a method named bfs that takes a Graph object and a starting vertex start.
 //Initialize an empty Set called visited and a Queue to store vertices to be processed.
 //Add the start vertex to the visited set and enqueue it in the queue.
 //Use a while loop to process vertices in the queue.
 //Dequeue a vertex from the queue, print it, and then enqueue its unvisited neighbors
 // into the queue while marking them as visited.
 //
 //Breadth-First Search (BFS) is a traversal algorithm that explores all the neighbor nodes
 // at the current depth before moving on to the nodes at the next depth level.
public class E3 {
    public static void bfs(Graphs graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : graph.getNeighbors(v)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graphs graph = new Graphs();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("Breadth-First Search (BFS) Traversal:");
        bfs(graph, 1); // Start BFS from vertex 1.
    }
}
