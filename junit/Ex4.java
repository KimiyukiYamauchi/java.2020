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
        for(int i = 0; i < a; i++) {
        	ret[i] = b;
        }

        return ret;
    }

    public int [] ex4_4(int [] a){

    	double t = 0;
    	for(int i = 0; i < a.length; i++) {
    		t += a[i];
    	}

    	int max = a[0];
    	int min =a[0];

    	for(int i = 0; i < a.length; i++) {
    		if(max < a[i])
    			max = a[i];
    		if(min > a[i])
    			min = a[i];
    	}

        int [] ret = new int[4];
        int ave = (int)Math.round(t / a.length);

        ret[0] = (int)t;
        ret[1] = ave;
        ret[2] = max;
        ret[3] = min;

        return ret;
    }

    public int ex4_5(int [] a, int key){

    	for(int i = 0; i < a.length; i++) {
    		if(a[i] == key )
    			return i;
    	}



        return -1;
    }

    public int ex4_6(int [] a, int key){

        int ret = 0;
        for(int i = a.length -1; i > 0; i--) {
        	if(a[i] == key)
        		return ret = i;
        }

        return ret = -1;
    }

    public int [] ex4_7(int [] a, int idx){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < a.length; i++) {
    		if(i != idx)
    			list.add(a[i]);
    	}

        int [] ret = new int[list.size()];

        for(int i = 0; i < ret.length; i++) {
        	ret[i] = list.get(i);
        }

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
    	for(int i = 0; i < a.length; i++) {
    		if(i >= idx && i <= idx + n)
    			list2.add(a[i]);

    		list.add(a[i]);
    	}

    	int [] ret = new int[list.size()];
    	for(int i = 0; i < ret.length; i++) {
    		ret[i] = list.get(i);
    	}
        return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x){
    	int c = 0;
    	int [] ret = new int[a.length + 1];
    	for(int i = 0; i < a.length; i++) {
    		if(i == idx) {
    			ret[c] = x;
    			c++;
    		}
    		ret[c] = a[i];
    		c++;
    	}



        return ret;
    }

    public void ex4_10(int [] a, int [] b){

        return;
    }

    public int [] ex4_11(int [] a){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_12(int [] a, int x){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_13(int [] a, int idx){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}