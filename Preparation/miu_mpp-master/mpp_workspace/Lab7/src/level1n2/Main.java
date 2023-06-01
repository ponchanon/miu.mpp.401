package level1n2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Company ibm = new Company("IBM");
		
		Department hr = new Department("Human Resource", "Level 9");
		Department rd = new Department("Research & Development", "Level 25");
		
		Position admin = new Position("Admin","HR Administration");
		Position secretary = new Position("Secretary","HR Administration");
		Position receptionist = new Position("Receptionist","HR Administration");
		
		Position swEngineer = new Position("Software Engineer", ".Net Software Engineer");
		Position webDeveloper = new Position("Web Developer", ".Net Web Developer");
		Position dataAnalyst = new Position("Data Analyst", "Data Analysis");
		Position techSupport = new Position("Tech Support", "Tech Support");
		
		//int id, String fn, String mi, String ln, int yearOfBirth, int monthOfBirth, int dayOfBirth, long ssn, double sal, Position position)
		Employee john = new Employee(0001, "John", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
		Employee john2 = new Employee(0001, "John", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
		Employee mary = new Employee(0002, "Mary", "Roslyn", "Jane", 1988, 10, 20,"123-45-6789",3500.00, receptionist);
		
		Employee frank = new Employee(0003, "Frank", "Junior", "Moore", 1987, 10, 20,"123-45-6789",8500.00, swEngineer);
		Employee susan = new Employee(0004, "Susan", "Bob", "Smith", 1997, 05, 11,"123-45-6789",6500.00, webDeveloper);
		
		admin.addEmployee(john);
		receptionist.addEmployee(mary);
		
		swEngineer.addEmployee(frank);
		webDeveloper.addEmployee(susan);
				
		hr.addPosition(admin);
		hr.addPosition(secretary);
		hr.addPosition(receptionist);
		
		rd.addPosition(swEngineer);
		rd.addPosition(webDeveloper);
		rd.addPosition(dataAnalyst);		
		
		ibm.addDepartment(hr);
		ibm.addDepartment(rd);	
		//-------------------
		//test employee equal
		//-------------------
		 //System.out.println(john.equals(mary));
		 //System.out.println(john.equals(john2));
		
		//-------------------
		//test department equal
		//-------------------
		Department rd2 = rd;		
		rd2.addPosition(webDeveloper);
		System.out.println("Checking two department after copy and add new position to copied dept:");
		System.out.println(rd.equals(rd2));//true because rd2 doesn't make data copy,its only reference copy
		
		Department rd3 = new Department("Sales", "1000 N 4th St");
		rd3.setPosList(new ArrayList<Position>(Arrays.asList(new Position("sale director",""), new Position("saleman", ""))));
		rd3.addPosition(techSupport);
		
		System.out.println("\n\nChecking two position list:");
		System.out.println(rd.posList.equals(rd3.posList));
		
		for(Position p: rd.posList) {
			System.out.print(p.getTitle() + ",");	
		}
		System.out.println("");
		for(Position p3: rd3.posList) {
			System.out.print(p3.getTitle() + ",");	
		}
		
		//-------------------
		//test position equal 
		//-------------------
		System.out.println("\n\nPosition equal check: " + swEngineer.equals(techSupport));
		
		//-------------------
		//test employee toString()
		//-------------------
		System.out.println("\n\nEmployee toString check: ");
		System.out.println(john.toString());
		
//		//-------------------
		//test position toString()
		//-------------------
		System.out.println("\nPosition toString check: ");
		for(Position p3: rd.posList) {
			System.out.println(p3.toString());	
		}
		
//		//-------------------
		//test department toString()
		//-------------------
		System.out.println("\n\nDepartment toString check: ");
		System.out.println(rd.toString());
		
		//-------------------
		//test employee equal hashCode
		//-------------------
		System.out.println("\n\nEmployee equal hashCode check: ");
		Employee john11 = new Employee(0011, "John", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
		Employee john22 = new Employee(0011, "John", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
		//Employee nichole = new Employee(0013, "Nichole", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
		
		System.out.println(john11.equals(john22));
		System.out.println(john11.hashCode());
		System.out.println(john22.hashCode());
		
		//-------------------
		//test position equal hashCode
		//-------------------
		System.out.println("\n\nPosition equal hashCode check: ");
		System.out.println(swEngineer.equals(webDeveloper));
		System.out.println(swEngineer.hashCode());
		System.out.println(webDeveloper.hashCode());
		
	}

}
