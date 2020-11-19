package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ex2{

	public int [] ex2_1(int [] a){
		//昇順
		Arrays.sort(a);
		return a;

	}

	public int [] ex2_2(int [] a){
		//降順
		Integer [] b =new Integer [a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];}
		Arrays.sort(b,Collections.reverseOrder());
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];}
		return a;
	} //Arrays.sort()がlistの基本型に対して利用できないため変形

	public String [] ex2_3(int [] a){
		String [] hantei = new String[a.length];
		for (int i=0; i <a.length; i++) {
			hantei[i] = a[i];
		}

		return hantei;

	}

	public int ex2_4(int a){
		 String str = a +"";
		return str.length();
	}

	public int ex2_5(int a){
		int sum = 0;
		for (int i = 1; i <= a; i++) {
		sum += 1;
		}
		return sum;
	}

	public int [] ex2_6(int a){
		//最小公倍数
		ArrayList<Integer>kobaisu = new ArrayList<Integer>();
		kobaisu.add(1);
		
		for (int i = 2; i <= a; i++) {
			if (a%i == 0) {
				kobaisu.add(1);
			}
		}
		int [] ret = new int[kobaisu.size()];
		for (int i = 0; i<ret.length; i++) {
			ret[i] = kobaisu.get(i);
		}
		return ret;
	}

	public boolean ex2_7(int a){
		//素数判定
		int cnt = 0;
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i<a/2; i++) {
			if (a%i==0) {
				cnt++;
			}
		}
		return cnt == 0 ? true : false;

	}

	public int ex2_8(int [] a){

		int ret = 0;
		for (int i : a ) {
			ret += i ;
		}
		return ret;

	}

	public int ex2_9(int [] a){

		double sum = 0; 
		
		for (int i : a ) {
			sum += i ;
		}
		double avg = sum / a.length;
		int ret = (int)Math.round(avg);
		return ret;

	}
}

