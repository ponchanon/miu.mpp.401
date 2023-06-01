package prob1.b;

import java.util.function.Supplier;

public class InnerClass {

	public static void main(String [] args)
	{
		Supplier<Double> f=new InnerClass().new MySupplier();
		System.out.println(f.get());
	}
	
	
	public class MySupplier implements Supplier<Double>
	{

		@Override
		public Double get() {
			return Math.random();
		}
		
	}

}
