package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GoodSolution {

	public static void main(String[] args) {
		GoodSolution good= new GoodSolution();
		List<String> words= Arrays.asList("Apple","call","catt","abca","adad","cace");
		System.out.println(good.countWords(words, 'c', 'd', 4));
				

	}
	
	
	public int countWords(List<String> words, char c, char d, int len)
	{	return
		words.stream()
		.filter(word->word.length()==len)
		.filter(word->word.contains(""+c))
		.filter(word->!word.contains(""+d))
		.limit(0)
		.collect(Collectors.toList()).
		size();
		
	}

}
