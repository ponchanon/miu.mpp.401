package prob10.c;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStream = Arrays.asList(1,2,3).stream();
		IntSummaryStatistics summary
		   = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("max = " + summary.getMax() + " min = " + summary.getMin());
	}

}
