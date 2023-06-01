package level3;

public class Course {
	private String number;
	private String title;
	private int units;
	
	Course(String number, String title, int units){
		this.number = number;
		this.title = title;
		this.units = units;
	}
	public int getUnits() {
		return units;
	}
	public String getCourseNumber() {
		return number;
	}
}
