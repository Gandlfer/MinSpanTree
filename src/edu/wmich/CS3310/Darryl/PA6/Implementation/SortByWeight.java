package edu.wmich.CS3310.Darryl.PA6.Implementation;

import java.util.Comparator;

import edu.wmich.CS3310.Darryl.PA6.Interface.IEdge;

public class SortByWeight implements Comparator<IEdge> {

	@Override
	public int compare(IEdge o1, IEdge o2) {
		// TODO Auto-generated method stub
		return o1.getWeight()-o2.getWeight();
	}

}
