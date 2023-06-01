package prob1.rulesets;

import java.awt.Component;


import prob1.gui.CDWindow;

//import lesson5.labsolns.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdwin =new CDWindow();
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cdwin = (CDWindow)ob;
		nonemptyRule();
		floatingPointRule();
		greaterThanRule();
		
	}
	
	private void nonemptyRule() throws RuleException {
		if(cdwin.getArtistValue().trim().isEmpty() ||
		     cdwin.getPriceValue().trim().isEmpty() ||
			 cdwin.getTitleValue().trim().isEmpty()
			) {
			   throw new RuleException("All fields must be nonempty");
		}
	}
	
	
	private void floatingPointRule() throws RuleException {
		String val = cdwin.getPriceValue().trim();
		double doubleVal=0.0;
		try {
			doubleVal = Double.parseDouble(val);

		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a floating point number.");
		}
		int length=val.length();
		if( val.charAt(length-3)!='.') {
			throw new RuleException("Price must be number with two decimal places.");
		}
		
		
	}
	
	
	private void greaterThanRule() throws RuleException {
		
		double val = Double.parseDouble(cdwin.getPriceValue().trim());
		if(val<=0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
		
		
	}
	
	
	
	
}
