package may2017;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		List<CheckoutRecordEntry> ckRecordEntryList = new ArrayList<CheckoutRecordEntry>();
		//implement
		for(LibraryMember m : members) {
			ckRecordEntryList = m.getCheckoutRecord().getcRecordEntryList();
			for(CheckoutRecordEntry e : ckRecordEntryList) {
				if(e.getLendingItem().equals(item)) {
					phoneNums.add(m.getPhone());
				}
			}
		}
		Collections.sort(phoneNums);//don't forget to sort 
		return phoneNums;
	}
}
