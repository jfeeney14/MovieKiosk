
public class BasketItem {
	private String name;
	private String itemType;
	private double price;
	
	public BasketItem(String name, String itemType, double price) {
		this.name = name;
		this.itemType = itemType;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String toString() {
		return String.format("%s      $%.2f", name, price);
	}
}
