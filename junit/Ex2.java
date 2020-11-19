package junit;

import java.util.ArrayList;
import java.util.Arrays;

class Ex2{

	public int [] ex2_1(int [] a){
		Arrays.sort(a);
		return a;

	}

	public int [] ex2_2(int [] a){

		Arrays.sort(a);
		int[] list = new int[a.length];
		for (int i = 0; i < a.length ; i++) {
			list[i] = a[a.length - i - 1];
		}
		return list;
	}

	public String [] ex2_3(int [] a){

		String [] hantei = new String[a.length];
		
		for (int i = 0; i < a.length; i ++) {
			if (a[i] < 0) {
				hantei[i] = "負";
			} else if (a[i] > 0) {
				hantei[i] = "正";
			} else {
				hantei[i] = "零";
			}
		}
		return hantei;
	}

	public int ex2_4(int a){

		String s = a + "";
		return s.length();
	}

	public int ex2_5(int a){

		int count = 0;
		for (int i = 1; i <= a; i++) {
			count += i;
		}
		return count;

	}

	public int [] ex2_6(int a){

		ArrayList<Integer> yakusu = new ArrayList<Integer>();
		for (int i = 1;i <= a; i ++) {
			if (a % i == 0) {
				yakusu.add(i);
			}
		}
		int [] ret = new int[yakusu.size()];
		for (int i = 0; i < ret.length; i ++) {
			ret[i] = yakusu.get(i).intValue();
		}
		return ret;
	}

	public boolean ex2_7(int a){


		int n = 0;
		for (int i = 1; i <= a; i ++) {
			if (a % i == 0) {
				n ++;
			}
		}
		return (n == 2);

	}

	public int ex2_8(int [] a){

		int ret = 0;
		
		for (int i :a) {
			ret += i;
		}
		return ret;


	}

	public int ex2_9(int [] a){

		double sum = 0;
		for ( int i : a) {
			sum += i;
		}
		
		double avg = sum / a.length;
		int ret = (int)Math.round(avg);
		return ret;
	}
}

