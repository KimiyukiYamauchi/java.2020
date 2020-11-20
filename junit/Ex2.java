package junit;

import java.util.ArrayList;
import java.util.Arrays;

class Ex2{

	public int [] ex2_1(int [] a){

		return a;

	}

	public int [] ex2_2(int [] a){
		Integer [] b = new Integer[a.length];

		Arrays.sort(a);
		for(int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length -i -1];
			a[a.length -i -1] = temp;
		}

		return a;

	}

	public String [] ex2_3(int [] a){

		String [] hantei = new String[a.length];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0)
				hantei[i] = "正";
			if(a[i] == 0)
				hantei[i] = "零";
			else
				hantei[i] = "負";
		}

		return hantei;

	}

	public int ex2_4(int a){

		return -1;

	}

	public int ex2_5(int a){
		int sum = 0;
		for(int i = 0; i <= a ; i++) {
			sum += i;
		}

		return sum;

	}

	public int [] ex2_6(int a){
		ArrayList<Integer> yakusuu = new ArrayList<Integer>();
		yakusuu.add(1);
		for(int i = 2; i <= a; i++) {
			if(a % i == 0)
				yakusuu.add(i);
		}

		int [] ret = new int[yakusuu.size()];
		for(int i = 0; i < ret.length; i++) {
			ret[i] = yakusuu.get(i);
		}

		return ret;

	}

	public boolean ex2_7(int a){
		int cnt = 0;

		if(a <= 1) {
			return false;
		}
		for(int i = 0; i <= a / 2 ; i++) {
			if(a % i == 0)
				cnt++;
		}
		return cnt == 0 ? true : false;

	}

	public int ex2_8(int [] a){

		int ret = 0;

		for(int i : a) {
			ret += i;

		}

		return ret;

	}

	public int ex2_9(int [] a){
		double sum = 0;

		for(int i : a) {
			sum += i;
		}
		sum /= a.length;
		int ret = (int)Math.round(sum);

		return ret;

	}
}

