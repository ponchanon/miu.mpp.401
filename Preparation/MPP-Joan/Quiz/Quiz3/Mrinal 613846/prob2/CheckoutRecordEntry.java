package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	private ItemType type;
	private LendingItem item;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.item = item;
		checkoutDate = chDate;
		this.dueDate = dueDate;
		this.type = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public ItemType getLendingItemType() {
		return type;
	}

	public LendingItem getLendingItem() {
		return item;
	}

}
