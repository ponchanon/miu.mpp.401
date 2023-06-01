package prob2;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
	
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> zero =  imperative(members, item);
		List<String> one =  lambda(members, item);
		boolean heads = (Math.abs((new Random()).nextInt()) % 2) == 0;
		System.out.println("Coin flip: heads? " + heads);
		return heads ? zero : one;
	}
	
	/** Imperative solution -- easier to understand! */
	private static List<String>imperative(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for(LibraryMember mem : members) {
			List<CheckoutRecordEntry> list = mem.getCheckoutRecord().getCheckoutEntryList();
			for(CheckoutRecordEntry ce : list) {
				LendingItem li = ce.getLendingItem();
				if(li.equals(item)) {
					phoneNums.add(mem.getPhone());
				}
			}		
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
	
	/** Solution that follows strict stream pipeline requirements */
	private static List<String> lambda(LibraryMember[] members, LendingItem item) {
		return
				Arrays.asList(members).stream().filter(m -> m.getCheckoutRecord().getCheckoutEntryList()
						.stream().map(ce -> ce.getLendingItem()).collect(Collectors.toList()).contains(item))
				        .map(m -> m.getPhone()).sorted().collect(Collectors.toList());
		
		
	}
}
