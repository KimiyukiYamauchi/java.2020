package junit;

import java.util.Arrays;

class Ex4{

    public int [] ex4_1(){
        int [] ret = new int[5];
        int count = 5;
        for (int i = 0; i < 5; i ++) {
        	ret[i] = count;
        	count = count - 1;
        }
        return ret;
    }

    public double [] ex4_2(){
    	double count = 1;
        double [] ret = new double[5];
        for (int i = 0; i < 5;i ++) {
        	ret[i] = count + count / 10;
        	count = count + 1;
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
    	double total = 0;
    	Arrays.sort(a);
        int [] ret = new int[4];
        for(int i : a) {
        	total = total + i;
        }
        ret[0] = (int) total;
        ret[1] = (int) Math.round(total/a.length);
        ret[2] = a[a.length - 1];
        ret[3] = a[0];
        return ret;
    }

    public int ex4_5(int [] a, int key){
    	for(int i = 0; i < a.length; i ++) {
    		if (a[i] == key) {
    			return i;
    		}
    	}
        return -1;
    }

    public int ex4_6(int [] a, int key){
    	for (int i = a.length - 1; i > 0; i --) {
    		if (a[i] == key) {
    			return i;
    		}
    	}
        return -1;
    }

    public int [] ex4_7(int [] a, int idx){
    	int[] ret = new int[a.length - 1];
    	int count= 0;
    	for (int i = 0; i < a.length; i ++) {
    		if (i != idx) {
    			ret[count] = a[i];
    			count = count + 1;
    		}
    	}
        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){
    	int count = 0;
    	if (a.length < n + idx) {
    		return a;
    	}
        int [] ret = new int[a.length - n];
        for (int i = 0; i < a.length; i ++) {
        	if (i < idx || idx + n <= i) {
        		ret[count] = a[i];
        		count = count + 1;
        	}
        }
        return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x) {
        int [] ret = new int[a.length + 1];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
        	if (i == idx) {
        		ret[count] = x;
        		count ++;
        	}
        	ret[count] = a[i];
        	count ++;
        }
        return ret;
    }

    public void ex4_10(int [] a, int [] b){
    	int mlen, nlen;
    	if (a.length < b.length) {
    		mlen = b.length;
    		nlen = a.length;
    	} else {
    		nlen = a.length;
    		mlen = b.length;
    	}
    	int ret;
    	for (int i = 0; i < mlen; i ++) {
    		if (i < nlen) {
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
    	int count = 0;
    	for (int i: a) {
    		if (i == x) {
    			count ++;
    		}
    	}
        int [] ret = new int[count];
        int j = 0;
        for (int i = 0; i < a.length; i ++) {
        	if (a[i] == x) {
        		ret[j] = i;
        		j ++;
        	}
        }
        return ret;
    }

    public int [] ex4_13(int [] a, int idx){
    	if (0 > idx || idx >= a.length) {
    		return a;
    	}
    	int count = 0;
        int [] ret = new int[a.length - 1];
        for (int i = 0; i < a.length ; i ++) {
        	if (i != idx) {
        		ret[count] = a[i];
        		count ++;
        	}
        }
        return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){
    	if ( n <= 0) {
    		return a;
    	}
    	int len;
    	if (a.length < idx + n) {
    		len = idx;
    	} else {
    		len = a.length - n;
    	}
        int [] ret = new int[len];
        int count = 0;
        for (int i = 0; i < a.length; i ++) {
        	if (i < idx || idx + n <= i) {
        		ret[count] = a[i];
        		count ++;
        	}
        }
        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){
    	if (idx < 0) {
    		idx = 0;
    	}
    	int count = 0;
        int [] ret = new int[a.length + 1];
        for (int i = 0; i < a.length + 1; i ++) {
        	if (i == idx) {
        		ret[count] = x;
        		count ++;
        	}
        	if (i < a.length) {
        	ret[count] = a[i];
        	count ++;
        	}
        }

        return ret;
    }
}