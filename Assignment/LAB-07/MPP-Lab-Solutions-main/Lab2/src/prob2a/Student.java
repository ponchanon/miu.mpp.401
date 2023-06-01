package prob2a;

public class Student {
	private GradeReport gradeReport;
	private String name;
	public Student(GradeReport gradeReport, String name) {
		this.gradeReport = gradeReport;
		this.name = name;
	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
}
