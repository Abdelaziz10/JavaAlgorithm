package domain;

public class Fruits implements Comparable<Fruits>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	
	public Fruits(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Fruits fruits) {
		// TODO Auto-generated method stub
		int compareQuantity = ((Fruits) fruits).getQuantity();

		//ascending order
		return this.quantity - compareQuantity;
	}
	

}
