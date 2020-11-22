package junit;

class Ex4{

    public int [] ex4_1(){

        int [] ret = new int[5];
        
        for (int i = 0; i < ret.length; i++) {
        	ret[i] = 5 - i;
        }

        return ret;
    }

    public double [] ex4_2(){
    	
    	double [] ret = new double[5];
    	
    	double val = 11.0;
    	for (int i = 0; i < ret.length; i++) {
    		ret[i] = val / 10;
    		val += 11.0;
    		}
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

        double sum = 0;
        int min = a[0];
        int max = a[0];
        double avg;
        
        for (int i = 0; i < a.length; i++) {
        	
        	sum += a[i];
        	
        	if (a[i] < min) {
        		min = a[i];
        	}
        	
        	if (a[i] > max) {
        		max = a[i];
        	}
        }
        
        avg = sum / a.length;
        
        int [] ret = new int[4];
        
        ret[0] = (int)Math.round(sum);
        ret[1] = (int)Math.round(avg);
        ret[2] = max;
        ret[3] = min;

        return ret;
    }

    public int ex4_5(int [] a, int key){

        int ret = 9999;

        return ret;
    }

    public int ex4_6(int [] a, int key){

        int ret = 9999;

        return ret;
    }

    public int [] ex4_7(int [] a, int idx){

        int [] ret = new int[1];

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){

        int [] ret = new int[1];

        return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x){

        int [] ret = new int[1];

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
