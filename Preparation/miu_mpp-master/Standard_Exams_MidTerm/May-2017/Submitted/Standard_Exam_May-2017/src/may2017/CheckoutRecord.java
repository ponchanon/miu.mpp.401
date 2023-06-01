package may2017;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> cRecordEntryList = new ArrayList<CheckoutRecordEntry>();
	
	public List<CheckoutRecordEntry> getcRecordEntryList() {
		return cRecordEntryList;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		cRecordEntryList.add(entry);
	}
	
}
