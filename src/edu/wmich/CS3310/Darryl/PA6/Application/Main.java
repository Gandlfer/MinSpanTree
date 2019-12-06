package edu.wmich.CS3310.Darryl.PA6.Application;

import java.io.IOException;

import edu.wmich.CS3310.Darryl.PA6.Implementation.DisjointSet;
import edu.wmich.CS3310.Darryl.PA6.Implementation.Graph;

public class Main {

	public static void main(String[] args) throws IOException {

		//Initialize a min cost spanning tree graph with hard coded vertices
		//and edges
		Graph g = new Graph(7,new DisjointSet(7));
		g.addEdge(0, 5, 10);
        g.addEdge(0, 1, 28);
        g.addEdge(1, 6, 14);
        g.addEdge(1, 2, 16);
        g.addEdge(2, 3, 12);
        g.addEdge(3, 4, 22);
        g.addEdge(3, 6, 18);
        g.addEdge(6, 4, 24);
        g.addEdge(4, 5, 25);
        
        g.printGraph();
		//call kruskal’s implementation to complete the min cost spanning tree and return
		// minimum cost
		System.out.println("Minimum Spanning Tree cost: "+g.calculateMST());
		//print edges of the minimum cost spanning tree
		g.printMST();
	}
}
