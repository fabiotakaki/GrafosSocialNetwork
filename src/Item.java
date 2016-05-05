/**
 * @author Fábio Takaki
 *
 */
public class Item {
	private int value;
	private int weight;
	private Item next;
	
	public Item(int value, int weight){
		this.setValue(value);
		this.setWeight(weight);
		this.setNext(null);
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
