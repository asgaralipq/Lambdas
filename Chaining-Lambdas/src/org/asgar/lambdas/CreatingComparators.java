package org.asgar.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparators {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
		
		Comparator<String> compare = (String str1, String str2) -> {
			return str1.compareTo(str2);
		};
		
		list.sort(compare);
		
		System.out.println(list);
		
		ToIntFunction<String> toLength = (String str) -> {
			return str.length();
		}; 
//		
//		Comparator<String> cmp2 = (String s1, String s2) -> {
//			return Integer.compare(s1.length(), s2.length());
//		};
		
		Comparator<String> cmp2 = Comparator.comparingInt(toLength);
		
		list.sort(cmp2);
		System.out.println(list);
		
	}

}
