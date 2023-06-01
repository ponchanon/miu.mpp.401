package level3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
//immutable
public class DateRange {
	
	private Calendar startDate;
	private Calendar endDate;
	
	public DateRange(Calendar startDate, Calendar endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
//	public boolean isInRange(LocalDate d) {
//		//todo
//	}
//	public String toString() {
//		//todo
//	}
//	public static getFirstDayofMonth(Date d) {
//		//todo
//	}
//	public static getLastDayOfMonth(Date d) {
//		//todo
//	}
}
