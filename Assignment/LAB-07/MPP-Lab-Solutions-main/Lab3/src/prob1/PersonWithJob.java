package prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person=new Person(n);
		
		salary = s;
	}
	
	public String getName() {
		return person.getName();
	}
	
	
	@Override
	public boolean equals(Object aPerson) {

		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}

/* Explaination 
 *  Here the PersonWithJob class inherits the class Person, where it also inherits the method equals of Person as well have
 *  it will have its own method equals too. When the method is called using p1 which have the instance of class PersonWithJob i.e. p1.equals(p2),
 *   it invokes the method equals from PersonWithJob, which return the result false because instance of Person will not be the instance of Person. 
 *   Where if the method is called using the instance of Person class i.e. p2.equals(p1), the method from Person, 
 *   it invokes the method from Person which results true because , the instance of class PersonWithJob will also be the instance of class Person, 
 *   because PersonWithJob inherits the class Person and also the methods only compares the name of the Person. 
 * The solution to resolve this problem will be using composition rather than inheritance.
 * 
 * 
 * */
