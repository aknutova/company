package telran.stream.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.*;

class StreamTests {
	
	int[] arr = {10, 13, 8, 7, 3, 5, 6};
	int[] empty = {};

	@Test
	@Disabled
	void arrayStreamTest() {
		assertEquals(24, Arrays.stream(arr).filter(n -> n % 2 == 0).sum());
		assertEquals(0, Arrays.stream(empty).filter(n -> n % 2 != 0).max().orElse(0));		
		assertEquals(13, Arrays.stream(arr).filter(n -> n % 2 != 0).max().orElse(0));	// getAsInt
	}
	
	@Test
	@Disabled
	void displaySportLoto() {
		Random gen = new Random();
		gen.ints(1, 50).distinct().limit(7).forEach(n -> System.out.print(n + " "));
	}
	
	@Test
	@Disabled
	void evenOddGrouping() {
		Map<String, List<Integer>> mapOddEven =
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));
		System.out.println(mapOddEven);
	}
	
	@Test
    void displayOccurrenceSorted() {
        String[]strings = {"lpm", "y", "a", "lpm", "aa", "yy", "yy", "aa", "lpm"};
        Map<String,Long> occurrencesMap = Arrays.stream(strings)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        occurrencesMap.entrySet().stream().sorted((e1,e2) -> {
            int res = Long.compare(e2.getValue(), e1.getValue());
            if (res == 0) {
                res = e1.getKey().compareTo(e2.getKey());
            }
            return res;
        })
                .forEach(e-> System.out.printf("%s => %d\n", e.getKey(), e.getValue()));
    }
	
	@Test
	@Disabled
	void stringStream() {
		String string = "Hello";
		//output: H,e,l,l,o
		//string.chars().forEach(c -> System.out.printf("%c,", c));
		string.chars().mapToObj(c -> "" + (char)c) //conversion to Stream<String>
		.forEach(s -> System.out.print(s + ","));
	}
	
	@Test
	void splittingStringArray() {
		String [] strings = {"Hello", "World"};
		//output: H,e,l,l,o,W,o,r,l,d
		Arrays.stream(strings).flatMapToInt(str -> str.chars())
		.mapToObj(c -> "" + (char)c) //conversion to Stream<String>
		.forEach(s -> System.out.print(s + ","));
	}
}