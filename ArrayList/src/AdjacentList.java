import java.util.ArrayList;

public class AdjacentList {
	
	// adding edge
	static void addingEdge(ArrayList<ArrayList<Integer >> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	

	public static void main(String[] args) {
		
		// creating a graph with 5 vertices
		int vertex=5;
		ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(vertex);
		
		// initialize the size with vertex
		for(int i=0;i<vertex;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		
		// adding edge one by one
		addingEdge(adj, 0, 1);	addingEdge(adj, 0, 4);
		addingEdge(adj, 1, 2);	addingEdge(adj, 1, 3);
		addingEdge(adj, 1, 4);	addingEdge(adj, 2, 3);
		addingEdge(adj, 3, 4);
		 // printing the edge
		
		printGraph(adj);

	}


	// A utility function to print the adjacency list 
		// representation of graph 
	private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		
		for(int i=0;i<adj.size();i++)
		{
			System.out.println("\nAdjacency list of vertex " + i);
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(" -> " + adj.get(i).get(j));
			}
			System.out.println();
		}
		
	}

}
