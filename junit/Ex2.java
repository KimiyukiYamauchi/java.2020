package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ex2{

	public int [] ex2_1(int [] a){
		Arrays.sort(a);
		return a;

	}

	public int [] ex2_2(int [] a){
		Integer[] b = new Integer [a.length];
		for(int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		Arrays.sort(b,Collections.reverseOrder());
		for(int i=0; i < a.length; i++) {
			a[i]=b[i];
		}
		return a;

	}

	public String [] ex2_3(int [] a){
		ArrayList<String>hantei = new ArrayList<String>();
		for(int i : a) {
			if(i>0) {
				hantei.add("正");
			}else if(i < 0) {
				hantei.add("負");
			}else {
				hantei.add("零");
			}

		}

		return hantei.toArray(new String[hantei.size()]);

	}

	public int ex2_4(int a){
		int cnt = 1;

		while(a /100 != 0) {
			cnt++;
			a /= 10;
		}
		return cnt;

	}

	public int ex2_5(int a){
		int sum = 0;
		for(int i = 1;i <= a;i++) {
			sum += 1;
		}
		return sum;

	}

	public int [] ex2_6(int a){
		ArrayList<Integer> yakusu = new ArrayList<Integer>();
		yakusu.add(1);
		for(int i = 2; i <= a; i++) {
			if (a % i ==0) {
				yakusu.add(i);
			}
		}

		int [] ret = new int[yakusu.size()];

		for (int i = 0; i< ret.length; i++) {
			ret[i] = yakusu.get(i);
		}

		return ret;

	}

	public boolean ex2_7(int a){
		int cnt = 0;
		if (a <= 1) {
			return false;
		}
		for(int i = 2; i< a/2; i++) {
			if(a % i ==0) {
				cnt++;
			}
		}
		return cnt == 0 ? true : false;

	}

	public int ex2_8(int [] a){

		int ret = 0;
		for (int i: a) {
			ret += i;
		}

		return ret;

	}


	public int ex2_9(int [] a){
		double sum = 0;
		for (int i : a) {
			sum += i;
		}
		double ave = sum / a.length;
		int ret = (int)Math.round(ave);

		return ret;

	}
}

