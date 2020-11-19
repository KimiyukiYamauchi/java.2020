package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ex2{
	//昇順
	public int[] ex2_1(int [] a){
		Arrays.sort(a);

		return a;
		}




//降順
	public int [] ex2_2(int [] a){
		Integer [] b = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		Arrays.sort(b,Collections.reverseOrder());
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		return a;
	}

	
	public String [] ex2_3(int [] a){
		String [] hantei = new String[a.length];
		for(int i = 0; i < a.length; i++) {
			hantei[i] = a[i] > 0 ? "正" : a[i] < 0 ? "負":"零";
		}
		return hantei;

	}

	public int ex2_4(int a){
		
		String str = a + "";
		return str.length();

	}

//1 + 2 + ... + a
	public int ex2_5(int a){
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	public int [] ex2_6(int a){

		ArrayList<Integer> yakusu = new ArrayList<Integer>();
		yakusu.add(1);
		for (int i = 2; i <= a; i++) {
			if(a % i == 0) {
				yakusu.add(i);
			}
		}
		int [] ret = new int[yakusu.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = yakusu.get(i);
		}
		return ret;
	}
	
	
//引数でもらった整数値が素数かどうか
	public boolean ex2_7(int a){
		int cnt = 0;
		
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < a/2; i++) {
			if(a % i == 0) {
				cnt++;
			}
		}
		return cnt == 0 ? true : false;
	}

	
//配列の要素をすべて加算した結果を返す
	public int ex2_8(int [] a){

		int ret = 0;
		for(int i : a) {  //配列の要素を一個一個取り出す
			ret += i;
		}
		return ret;
	}

	
//平均値
	public int ex2_9(int [] a){

		double sum = 0;

		for(int i : a) {
			sum += i;
		}
		double avg = sum / a.length;
		int ret = (int)Math.round(avg);
		return ret;
	}
}

