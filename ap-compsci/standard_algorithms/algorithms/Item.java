package algorithms;

public class Item {
	private int price;
	private int quantity;
	private String name;
	
	public Item(String label, int expense, int amount){
		price=expense;
		name=label;
		quantity=amount;
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}

}
