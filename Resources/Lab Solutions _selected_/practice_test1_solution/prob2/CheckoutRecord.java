package prob2;
import java.util.*;
public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<>();
	
	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutEntryList.add(entry);
	}
	
}
