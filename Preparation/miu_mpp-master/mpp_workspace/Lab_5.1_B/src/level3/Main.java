package level3;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		///=============== level 3 - only 8,2015 order result ===============
		List<Employee> employees = Arrays.asList(
				new Hourly("1", 1, 1),
				new Salaried("2", 100),
				new Commissioned("3", 0.7d, 100, 
					Arrays.asList(
						new Order(1, LocalDate.of(2015, 6, 10), 100),
						new Order(2, LocalDate.of(2015, 7, 8), 100),
						new Order(3, LocalDate.of(2015, 8, 5), 100),
						new Order(4, LocalDate.of(2015, 8, 5), 100),
						new Order(5, LocalDate.of(2015, 8, 5), 100)
					)
				)
			);
			
			for(Employee e : employees) {
				e.print();
				System.out.println("################################");
			}

	}

}
