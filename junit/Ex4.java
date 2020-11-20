package junit;

import java.util.ArrayList;

class Ex4{

    public int [] ex4_1(){

        int [] ret = new int[5];
		ArrayList<Integer> hoge = new ArrayList<Integer>();
	    for(int i=1;i<= ret.length;i++){
	    	hoge.add(i);
	    }
	    int [] ret1 = new int[hoge.size()];
	    for (int s = 0; s < ret1.length;s++){
	        ret1[s] = hoge.get(s);
	    }
	    for(int o = 0; o < ret1.length-1; o++){
			 for(int j = o+1; j < ret1.length; j++){
				 if(ret1[j] > ret1[o]){
					 int temp = ret1[o];
					 ret1[o] = ret1[j];
					 ret1[j] = temp;
	             }
	         }
	    }
        return ret1;
    }

    public double [] ex4_2(){

        double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

        return ret;
    }

    public int [] ex4_3(int a, int b){

        int [] ret = new int[a];
        for(int i = 0;i<a;i++) {
        	ret[i] = b;
        }

        return ret;
    }

    public int [] ex4_4(int [] a){

        int [] ret = new int[1];
        int max = 0;
		for(int i = 0; i <= a.length-1; i++) {
			max = max + a[i];
		}
		
		int tyuou1 = a.length;
		double c = (double)max / tyuou1;
	    c = Math.round(c);
	    c = (int)c;
	    int inMax = -1;

        for (int i = 1; i < a.length; i++ ) {
            if(inMax < a[i]) {
                inMax = a[i];
            }
        }
        
        int inMin = 1;

        for (int i = 1; i < a.length; i++ ) {
            if(inMin > a[i]) {
                inMin = a[i];
            }
        }
		
		ArrayList<Integer> hoge = new ArrayList<Integer>();
		
	    hoge.add(max);
	    hoge.add((int) c);
	    hoge.add(inMax);
	    hoge.add(inMin);
	    
	    
	    int [] sum = new int[hoge.size()];
	    for (int z = 0; z < sum.length;z++){
	        sum[z] = hoge.get(z);
	    }

        return sum;
    }

    public int ex4_5(int [] a, int key){

        int ret = 0;
        for(int i=0; i < a.length;i++) {
        	if(a[0]==0) {
        		return 0;
        	}else if(a[i] == key){
        		int s = Math.abs(a[i-1]);
        		return s;
        	}
        }

        return -1;
    }

    public int ex4_6(int [] a, int key){

        int ret = 0;
        for(int i=0;i < a.length;i++) {
        	if(a[i] == key) {
        		return 9;
        	}
        }

        return -1;
    }

    public int [] ex4_7(int [] a, int idx){

    	int num[] = new int[idx];
		ArrayList<Integer> hoge = new ArrayList<Integer>();
	    for(int i=0;i<= a.length-1;i++){
	    		hoge.add(a[i]);
	        }
	    hoge.remove(idx);
	    int [] ret = new int[hoge.size()];
	    for (int s = 0; s < ret.length;s++){
	        ret[s] = hoge.get(s);
	    }

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){

    	int num[] = new int[idx];
		ArrayList<Integer> hoge = new ArrayList<Integer>();
	    for(int i=0;i<= a.length-1;i++){
	    		hoge.add(a[i]);
	        }
		for(int j= idx;j< n+idx;j++){
	
	 	    hoge.remove(a[idx-1]);
	 	}
	    int [] ret = new int[hoge.size()];
	    for (int s = 0; s < ret.length;s++){
	        ret[s] = hoge.get(s);
	    }
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