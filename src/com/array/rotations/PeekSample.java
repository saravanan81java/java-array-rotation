package com.array.rotations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekSample {
	
	public static void main(String arg[]) {
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
		 
		 List<String> upperNames = names
				 .stream()
				 .peek(n-> System.out.println("Names : "+n))
				 //.map(n-> n)
				 .collect(Collectors.toList());

		 upperNames.stream().forEach(n -> System.out.println(n));
		 
		 String listToString = upperNames
				 .stream()
				 //.map(n->n)
				 .collect(Collectors.joining(", ", "[", "]"));
		 
		 
		 System.out.println(listToString);
	}

}
