package prob1.b;

import java.util.function.Supplier;

public class Lambda {
	public static void main(String [] args)
	{
		Supplier<Double> f=()->Math.random();
		System.out.println(f.get());
	}
}
