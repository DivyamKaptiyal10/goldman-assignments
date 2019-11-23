package java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

	public static void main(String[] args) {
		String str = "kanishk kanishk papa kanishk jhapa papa papa papa lala kaka chalela chalela kaka kanishk";
		String[] words = str.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
		Stream.of(words).forEach(word -> {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
			
		})
		
		;
		//System.out.println(wordCount);
		
		Map<String, Long> mapCount= Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s -> s , Collectors.counting()));
		System.out.println(mapCount);
		
		long maxCount = mapCount.values().stream().max((l1,l2) -> l1.compareTo(l2)).orElse(0L);
		System.out.println(maxCount);
		
		mapCount.entrySet().stream().filter(entry -> entry.getValue() == maxCount ).forEach(System.out::println);
		
	}
}
