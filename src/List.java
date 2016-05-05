/**
 * @author Fábio Takaki
 *
 */
public class List {
	private Item head;

	public List(){
		this.head = null;
	}
	
	public void add(int value, int weight){
		Item aux = new Item(value, weight);
		aux.setNext(head);
		head = aux;
	}
	
	public void addFinal(int value, int weight){
		Item aux = new Item(value, weight);
		if(head == null) head = aux;
		else{
			Item aux2 = head;
			while(aux2.getNext() != null)
				aux2 = aux2.getNext();
			aux2.setNext(aux);
		}
	}
	
	public boolean exist(int value){
		Item aux = head;
		while(aux != null){
			if(aux.getValue() == value){
				return true;
			}
			aux = aux.getNext();
		}
		return false;
	}
	
	public void show(){
		Item aux = head;
		while(aux != null){
			System.out.print(aux.getValue()+"(P:"+aux.getWeight()+")-->");
			aux = aux.getNext();
		}
		System.out.print("null");
	}
	
	public int getWeight(int value){
		Item aux = head;
		while(aux != null){
			if(aux.getValue() == value) return aux.getWeight();
			aux = aux.getNext();
		}
		return 0;
	}
	
	public Item getHead(){
		return head;
	}
	
	public void setHead(Item head){
		this.head = head;
	}
	
	
}
