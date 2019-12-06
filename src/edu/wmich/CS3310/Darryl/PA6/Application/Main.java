package edu.wmich.CS3310.Darryl.PA6.Application;

import java.io.IOException;

import edu.wmich.CS3310.Darryl.PA6.Implementation.DisjointSet;
import edu.wmich.CS3310.Darryl.PA6.Implementation.Graph;

public class Main {

	public static void main(String[] args) throws IOException {

		//Initialize a min cost spanning tree graph with hard coded vertices
		//and edges
		Graph g = new Graph(6,new DisjointSet(6));
		g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 3);
        g.addEdge(1, 2, 1);
        g.addEdge(1, 3, 2);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 2);
        g.addEdge(4, 5, 6);
        
		//call kruskal’s implementation to complete the min cost spanning tree and return
		// minimum cost
		System.out.println("Minimum Spanning Tree cost: "+g.calculateMST());
		//print edges of the minimum cost spanning tree
		g.printMST();
	}


}
