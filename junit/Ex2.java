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
		int[] pas = new int[a.length];
		for (int i = 0; i < a.length ; i ++) {
			pas[i] = a[a.length - i - 1];
		}
		return pas;

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
		String str = a + "";


		return str.length();


	}

	public int ex2_5(int a){
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;

	}

	public int [] ex2_6(int a){

		ArrayList<Integer> passing = new ArrayList<Integer>();
		for (int i = 1;i <= a; i ++) {
			if (a % i == 0) {
				passing.add(i);
			}
		}
		int [] ret = new int[passing.size()];
		for (int i = 0; i < ret.length; i ++) {
			ret[i] = passing.get(i).intValue();
		}
		return ret;

	}

	public boolean ex2_7(int a){
		int count = 0;

		if (a <= 1) {
			return false;
		}

		for (int i = 2; i < a/2; i++) {
			if (a % i ==  0) {
				count++;
			}
		}
		return count == 0 ? true : false;

	}

	public int ex2_8(int [] a){
		int ret = 0;
		for (int i :a) {
			ret = ret + i;
		}
		return ret;


	}

	public int ex2_9(int [] a){
		double sum = 0;

		for ( int i : a) {
			sum += i;
		}
		double avg  = sum / a.length;
		int ret = (int)Math.round(avg);

			return ret;
		}
	}


