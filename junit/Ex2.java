package junit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

class Ex2{

	public int [] ex2_1(int [] a){

		Arrays.sort(a); return a;
	}

	public int [] ex2_2(int [] a){
		
		Arrays.sort(a);
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i -1];
			a[a.length -i -1] = temp;
		}
		return a;
	}

//	public ArrayList<String> ex2_3(int [] a){
	public String[] ex2_3(int [] a){

		String [] l = new String[a.length];

		for(int i=0; i<a.length; i++) {
			l[i] = a[i] > 0 ? "正" : a[i] < 0 ? "負" : "零";
		}
        return l;
	}

	public int ex2_4(int a){

		int x = 0;
		while (a > 0) {
			x++; a /= 10;
		}
		return x;
	}

	public int ex2_5(int a){

		int x =  0;
		for (int i = 0; i <= a; i++) {
			x += i;
		}
		return x;

	}

	public int [] ex2_6(int a){
		
		// Teacher's Method
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		
		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				x.add(i);
			}
		}
		int [] ret = new int[x.size()];
		
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret;
	}

	public boolean ex2_7(int a){
//
		boolean x = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				x = false;
			}
		}
		if (a == 1) {
			x = false;
		}
		return x;
	}

	public int ex2_8(int [] a){

		int x = IntStream.of(a).sum();
		return x;
	}

	public int ex2_9(int [] a){

		double x = IntStream.of(a).sum();
		return (int) Math.round(x / Array.getLength(a));

	}
}

