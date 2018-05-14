import java.util.ArrayList;

public class Basket {
	
	private ArrayList<BasketItem> basketItems;
	
	public Basket() {
		this.basketItems = new ArrayList<BasketItem>();
	}
	
	public void addItem(BasketItem basketItem) {
		this.basketItems.add(basketItem);
	}
	
	public double getTotal() {
		double total = 0.0;
		
		for(int i = 0; i < this.basketItems.size(); i++) {
			total += basketItems.get(i).getPrice();
		}
			
		return total;
	}
	
	public int getSize() {
		return basketItems.size();
	}
	
	public BasketItem getItem(int i) {
		return basketItems.get(i);
	}
	
}
