package serverside;

import java.util.ArrayList;

public class TransactionList {
	private ArrayList<Transaction> transactions;
	
	public TransactionList() {
		this.transactions = new ArrayList<Transaction>();
	}
	
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	public int size() {
		return this.transactions.size();
	}
	
	public ArrayList<Transaction> getTransactionsForKiosk(String kiosk) {
		ArrayList<Transaction> transactionsForKiosk = new ArrayList<Transaction>();
		
		for (int i = 0; i < this.transactions.size(); i++) {
			Transaction transaction = this.transactions.get(i);
			if (transaction.getKiosk().equals(kiosk)) {
				transactionsForKiosk.add(transaction);
			}
		}
		
		return transactionsForKiosk;
	}
	
	public ArrayList<Transaction> getTransactionsForTransactionType(String type) {
		ArrayList<Transaction> transactionsForType = new ArrayList<Transaction>();
		
		for (int i = 0; i < this.transactions.size(); i++) {
			Transaction transaction = this.transactions.get(i);
			if (transaction.getItemType() == type) {
				transactionsForType.add(transaction);
			}
		}
		
		return transactionsForType;
	}
}
