package junit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Ex2{

	public int [] ex2_1(int [] a){

		Arrays.sort(a);

		return a;

	}

	public int [] ex2_2(int[] a){

		Arrays.sort(a);
		for(int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length -i -1];
			a[a.length -i -1] = temp;
		}
		return a;

	}

	public String [] ex2_3(int [] a){

		String[] mozi = {"a","a","a","a","a","a","a"};
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				mozi[i] = "正";
			}else if(a[i] < 0) {
				mozi[i] = "負";
			}else {
				mozi[i] = "零";
			}
		}
		return mozi;

	}

	public int ex2_4(int a){

		return String.valueOf(a).length();

	}

	public int ex2_5(int a) {

		int num = 0;
		for (int i = 0; i <= a; i++) {
			num += i; //sum = sum + i
		}
		return num;

	}

	public int [] ex2_6(int a){

		List<Integer> ap = new ArrayList<Integer>();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				ap.add(i);
			}
		}

			int [] ret = new int[ap.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = ap.get(i).intValue();
			}

		return ret;

	}

	public boolean ex2_7(int a){

		int cnt = 0;
		if(a <= 1) {
			return false;
		}
		for(int i = 2; i < a/2; i++) {
			if(a % i == 0) {
				cnt++;
			}
		}

		return cnt ==0 ? true : false;

	}

	public int ex2_8(int [] a){

		int sum = 0;
		for(int i = 0; i < a.length; i ++) {
			sum += a[i];
		}

		return sum;

	}

	public int ex2_9(int [] a){

		double x = IntStream.of(a).sum();
		return(int) Math.round(x / Array.getLength(a));
	}
}
