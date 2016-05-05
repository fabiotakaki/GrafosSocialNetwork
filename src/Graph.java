import java.util.ArrayList;

public class Graph {
	private int sizeVertex;
	private ComputationalRepresentation rep;
	
	// para kruskal
	private ArrayList<Edge> edges;

	public Graph(int sizeVertex, ComputationalRepresentation rep){
		this.sizeVertex = sizeVertex;
		this.rep = rep;
		this.edges = new ArrayList<Edge>();
	}
	
	public ArrayList<Edge> getEdges(){
		return this.edges;
	}
	
	public void addEdge(int u, int v, int w){
		rep.addEdge(u, v, w);
		
		// para kruskal
		Edge item = new Edge(u, v, w);
		edges.add(item);
	}
	
	public boolean verifyAdjacency(int u, int v){
		return rep.verifyAdjacency(u, v);
	}
	
	public void show(){
		System.out.println("Número de Vértices: "+this.sizeVertex);
		rep.show();
	}
	
	public int getSizeVertex(){
		return sizeVertex;
	}
	
	public int getWeight(int u, int v){
		return rep.getWeight(u, v);
	}

}
