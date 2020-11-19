package junit;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

class Ex3{

	public double ex3_1(int [] a){

		double x = IntStream.of(a).sum();
		return x / Array.getLength(a);
	}
}