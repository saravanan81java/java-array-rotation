package com.array.rotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArraySample {
	
	// Create in integer array (1,...10)
		// input n = 2
		// output should be [1,2] [3,4]
		
		
		public static void main(String arg[]) {
			List<Integer> ll = Arrays.asList(1,5,2,3, 5,4,6,1,7, 8,2,9, 3,4);
			int n =5;
			System.out.println(
					IntStream
					.range(0, (ll.size() + n - 1) / n)
					.mapToObj(i -> ll.subList(i * n, Math.min((i + 1) * n, ll.size())))
					.collect(Collectors.toList()));
			 
			List<List<Integer>> result = null;//getSubArray(ll, n);
			//result.forEach(System.out::println);
		}
		
		private static List<List<Integer>> getSubArray(List<Integer> ll, int n) {
			
			List<List<Integer>>  result = new ArrayList<>();
			List<Integer> subArray = new ArrayList<>();
			for (Integer num : ll) {
				subArray.add(num);
				if(subArray.size() == n) {
					result.add(subArray);
					subArray = new ArrayList<>();
				}
			}
			
			if(!subArray.isEmpty()) {
				result.add(subArray);
			}
			
			
			return IntStream
					.range(0, (ll.size() + n - 1) / n)
					.mapToObj(i -> ll.subList(i * n, Math.min((i + 1) * n, ll.size())))
					.collect(Collectors.toList());
			
			//return result;
		}

		public static void main1(String arg[]) {
			List<Integer> ll = Arrays.asList(1,5,2,3, 5,4,6,1,7, 8,2,9, 3,4);
			int n =2;
			List<List<Integer>> sequences = subArrayBasedOnIndex(ll, n);
			sequences.forEach(System.out::println);
			
			List<Integer> finalResult = sequences
					.stream()
					.flatMap(list->list.parallelStream())
					.sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
			
			System.out.println(finalResult);
		}

		private static List<List<Integer>> subArrayBasedOnIndex(List<Integer> ll, int n) {
			List<List<Integer>> sequences = new ArrayList<>();
			List<Integer> subSeq = new ArrayList<>();
			 
			for (int index=0; index < ll.size() ; index++) {
				subSeq.add(ll.get(index));
				if(subSeq.size() == n) {
					sequences.add(subSeq);
					subSeq = new ArrayList<>();
				} 
			}
			
			if(!subSeq.isEmpty()) {
				sequences.add(subSeq);
			}
			
			return sequences;
		}

}
