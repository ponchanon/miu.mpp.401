package Exam.Asad.prob6;

import java.time.LocalDate;

public interface Default {
	LocalDate getHireDate();
	
	default double computeBonus() {
		int hireYear =  getHireDate().getYear();
		int thisYear = LocalDate.now().getYear();
		return 400 * (thisYear - hireYear);
	}
}
