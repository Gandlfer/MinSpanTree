package edu.wmich.CS3310.Darryl.PA6.Implementation;

import java.util.List;

import edu.wmich.CS3310.Darryl.PA6.Interface.IEdge;
import edu.wmich.CS3310.Darryl.PA6.Interface.IGraph;

public class Graph implements IGraph {
	private List<IEdge> edges;
	private List<IEdge> mst;
	@Override
	public void addEdge(int source, int destination, int weight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAllEdges(List<IEdge> allEdges) {
		// TODO Auto-generated method stub
		edges=allEdges;
	}

	@Override
	public List<IEdge> getAllEdges() {
		// TODO Auto-generated method stub
		return edges;
	}

	@Override
	public void setVertices(int vertices) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IEdge> getMST() {
		// TODO Auto-generated method stub
		return mst;
	}

	@Override
	public void setMST(List<IEdge> mst) {
		// TODO Auto-generated method stub
		this.mst=mst;
	}

	@Override
	public int calculateMST() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<mst.size();i++) {
			sum+=mst.get(i).getWeight();
		}
		return sum;
	}

	@Override
	public void printMST() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printGraph() {
		// TODO Auto-generated method stub

	}

	@Override
	public DisjointSet getDisjoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDisjoint(DisjointSet disjoint) {
		// TODO Auto-generated method stub
		
	}

}
