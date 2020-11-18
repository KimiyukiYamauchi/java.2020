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

	public ArrayList<String> ex2_3(int [] a){

//		ArrayList<String> l = new ArrayList<>();
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

//		TEST
	}

	public boolean ex2_7(int a){

		boolean x = (a == 1) ? false : true;
//				: (a == 2) ? true
//				: (a % 2 == 0) ? false : true;
		for (int i = 2; i < a; i++) {
			if (a % 2 == 0) {
				x = true;
			} else {
				x = false;
			}
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

