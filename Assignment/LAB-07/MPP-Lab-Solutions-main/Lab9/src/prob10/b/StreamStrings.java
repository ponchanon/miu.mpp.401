package prob10.b;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.asList("Bill", "Thomas", "Mary")
                .stream()
                .collect(Collectors.joining(", ")));
	}

}
