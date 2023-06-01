package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType itemType;
	public CheckoutRecordEntry(LendingItem item, LocalDate cDate,
			LocalDate dueDate, ItemType type) {
		this.checkoutDate = cDate;
		this.dueDate = dueDate;
		this.lendingItem = item;
		this.itemType = type;
		
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public ItemType getLendingItemType() {
		return itemType;
	}
	
}
