package algorithms;

import java.util.ArrayList;

public class Inventory {
	//but what is an inventory tho
	
	ArrayList<Item> inventory = new ArrayList<Item>();
	public Inventory(ArrayList<Item> list){
		inventory=list;
	}
	
	
	//finding extreme (with objects that have more than 1 attribute)
	public String getExpensiveItem(){
		Item mostExpensive=inventory.get(0);
		for(int x=1;x<inventory.size();x++){
			if(inventory.get(x).getPrice()>mostExpensive.getPrice())
				mostExpensive=inventory.get(x);
		}
		return mostExpensive.getName();
	}
	//removing from an array list
	public void removeItem(String name){
		for(int x=inventory.size()-1;x>=0;x--){
			if((inventory.get(x).getName()).equals(name))
				inventory.remove(x);
		}
	}
	//remove adjacent duplicate values (ArrayList)
	public void removeDuplicates(){
		for(int x=inventory.size()-1;x>0;x--){
			if(inventory.get(x).equals(inventory.get(x-1)))
					inventory.remove(x);
		}
	}
	//traversing a 2D and a 1D data structure (String, List or array) simultaneously??
	public Item[][] table(){
		
	}
	//inserting into a sorted list (without binary search) (ArrayList)
	public void insert(Item object){
		int price=object.getPrice();
		int x=0;
		while( x<inventory.size()&& price>inventory.get(x).getPrice()){
			x++;
		}
		inventory.add(x,object);
	}
	
	//consolidating elements (with and without a new array) (array)
	public void consolidate(){
		
	}
	

}
