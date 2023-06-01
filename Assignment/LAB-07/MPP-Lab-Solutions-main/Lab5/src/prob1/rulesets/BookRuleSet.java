package prob1.rulesets;

import java.awt.Component;
import prob1.gui.BookWindow;
import prob1.gui.CDWindow;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	BookWindow bookwin=new BookWindow();
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookwin = (BookWindow)ob;
		nonemptyRule();
		floatingPointRule();
		greaterThanRule();
		isbnRule();
		
	}
	
	private void nonemptyRule() throws RuleException {
		if(bookwin.getIsbnValue().trim().isEmpty() ||
		     bookwin.getPriceValue().trim().isEmpty() ||
			 bookwin.getTitleValue().trim().isEmpty()
			) {
			   throw new RuleException("All fields must be nonempty");
		}
	}
	
	
	private void floatingPointRule() throws RuleException {
		String val = bookwin.getPriceValue().trim();
		double doubleVal=0.0;
		try {
			doubleVal = Double.parseDouble(val);
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a floating point number.");
		}
		int length=val.length();
		if(val.charAt(length-3)!='.') {
			throw new RuleException("Price must be number with two decimal places.");
		}
		
		
	}
	
	
	private void greaterThanRule() throws RuleException {
		
		double val = Double.parseDouble(bookwin.getPriceValue().trim());
		if(val<=0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
		
		
	}
	
	
	private void isbnRule() throws RuleException{
		String val = bookwin.getIsbnValue().trim();
		for(char c: val.toCharArray()) {
			if(!Character.isDigit(c)) {
				throw new RuleException("ISBN must be numeric");
			}
		}	
		int len = val.length();
		if(len != 10 && len != 13) 
			throw new RuleException("ISBN must have 10 or 13 digits");
		if(len == 10 && !(val.charAt(0) == '0' || val.charAt(0) == '1')) {
			throw new RuleException("First digit of 10-digit ISBN must be 0 or 1");
		}
		if(len == 13 && !(val.startsWith("978") || val.startsWith("979"))) {
			throw new RuleException("All 13-digit ISBNs must begin with either '978' or '979'");
		}
		
	}
	

}
