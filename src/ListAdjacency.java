
public class ListAdjacency extends ComputationalRepresentation{
	private List lists[];

	public ListAdjacency(int sizeVertex){
		super(sizeVertex);
		lists = new List[sizeVertex];
		for(int i=0; i<sizeVertex; i++){
			lists[i] = new List();
		}
	}
	
	public void addEdge(int u, int v, int w){
		lists[u].add(v, w);
	}
	
	public boolean verifyAdjacency(int u, int v){
		return lists[u].exist(v);
	}
	
	public int getWeight(int u, int v){
		return lists[u].getWeight(v);
	}
	
	
	public void show(){
		for(int i=0; i<super.sizeVertex; i++){
			System.out.print("||"+i+"||-->");
	        lists[i].show();
	        System.out.println();
		}
	}
	
}
