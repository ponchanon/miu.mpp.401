package hra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		Position CEO = new Position("CEO", "Chief extuted tarector");
		Employee lyle = new Employee(0, "Lyle", "K", "Beeman", LocalDate.now(), "123-21-1234", 25500);
		lyle.setPosition(CEO);
		CEO.setEmployee(lyle);
		
		Position head = new Position("Head","head of department");
		Position w1 = new Position("Worker", "Wroker");
		Position w2 = new Position("Worker", "Wroker");
		Position w3 = new Position("Worker", "Wroker");
		
//		Stan worker group
		Employee tom = new Employee(1, "Tom", "G", "jack", LocalDate.now(), "311-23-2325", 30000);
		Employee sue = new Employee(3, "Sue", "L", "micheal", LocalDate.now(), "567-45-4564", 23300);
		Employee marc = new Employee(2, "Marc", "S", "tailer", LocalDate.now(), "576-76-9087", 9000);
		//		head roll
		Employee stan = new Employee(4, "Stan", "S", "lerman", LocalDate.now(), "345-756-5467", 253000);
		
		head.setEmployee(stan);
		w1.setEmployee(tom);
		w2.setEmployee(sue);
		w3.setEmployee(marc);
		
		stan.setPosition(head);
		tom.setPosition(w1);
		sue.setPosition(w2);
		marc.setPosition(w3);
		
		List<Position> stanWorkers = new ArrayList<Position>();
		stanWorkers.add(w1);
		stanWorkers.add(w2);
		stanWorkers.add(w3);
		stanWorkers.add(head);
		
//		setting supertior and infarior
		head.setSuperior(head);
		head.setInfarior(stanWorkers);
		
		
//		second group
		Employee bill = new Employee(5, "Bill", "G", "Gouswile", LocalDate.now(), "911-23-3453", 4400);
		Employee dan = new Employee(6, "Dan", "y", "swile", LocalDate.now(), "911-23-3453", 4400);
		Employee peter = new Employee(7, "Peter", "P ", "dan", LocalDate.now(), "234-565-6786", 64000);
		
		Position head1 = new Position("Head","head of department");
		Position w4 = new Position("Worker", "Wroker");
		Position w5 = new Position("Worker", "Wroker");
		
		peter.setPosition(head1);
		head1.setEmployee(peter);
		
		dan.setPosition(w4);
		w4.setEmployee(dan);
		bill.setPosition(w5);
		w5.setEmployee(bill);
		
		List<Position> peterWorkers = new ArrayList<Position>();
		peterWorkers.add(w4);
		peterWorkers.add(w5);
		peterWorkers.add(head1);
		
//		superior and infarior 
		head1.setSuperior(head);
		head1.setInfarior(peterWorkers);
		
		
//		CEO
		List<Position> ceo = new ArrayList<Position>();
		ceo.add(CEO);
//		departments
		Department dep1 = new Department("Sales", "Sales department");
		Department dep2 = new Department("Marketing", "Marketing department");
		Department dep3 = new Department("CEO", "Chief excutive darector");
		
//		add to departments 
		dep1.setPosition(peterWorkers);
		dep1.setPosition(stanWorkers);
		
		dep3.setPosition(ceo);
		
//		Marketing department 

		Employee gary = new Employee(5, "Gary", "O", "Goule", LocalDate.now(), "911-23-3453", 4400);
		Employee anne = new Employee(6, "Anne", "y", "swile", LocalDate.now(), "911-23-3453", 4400);
		
		Position head2 = new Position("Head","head of department Markting");
		Position w6 = new Position("Worker", "Wroker");
		
		anne.setPosition(head2);
		
		gary.setPosition(w6);
		
		List<Position> anneWorkers = new ArrayList<Position>();
		anneWorkers.add(w6);
		anneWorkers.add(head2);
		
		dep2.setPosition(anneWorkers);
		
		List<Department> deps = new ArrayList<Department>();
		deps.add(dep1);
		deps.add(dep2);
		deps.add(dep3);
		
		Company MIU = new Company("Maharashi International University");
		
		MIU.setDepartments(deps);
		
//		for (Department department : MIU.getDepartments()) {
//				department.print();
//		}
		
		MIU.printReportingHierarchy();
		
		
		
	}
}
