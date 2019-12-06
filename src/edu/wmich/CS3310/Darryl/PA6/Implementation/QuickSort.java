package edu.wmich.CS3310.Darryl.PA6.Implementation;

import java.util.List;

import edu.wmich.CS3310.Darryl.PA6.Interface.IEdge;

public class QuickSort {
	
	public int partition(List<IEdge>edge, int low, int high) { 
		
        int pivot = edge.get(high).getWeight();  
        int i = (low-1); // index of smaller element 
        
        for (int j=low; j<high; j++) 
        { 
            // smaller than the pivot 
            if (edge.get(j).getWeight() <= pivot) { 
                i++; 
                
                // swap 
                IEdge tempEdge = edge.get(i); 
                
                edge.get(i).setSource(edge.get(j).getSource());
                edge.get(i).setDestination(edge.get(j).getDestination());
                edge.get(i).setWeight(edge.get(j).getWeight());

                edge.get(j).setSource(tempEdge.getSource());
                edge.get(j).setDestination(tempEdge.getDestination());
                edge.get(j).setWeight(tempEdge.getWeight());
                
                
            } 
        } 
  
        // swap 
        IEdge tempEdge = edge.get(i+1);
        
        edge.get(i+1).setSource(edge.get(high).getSource());
        edge.get(i+1).setDestination(edge.get(high).getDestination());
        edge.get(i+1).setWeight(edge.get(high).getWeight());
        
        edge.get(high).setSource(tempEdge.getSource());
        edge.get(high).setDestination(tempEdge.getDestination());
        edge.get(high).setWeight(tempEdge.getWeight());
  
        return i+1; 
    } 
  
    public void qsort(List<IEdge>edge, int low, int high) { 
    	
        if (low < high) { 
            int pi = partition(edge, low, high); 
            qsort(edge, low, pi-1); 
            qsort(edge, pi+1, high); 
        } 
    }
}
