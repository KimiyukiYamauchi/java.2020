package junit;

class Ex4{

    public int [] ex4_1(){

        int [] ret = new int[5];

        ret[0] = 5;
        ret[1] = 4;
        ret[2] = 3;
        ret[3] = 2;
        ret[4] = 1;

        return ret;
    }

    public double [] ex4_2(){

        double [] ret = new double[5];
        ret[0] = 1.1;
        ret[1] = 2.2;
        ret[2] = 3.3;
        ret[3] = 4.4;
        ret[4] = 5.5;


        return ret;
    }

    public int [] ex4_3(int a, int b){

        int [] ret = new int[a];
        for (int i = 0; i < a; i++) {
        	ret[i] = b;
        }

        return ret;
    }

    public int [] ex4_4(int [] a){

        int [] ret = new int[4];
        int sum = 0;
        for (int i=0; i < a.length; i++) {
        	sum += a[i];
        }
        int med = sum / a.length;
        if (med > 0) {
        	med = med + 1;
        }

        int max = a[0];
        int min = a[0];;
        for (int i=0; i < a.length; i++) {
        	if(max < a[i]){
                max = a[i];
                }else if(min > a[i]) {
                min = a[i];
                 }

        }
        ret[0] = sum;
        ret[1] = med;
        ret[2] = max;
        ret[3] = min;

        return ret;
    }

    public int ex4_5(int [] a, int key){
    	int ret = 0;
        for(int i = 0; i < a.length; i++) {
        	if (a[i] == key) {
        		 return  i;
        	}
        }
        	return -1;

    }

    public int ex4_6(int [] a, int key){

    	int ret = -1;
        for(int i = 0; i < a.length; i++) {
        	if (a[i] == key) {
        		 ret = i;
        	}
        }
        	return ret;

    }

    public int [] ex4_7(int [] a, int idx){
    	int cou = 0;
        int [] ret = new int[a.length -1];
        for (int i =0; i < a.length; i++) {
        	if (i != idx) {
        		ret[cou] = a[i];
        		cou += 1;

        	}

        }
        return ret;
    }




    public int [] ex4_8(int [] a, int idx, int n){
    	int cou = 0;
    	if (idx == n) {
    		return a;
    	}
        int [] ret = new int[a.length - n];
        for (int i = 0; i < a.length; i ++) {
        	if (!(i >= idx && i < n + idx)) {
        		ret[cou] = a[i];
        		cou += 1;
        	}
        }

        return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x) {
    	int cou = 0;
        int [] ret = new int[a.length + 1];
        for (int i=0; i < a.length + 1; i ++) {
        	if (i == idx) {
        		ret[i] = x;
        	}else {
        		ret[i] = a[cou];
        		cou += 1;
        	}
        }
        return ret;
    }

    public void ex4_10(int [] a, int [] b){
    	int len = 0;
    	int [] a2 = a.clone();
    	int [] b2 = b.clone();
    	if (a.length >= b.length) {
    		len = b.length;
    	}else {
    		len = a.length;
    	}
    	for(int n = 0; n < len; n++) {
    		a[n] = b2[n];
    		b[n] = a2[n];
    	}
    	
    }

    public int [] ex4_11(int [] a){

        int [] ret = a.clone();

        return ret;
    }

    public int [] ex4_12(int [] a, int x){
    	int cou = 0;
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] == x) {
    			cou += 1;
    		}
    	}
    	int num = 0;
        int [] ret = new int[cou];
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == x) {
        		ret[num] = i;
        		num += 1;
        	}
        }

        return ret;
    }

    public int [] ex4_13(int [] a, int idx){
    	if (idx < 0 || a.length <= idx) {
    		return a;
    	}
    	
    	int [] ret = new int[a.length -1];
    	int c = 0;
    	for(int i = 0; i < a.length; i++) {
    		if (i != idx) {
    			ret[c] = a[i];
    			c++;
    		}
    	}
        

        return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){
    	
    	int cou = 0;
    	if (idx == n) {
    		return a;
    	}
        int [] ret = new int[a.length - n];
        for (int i = 0; i < a.length; i ++) {
        	if (!(i >= idx && i < n + idx)) {
        		ret[cou] = a[i];
        		cou += 1;
        	}
        }

        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}