package Exam.Asad.prob3;

import Exam.Asad.helperclasses.Book;
import Exam.Asad.helperclasses.BookCopy;
import Exam.Asad.helperclasses.CheckoutRecord;
import Exam.Asad.helperclasses.LibraryMember;
import Exam.Asad.helperclasses.TestData;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.specialBooks = TestData.INSTANCE.getAllBooks().iterator();
		LibraryMember member  = p.detectIfWinnerDuringCheckout(members);
		System.out.println("Winner : " + (member == null? "none" : member.getFirstName()));
		
	}
	Iterator<Book> specialBooks;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {		
		//fix this
		return mems.stream().filter(mem ->checkout(mem,specialBooks.next().getNextAvailableCopy(),
				LocalDate.now(),LocalDate.of(2015, 9,1)).getCheckoutRecordEntries().size()==10)
				.findFirst().orElse(null);	
		
		
	}
	
	public CheckoutRecord checkout(LibraryMember mem, BookCopy copy, LocalDate checkoutDate, LocalDate dueDate) {
		try {
			return mem.checkout(copy,checkoutDate,dueDate);
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
