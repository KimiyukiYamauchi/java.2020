package junit;

import java.util.ArrayList;
import java.util.Arrays;

class Ex2 {

	public int [] ex2_1(int [] a) {
		Arrays.sort(a);
		return a;

	}

	public int [] ex2_2(int [] a){
		 for(int i = 0; i < a.length-1; i++){
			 for(int j = i+1; j < a.length; j++){
				 if(a[j] > a[i]){
					 int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
	             }
	         }
	    }
		return a;

	}

	public String [] ex2_3(int [] a){

		String[] hantei = new String[7];
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				hantei[i] = "零";
			}else if(a[i] > 0) {
				hantei[i] = "正";
			}else if(a[i] < 0) {
				hantei[i] = "負";
			}
		}
		return hantei;

	}

	public int ex2_4(int a){
		a = String.valueOf(a).length(); 
		return a;

	}

	public int ex2_5(int a){
		int ret = 0;
		for(int i = 0; i <= a; i++) {
			ret = ret + i;
		}
		return ret;

	}

	public int [] ex2_6(int a){

		int num[] = new int[a];
		ArrayList<Integer> hoge = new ArrayList<Integer>();
	    for(int i=1;i<= a;i++){
	    	if(a % i == 0){
	    		hoge.add(i);
	        }
	    }
	    int [] ret = new int[hoge.size()];
	    for (int s = 0; s < ret.length;s++){
	        ret[s] = hoge.get(s);
	    }
	    
		return ret;

	}

	public boolean ex2_7(int a){
		for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
		if(a == 1) {
		return false;
		}
		return true;

	}

	public int ex2_8(int [] a){

		int ret = 0;
		for(int i = 0; i <= a.length-1; i++) {
			ret = ret + a[i];
		}

		return ret;

	}

	public int ex2_9(int [] a){

		int ret = 0;
		int sum = a.length;
		for(int i = 0; i <= a.length-1; i++) {
			ret = ret + a[i];
		}
		double c = (double)ret / sum;
	    c = Math.round(c);
	    int s = (int)c;

		return s;

	}
}

