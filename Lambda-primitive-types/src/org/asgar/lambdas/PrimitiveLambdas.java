package org.asgar.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

	public static void main(String[] args) {
		
		IntSupplier supplier = () -> {
			return 10;
		};
		
		int i = supplier.getAsInt();
		System.out.println(i + " i");
		
		DoubleToIntFunction convert = (double value) -> {
			return (int)value;
		};
		
		int pi = convert.applyAsInt(Math.PI);
		System.out.println(pi + " pi");
	}
}
