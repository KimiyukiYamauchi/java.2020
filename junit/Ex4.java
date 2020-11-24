package junit;

import java.util.Arrays;

class Ex4{

    public int [] ex4_1(){

        int [] ret = new int[5];
        	ret[0] += 5;
        	ret[1] += 4;
        	ret[2] += 3;
        	ret[3] += 2;
        	ret[4] += 1;


        return ret;
    }

    public double [] ex4_2(){

    	 double [] ret = new double[5];

    	ret[0] += 1.1;
    	ret[1] += 2.2;
    	ret[2] += 3.3;
    	ret[3] += 4.4;
    	ret[4] += 5.5;



        return ret;
    }

    public int [] ex4_3(int a, int b){
    	int [] ret = new int[a];
    	for(int i = 0; i < a; i++) {
    		ret[i] = b;
    	}
    	return ret;
    	}




    public int [] ex4_4(int [] a){
    	Arrays.sort(a);
        int [] ret = new int[4];
        double sum = 0;
        int max = a[a.length - 1];
        int min = a[0];


        for(int i: a) {
        	sum += i;
        }

        int avg = (int)Math.round(sum / a.length);


        ret[0] = (int)sum;
        ret[1] = avg;
        ret[2] = max;
        ret[3] = min;

        return ret;
    }

    public int ex4_5(int [] a, int key){
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] == key) {
    			return i;
    		}
    	}
    	return -1;

    }


    public int ex4_6(int [] a, int key){
    	for(int i = 0; i < a.length; i++) {
    		if(a[a.length - i - 1] == key) {
    			return a.length - i -1;
    		}
    	}



        return -1;
    }

    public int [] ex4_7(int [] a, int idx){
    	int[] ret = new int[a.length - 1];
    	int count = 0;
    	for(int i = 0; i < a.length; i++) {
    		if(i != idx) {
    			ret[count] = a[i];
    			count += 1;

    		}else {

    		}

    	}
    	return ret;


    }

    public int [] ex4_8(int [] a, int idx, int n){
    	if(idx == n) {
    		return a;
    	}

    	int count = 0;
    	int[] list = new int[a.length - n];
    	int last = idx + n - 1;
    	for(int i = 0; i < a.length; i++) {
    		if(i >= idx &&  i <= last) {


    		}else {
    			list[count] = a[i];
    			count += 1;
    		}
    	}
    	return list;
    }



    public int [] ex4_9(int [] a, int idx, int x){
    	int[] list = new int[a.length + 1];
    	int count = 0;
    	for(int i = 0; i <=  a.length; i++) {
    		if(i == idx) {
    			list[count] = x;


    		}else {
    			list[i] = a[count];
    			count += 1;
    		}
    	}


        return list;
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
    	for(int i: a) {
    		if(i != x) {
    			count ++;
    		}
    	}

    	int[] list = new int[a.length - count];

    	int count1 = 0;
        for(int j = 0; j < a.length; j++) {
        	if(a[j] == x) {
        		list[count1] = j;
        		count1 ++;
        	}
        }

        return list;
    }

    public int [] ex4_13(int [] a, int idx){
    	if(idx < 0 || idx > a.length - 1) {
    		return a;
    	}

    	int[] list = new int[a.length - 1];
    	int count = 0;

    	for(int i = 0; i < a.length; i++) {
    		if(i == idx) {

    		}else {
    			list[count] = a[i];
    			count ++;
    		}

    	}

        return list;
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
    	if(idx < 0) {
    		idx = 0;
    	}
    	int[] list = new int[a.length + 1];
    	int count = 0;
    	for(int i = 0; i <=  a.length; i++) {
    		if(i == idx) {
    			list[count] = x;


    		}else {
    			list[i] = a[count];
    			count += 1;
    		}
    	}

        return list;
    }

}