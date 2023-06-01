package prob4.b;

import java.util.function.Function;
import java.util.stream.Stream;

public class FirstPrime { 
	
	public static int nextPrime(int num) {
		if(num < 2) return 2;
		int next = num + 1;
		while(!isPrime(next)) {
			next = next + 1;
		}
		return next;
	}
	
	public static boolean isPrime(int n) {
		for(int k = 2; k * k <= n; ++k) {
			if(n % k == 0) return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		final Function<Integer, Stream<Integer>> prime = 
				(x) -> Stream.iterate(2, n -> FirstPrime.nextPrime(n))
				.limit(x);
		
		prime.apply(10).forEach(System.out::println);
		prime.apply(2).forEach(System.out::println);
	}
}
