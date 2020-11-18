package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Ex2{

	public int [] ex2_1(int [] a){

		Arrays.sort(a);
		return a;


	}

	public Integer[] ex2_2(Integer[] test){
		Arrays.sort(test, Collections.reverseOrder());
		return test;

	}

	public String[] ex2_3(int [] a){
		String[] mozi = {"a","a","a","a","a","a","a"};
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
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

	public int ex2_5(int a){
		int num = 0;
		for(int i = 0; i <= a; i ++) {
			num += i;
		}
		return num;

	}

	public int[] ex2_6(int a){
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
		int num = 0;

		for (int i = 1; i <= a; i ++) {
			if (a % i == 0){
				num++;
			}

		}
		return (num == 2);
	}



	public int ex2_8(int [] a){

		int sum = 0;

		for(int i = 0; i < a.length; i ++) {
			sum += a[i];
		}


		return sum;

	}

	public int ex2_9(int [] a){

		double sum = 0;
		double num = 0;

		for(int i = 0; i < a.length; i ++) {
			sum += a[i];

		 num = sum / a.length;



	}
		return (int)Math.round(num);
}
}


