package Exam.Asad.prob2;

import Exam.Asad.helperclasses.CheckoutRecordEntry;
import Exam.Asad.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
 * Print to the console the list of book titles � in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length descending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * (�yza� combes before �axb� because sorting is on the reverse of the title ) .  
 */
public class Problem2 {

	public static void main(String[] args) {
		//use this list  Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27) 
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		/*
		List<String> titles = list.stream()
				.filter(l->l.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(l->l.getCopy().getBook().getTitle())		
				.collect(Collectors.toList());
		System.out.println(titles.stream()
				.sorted(Comparator.comparing((String t) -> t.length())
						.thenComparing(t->t))
						.collect(Collectors.toList()));
		*/
		//Function<String, Integer> len = (s) -> s.length();
		 System.out.println(list.stream()
				.filter(l->l.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(l->l.getCopy().getBook().getTitle())
				.sorted(Comparator.comparing((String t) -> t.length())
						.thenComparing(t->t))
				.collect(Collectors.toList()));
		
	}
	

}
