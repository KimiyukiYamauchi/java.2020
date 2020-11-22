package junit;

import java.util.ArrayList;
import java.util.Arrays;

class Ex4{

    public int [] ex4_1(){

    	int [] ret = new int[5];
        int cnt = 5;
        for (int i = 0; i < 5; i++) {
        	ret[i] = cnt;
        	cnt -= 1;
        }
        return ret;
    }

    public double [] ex4_2(){

        double [] ret = new double[5];
        double cnt = 1;
        for (int i = 0; i < 5; i++) {
        	ret[i] = (cnt / 10) + cnt;
        	cnt += 1;
        }
        return ret;
    }

    public int [] ex4_3(int a, int b){

    	int [] ret = new int[a];
        for (int i = 0; i < a; i ++) {
        	ret[i] = b;
        }
    	return ret;
    }

    public int [] ex4_4(int [] a){

    	int [] ret = new int[4];
    	Arrays.sort(a);

    	double sum = 0;
    	for (int i : a) {
    		sum += i;
    	}

    	double avg = sum / a.length;

    	ret[0] = (int)sum;
    	ret[1] = (int)Math.round(avg);
    	ret[2] = a[a.length - 1];
    	ret[3] = a[0];

        return ret;
    }

    public int ex4_5(int [] a, int key){

        for (int i = 0; i < a.length; i++) {
        	if (a[i] == key) {
        		return i;
        	}
        }

        return -1;
    }

    public int ex4_6(int [] a, int key){

        for (int i = 0; i < a.length; i++) {
        	if (a[i] == key) {
        		return 9;
        	}
        }

        return -1;
    }

    public int [] ex4_7(int [] a, int idx){

    	ArrayList<Integer> num = new ArrayList<Integer>();

    	for (int i = 0; i < a.length; i++) {
    		if (i != idx ) {
    			num.add(a[i]);
    		}
    	}

    	int [] ret = new int[num.size()];

    	for (int i = 0; i < ret.length; i++) {
    		ret[i] = num.get(i);
    	}

    	return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){

    	if (a.length < n + idx) {
    		return a;
    	}
        int [] ret = new int[a.length - n];

        for (int i = 0, j = 0; i < a.length; i++) {
        	if (i < idx || idx + n <= i) {
        		ret[j] = a[i];
        		j += 1;
        	}
        }

        return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x){

        int [] ret = new int[a.length + 1];

        for (int i = 0, j = 0; i < a.length; i++) {
        	if (i == idx) {
        		ret[j] = x;
        		j += 1;
        	}
        	ret[j] = a[i];
        	j += 1;
        }


        return ret;
    }

    public void ex4_10(int [] a, int [] b){
    	int n, m;
    	if (a.length < b.length) {
    		n = b.length;
    		m = a.length;
    	}else {
    		m = a.length;
    		n = b.length;
    	}
    	int ret;
    	for (int i = 0; i < n; i ++) {
    		if (i < m) {
    			ret = a[i];
    			a[i] = b[i];
    			b[i] = ret;
    		}
    	}
        return;
    }

    public int [] ex4_11(int [] a){

        return a;
    }

    public int [] ex4_12(int [] a, int x){

    	int cnt = 0;
    	for (int i : a) {
    		if (i == x) {
    			cnt += 1;
    		}
    	}
        int [] ret = new int[cnt];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == x) {
        		ret[j] = i;
        		j += 1;
        	}
        }
        return ret;
    }

    public int [] ex4_13(int [] a, int idx){

    	ArrayList<Integer> num = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
    		if (i != idx ) {
    			num.add(a[i]);
    		}
    	}

    	int [] ret = new int[num.size()];

    	for (int i = 0; i < ret.length; i++) {
    		ret[i] = num.get(i);
    	}

    	return ret;
    }


    public int [] ex4_14(int [] a, int idx, int n){

    	ArrayList<Integer> num1 = new ArrayList<Integer>();
    	ArrayList<Integer> num2 = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	num2.add(a[i]);
        	if (i < idx || i >= n + idx) {
        		num1.add(a[i]);
        	}
        }

		int [] ret = new int[num1.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = num1.get(i);
		}

		int [] ret2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			ret2[i] = num2.get(i);
		}

		return n == idx ? ret2 : ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

    	if (idx < 0) {
    		idx = 0;
    	}

		int [] ret = new int[a.length + 1];

		for (int i = 0, j = 0; i < ret.length; i++, j++) {
			if (i == idx) {
				ret[i] = x;
				j -= 1;
			}else {
				ret[i] = a[j];
			}
		}
		return ret;
    }
}