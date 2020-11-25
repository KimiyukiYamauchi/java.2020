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

	public int [] ex2_2(int [] a){

		Integer [] b = new Integer[a. length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		Arrays.sort(b, Collections.reverseOrder());

		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}

		return a;


	}

	public String [] ex2_3(int [] a){
		String [] chara = {"", "","","","","",""};
		for(int i = 0; i < a.length; ++i) {
			if(a[i] < 0) {
				chara[i] = "負";
			}else if (a[i] > 0) {
				chara[i] = "正";
			}else {
				chara[i] = "零";
			}
		}
		return chara;





	}

	public int ex2_4(int a){
		int keta = (int)(Math.log(a)/Math.log(10)) + 1;

		return keta;

	}

	public int ex2_5(int a){
		int num = 0;

		for(int i = 0; i < a; i++) {
			num += i;
		}

		return num + a;

	}




	public int [] ex2_6(int a){
		//int [] nums = new int[1];
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				nums.add(i);
			}
		}

		int [] ret = new int[nums.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = nums.get(i);
		}

		return ret;


	}



	public boolean ex2_7(int a){
		int x = 0;

		if(a <= 1) {
			return false;
		}
		for( int i = 2; i < a ; i++) {
			if (a % i == 0) {
				x++;
			}
		}

		return x == 0 ? true : false;

	}

	public int ex2_8(int [] a){
		int nums = 0;
		for(int i = 0; i < a.length; i++) {
			nums += a[i];
		}
		return nums;

	}

	public int ex2_9(int [] a){
		double nums = 0;
		for(int i : a) {
			nums  += i;
		}
		double avg = nums / a.length;
		int ret = (int)Math.round(avg);

		return ret;

	}
}

