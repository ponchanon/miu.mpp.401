package prob4c;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Employee hourly = new Hourly(3, 15, 35);
		hourly.print();
		hourly.calcCompensation(5, 2).print();
		
		Employee salaried = new Salaried(1,10000);
		salaried.print();
		salaried.calcCompensation(5,2).print();
		//(5,2) means 2 years and 5 months
		List<Order> orderList = new ArrayList<>();
		orderList.add(new Order(1, LocalDate.of(2022, 1, 12), 1200));
		orderList.add(new Order(2, LocalDate.of(2022, 1, 12), 600));
		orderList.add(new Order(3, LocalDate.of(2022, 1, 12), 300));
		orderList.add(new Order(4, LocalDate.of(2022, 1, 12), 900));

		Employee commissioned = new Commissioned(2,0.13, 500, orderList);
		commissioned.print();
		commissioned.calcCompensation(5, 2).print();

		
	}
}
