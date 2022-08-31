package org.asgar.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "Hello";
		
		String str = supplier.get();
		System.out.println(str);
		
		Consumer<String> consumer = 
			(String s) -> {
				System.out.println("Test");
				System.out.println(s);
			}; 
		consumer.accept("Hello");
	}
}
