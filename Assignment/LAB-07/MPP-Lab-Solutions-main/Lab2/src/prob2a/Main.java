package prob2a;

public class Main {

	
		public static void main(String[] args) {
			Student student1 = new Student(new GradeReport("Report 1"),"Bob");
			GradeReport grade1 = student1.getGradeReport();

			grade1.setStudent(student1);
			
			System.out.println(grade1 + " of " + grade1.getStudent().getName());
			
			System.out.println(student1.getName() + "'s grade is " + student1.getGradeReport());
			

	

	}

}
