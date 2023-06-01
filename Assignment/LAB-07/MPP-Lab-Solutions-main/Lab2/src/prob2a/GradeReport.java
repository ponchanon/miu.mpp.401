package prob2a;

public class GradeReport {

		private Student student;
		private String grade;
		public Student getStudent() {
			return student;
		}
		public GradeReport(String grade)
		{
			this.grade=grade;
		}

		public void setStudent(Student student) {
			this.student = student;
			
		}
		@Override
		public String toString() {
			return "GradeReport [ grade=" + grade + "]";
		}

		



		
		
		
}
