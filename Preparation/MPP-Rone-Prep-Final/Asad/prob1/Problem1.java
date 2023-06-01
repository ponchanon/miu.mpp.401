package Exam.Asad.prob1;

import java.util.*;
import java.util.function.Predicate;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {
	
	// name and type of lambda goes here
	Predicate<List<Double>> Predicate = 
			(List<Double> list)-> { return list.get(0)*list.get(1)*list.get(2) < list.get(0)*list.get(1); }; 
	
	// representing lambda as a method reference
	
	Predicate<List<Double>> Predicate1 = 
			Problem1::printResult;
	
	//representing lambda as a static nested class
	static class PrintResult implements Predicate<List<Double>>{
		public boolean test(List<Double> list) {
			return list.get(0) * list.get(1) * list.get(2) < list.get(0) * list.get(1);
		}
		
	}
	
	
	public static boolean printResult(List<Double> list) {
		return list.get(0) * list.get(1) * list.get(2) < list.get(0) * list.get(1);
	}
	
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		
		System.out.println(Predicate.test(new ArrayList<Double>(Arrays.asList (2.0,7.0,9.0))));
		System.out.println(Predicate1.test(new ArrayList<Double>(Arrays.asList (2.0,7.0,9.0))));
		System.out.println((new PrintResult()).test(new ArrayList<Double>(Arrays.asList (2.0,7.0,9.0))));
		
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
