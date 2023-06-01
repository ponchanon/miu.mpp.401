package lab3_2;

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
		
		//int id, String fn, String mi, String ln, int yearOfBirth, int monthOfBirth, int dayOfBirth, long ssn, double sal, Position position)
		Employee john = new Employee(0001, "John", "", "Smith", 1980, 06, 01,"123-45-6789",4500.00, admin);
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
				
		//ibm.print();
		double ttSal = ibm.getSalary();
	}

}
