package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ACarrier ups ;
		ACarrier fedEx;
		ACarrier usMail;		
		String desc = ""; Double weight = null; Zone zone = null; DiscountType dt = null;
		double minCost = 0.00;
		ACarrier lowestCarr; 
		while(true) {
			putText("Enter the number for discount types: ");
			putText("1: Student, 2: Senior(65 years and above), 3: None");
			
			int choice = getInt();
	         switch(choice)
	            {
	            case 1:
	               dt = DiscountType.STUDENT;             
	               break;
	            case 2:
	               dt = DiscountType.SENIOR;
	               break;	            
	            default:
	              dt = null;
	            } 
			
			putText("Enter the numbers of packages: ");
			int noOfPk = getInt();
			int pkCount = 0;
			List<ACarrier> listLowestCarrier = new ArrayList<ACarrier>();
			while(pkCount != noOfPk) {
								
				putText("Package " + (pkCount + 1) + ": " + "Enter package description: ");
				desc = getString();	
				
				putText("Package " + (pkCount + 1) + ": " + "Enter weight(lb): ");
				weight = getDouble();
			
				putText("Package " + (pkCount + 1) + ": " + "Enter zone: ");
				putText("(CA, FL, IA, MA, MT, OH, OR, TX, UT, OTHER)");
				zone = getZone();					
				//for 1 package
				ups = new UPS(dt,desc, weight);
				fedEx = new FedEx(dt,desc, weight, zone);
				usMail = new USMail(dt,desc, weight);
				
				//check
				//System.out.println("ups - " + ups.calculateCost());
				//System.out.println("fedex - " + fedEx.calculateCost());
				//System.out.println("usmail - " + usMail.calculateCost());
				
				if(ups.calculateCost() > fedEx.calculateCost()) {
					minCost = fedEx.calculateCost();
					lowestCarr = fedEx;
				}else {
					minCost = ups.calculateCost();
					lowestCarr = ups;
				}
				if(minCost > usMail.calculateCost()) {
					minCost = usMail.calculateCost();
					lowestCarr = usMail;
				}
				//check
				//System.out.println("lowest is - " + lowestCarr.getClass().getSimpleName());
				
				listLowestCarrier.add(lowestCarr);
				
				pkCount++;
			}
			
			for(ACarrier c: listLowestCarrier) {
				printOutput(c);				
			}
			System.out.println("");
		}
	}
	
	public static void printOutput(ACarrier c) {
		String output;
		output = String.format("%1$-10s", c.getItemName());
		output+= String.format("$%-9.2f", c.calculateCost());
		output+= String.format("%s", c.getClass().getSimpleName());
		putText(output);
	}

	public static void putText(String s) {
		System.out.println(s);
	}
	//get keyboard input
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static double getDouble() throws IOException // reads an double from the keyboard input
    {
		String s = getString();
		return (Double.valueOf(s)).doubleValue();
    }
	public static int getInt() throws IOException
	{
		String s = getString();//get from keyboard input
		return Integer.parseInt(s);
	}
	public static Zone getZone() throws IOException{
		Zone rtn = Zone.OTHER;
		String s = getString().toUpperCase();
		List<Zone> zoneList = Arrays.asList(Zone.values());
		for(Zone z : zoneList) {
			if(s.equals(z.toString())) {
				rtn = z;
			}
		}
		//System.out.println(rtn);
		return rtn;
	}


}
