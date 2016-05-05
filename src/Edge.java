
public class Edge {
	private int from;
	private int to;
	private int weight;
	
	public Edge(int from, int to, int weight){
		this.setFrom(from);
		this.setTo(to);
		this.setWeight(weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}
	
}
