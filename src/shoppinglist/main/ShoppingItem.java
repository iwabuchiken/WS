package shoppinglist.main;

public class ShoppingItem {

	//
	String store, name, genre;
	int price;
	
	public ShoppingItem(String store, String name, int price, String genre) {
		
		this.store = store;
		this.name = name;
		this.price = price;
		this.genre = genre;
		
	}//public ShoppingItem(String store, String name, int price, String genre)

	public String getStore() {
		return store;
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
