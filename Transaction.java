package serverside;

public class Transaction {
	private String name;
	private String kiosk;
	private String itemType;
	private double price;

	public Transaction (String name, String kiosk, String type, double price)
	{
		this.setName(name);
		this.setKiosk(kiosk);
		this.setPrice(price);
		this.setItemType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKiosk() {
		return kiosk;
	}

	public void setKiosk(String kiosk) {
		this.kiosk = kiosk;
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
		return String.format("Transaction:%s,%s,%.2f,%s", name, kiosk, price, itemType);
	}

}
