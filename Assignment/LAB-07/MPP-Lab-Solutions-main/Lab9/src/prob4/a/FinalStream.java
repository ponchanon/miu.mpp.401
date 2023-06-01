package prob4.a;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FinalStream {
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
		// TODO Auto-generated method stub
		final Stream<Integer> primes=
		  Stream.iterate(2, n -> FinalStream.nextPrime(n));
		
		System.out.print(primes.limit(10).collect(Collectors.toList()));
	}

}
