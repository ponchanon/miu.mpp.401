package may2017;

import java.time.LocalDate;

public class CheckoutRecordEntry {	
	
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendItem;
	private ItemType type;
	
	public CheckoutRecordEntry(LendingItem lendItem,LocalDate checkoutDate, LocalDate dueDate,ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendItem = lendItem;
		this.type = type;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public ItemType getLendingItemType() {		
		return type;
	}
	public LendingItem getLendingItem() {
		return lendItem;
	}	
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
}
