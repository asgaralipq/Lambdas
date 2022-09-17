package org.asgar.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {

	public static void main(String[] args) {

		Consumer<String> c1 = (String str) -> {
			System.out.println("c1 consumes "+str);
		};
		
		Consumer<String> c2 = (String str) -> {
			System.out.println("c2 consumes "+str);
		};
		
//		Consumer<String> c3 = (String str) -> {
//			c1.accept(str);
//			c2.accept(str);
//		};
//		
		Consumer<String> c3 = c1.andThen(c2);
		
		c3.accept("Hello c3");
	
		Predicate<String> isNull = (String str) -> {
			return str == null;
		};
		
		System.out.println(isNull.test(null));
		System.out.println(isNull.test("Hello"));
		
		Predicate<String> isEmpty = (String str) -> {
			return str.isEmpty();
		};
		
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("Hello"));
		
		Predicate<String> p = isNull.negate().and(isEmpty.negate());
		
		System.out.println();
		System.out.println(p.test(null));
		System.out.println(p.test(""));
		System.out.println(p.test("Hello"));
	
	}

}
