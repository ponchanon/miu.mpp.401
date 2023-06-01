package proctor_90pointsTotal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		System.out.println(stringToStream("moon"));
	}
	
	private static Stream<Character> stringToStream (String str) {
		List<Character> result = new ArrayList<>();
		for(char c: str.toCharArray()) {
			result.add(c);
		}
		return result.stream();	
	}
	
}
