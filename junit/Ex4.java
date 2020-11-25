package junit;

import java.util.ArrayList;

class Ex4{

    public int [] ex4_1(){

        int [] ret = {5, 4, 3, 2, 1};

        return ret;
    }

    public double [] ex4_2(){

        double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

        return ret;
    }

    public int [] ex4_3(int a, int b){

        int [] ret = new int[a];
        for(int i = 0; i < ret. length; i++) {
        	ret[i] = b;
        }

        return ret;
    }

    public int [] ex4_4(int [] a){

    	double sum = 0;
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;

    		for (int i : a) {
    		if(i < min) {
    			min=i;
    		}
    		if (i > max) {
    			max = i;
    		}
    		sum += i;
    	}

        int [] ret = {(int)sum,  (int)Math.ceil(sum/a.length),max, min};;

        return ret;
}

    public int ex4_5(int [] a, int key){

    	int i = 0;
    	for (; i < a. length; i++) {
    		if(a[i] == key)
    			break;
    	}

        return i< a.length ? i : -1;
    }

    public int ex4_6(int [] a, int key){

    	int i = a.length - 1;
    	for (; i >= 0 ; i--) {
    		if(a[i] == key)
    			break;
    	}
    	return i>= 0 ? i : -1;
    }

    	public int [] ex4_7(int [] a, int idx){

        int [] ret = new int[a.length-1];

        for (int i = 0, j = 0; i < a.length; i++) {
        	if(i != idx) {
        		ret[j++] = a[i];
        	}
        }

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){

    	int[] ret;
    	if( n == 0 || idx + n > a.length) {

    		ret = new int[a.length];
    		for (int i = 0; i < a.length; i++) {
    			ret[i] = a[i];
    	}
    } else {
    	ret = new int[a.length - n];
    	for(int i = 0, j = 0; i < a.length; i++) {
    		if(i < idx || i >= idx + n) {
    			ret[j++] = a[i];
    		}
    	}
    }
    	return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x){

        int [] ret = new int[a.length+1];
        for(int i = 0, j = 0; i < ret.length; i++) {
        	if(i == idx) {
        		ret[i] = x;
        	}else {
        		ret[i] = a[j++];
        	}
        }

        return ret;
    }

    public void ex4_10(int [] a, int [] b){
    	int len = a.length < b.length ? a.length : b.length;
    	for(int i = 0, work; i < len; i++) {
    		work = a[i];
    		a[i] = b[i];
    		b[i] = work;
    	}

        return;
    }

    public int [] ex4_11(int [] a){

        int [] ret = new int[a.length];
        	for (int i = 0; i < a.length; i++) {
        		ret[i] = a[i];
        		}

        return ret;
    }

    public int [] ex4_12(int [] a, int x){

    	ArrayList<Integer> search = new ArrayList<Integer>();
    	for(int i = 0; i <a.length; i++) {
    		if(a[i] == x) {
    			search.add(i);
    		}
    	}

        int [] ret = new int[search.size()];
        for(int i = 0; i < search.size(); i++) {
        	ret[i] = search.get(i);
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

    	 int [] ret = new int[0];

         return ret;
     }

    public int [] ex4_15(int [] a, int idx, int x){
    	if(idx < 0) {
    		idx = 0;
    	}
    	int count = 0;
    	 int [] ret = new int[a.length+1];
         for(int i = 0, j = 0; i < ret.length; i++) {
         	if(i == idx) {
         		ret[count] = x;
         		count ++;
         	}
         	if(i < a.length) {
         		ret[count] = a[i];
         		count ++;
         	}
         }


         return ret;
     }
    }



