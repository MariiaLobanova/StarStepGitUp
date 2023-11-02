package scr.MorningSession.Class3110Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Graph Representation:
//Create a Java class named Graph that will represent a graph using adjacency lists.
//Initialize an empty adjacency list (a map) in the constructor.
//Implement a method called addVertex(int v) to add a vertex to the graph by adding an entry in the adjacency list.
//Implement a method called addEdge(int v1, int v2) to add an edge between two vertices in the graph.
// Make sure to add both vertices to each other's adjacency lists for an undirected graph.
//Implement a method called getNeighbors(int v) that returns a list of neighbors for a given vertex v.
public class Graphs {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graphs() {
        adjacencyList = new HashMap<>();
    }
    public void  addVertex(int v){
        adjacencyList.put(v,new ArrayList<>());
    }
    public void addEdge(int v1, int v2){
        if(adjacencyList.containsKey(v1)&&adjacencyList.containsKey(v2));
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }
    public List<Integer> getNeighbors(int v) {
        if (adjacencyList.containsKey(v)) {
            return adjacencyList.get(v);
        }
        return new ArrayList<>();
}

    public static void main(String[] args) {
        Graphs graphs= new Graphs();

        graphs.addVertex(1);
        graphs.addVertex(2);
        graphs.addVertex(3);

        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(3,1);

        System.out.println("Neighbors of 1: " + graphs.getNeighbors(1));
        System.out.println("Neighbors of 2: " + graphs.getNeighbors(2));
        System.out.println("Neighbors of 3: " + graphs.getNeighbors(3));

    }
}
