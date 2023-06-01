package prob2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
		public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
			List<String> phoneNums = new ArrayList<>();
			for(LibraryMember m : members) {
				CheckoutRecord record = m.getCheckoutRecord();
				for(CheckoutRecordEntry entry : record.getCheckoutEntryList()) {
					if(entry.getLendingItem().equals(item))
						phoneNums.add(m.getPhone());
				}
			}
			Collections.sort(phoneNums);
			return phoneNums;
		}

		public static List<String> getPhoneNumsByStream(LibraryMember[] members, LendingItem item) {

			List<String> phoneNums = new ArrayList<>();
			
			phoneNums=
					Stream.of(members)
					.filter(m->m.getCheckoutRecord().getCheckoutEntryList().stream()
					.filter((CheckoutRecordEntry e)->e.getLendingItem().equals(item))
					.count()>0)
					.map(me->me.getPhone())
					.sorted()
					.collect(Collectors.toList());
			
			return phoneNums;
		}
}
