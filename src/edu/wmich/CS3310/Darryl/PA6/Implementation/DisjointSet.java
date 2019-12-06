package edu.wmich.CS3310.Darryl.PA6.Implementation;

import edu.wmich.CS3310.Darryl.PA6.Interface.IDisjointSet;

public class DisjointSet implements IDisjointSet {
	private int[] parent;
	
	public DisjointSet (int v) {
		parent= new int[v];
	}
	@Override
	public void setParent(int[] parent) {
		// TODO Auto-generated method stub
		this.parent=parent;
	}

	@Override
	public int[] getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public void union(int i, int j) {
		// TODO Auto-generated method stub
		int x_set_parent = find(i);
        int y_set_parent = find(j);
        //make x as parent of y
        parent[y_set_parent] = x_set_parent;
	}

	@Override
	public int find(int i) {
		// TODO Auto-generated method stub
		if(parent[i]!=i) {
			return find(parent[i]);
		}
		return i;
	}

	@Override
	public void makeSet() {
		// TODO Auto-generated method stub
		for (int i = 0; i <parent.length ; i++) {
            parent[i] = i;
        }
	}

}
