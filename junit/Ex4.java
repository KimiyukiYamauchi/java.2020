package junit;

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
        for (int i = 0; i < 5; i ++) {
        	ret[i] = count + count /10;
        	count = count + 1;

        }

        return ret;
    }
/*aの値分bを繰りかえす
 *
 */
    public int [] ex4_3(int a, int b){
        int [] ret = new int[a];
        for (int i = 0; i < a; i ++) {
        	ret[i] = b;
        }

        return ret;
    }

    public int[] ex4_4(int [] a){

    	int [] ret = new int[1];
        return ret;
		}


    public int ex4_5(int [] a, int key){
    	for(int i = 0; i < a.length; i++) {
    		if (key == a[i]);
    	}
        return -1;
    }

    public int ex4_6(int [] a, int key){
    	for(int i = 0; i < a.length; i++) {
    		if (a[9] == key);
    		return 9;
    	}
    	return -1;
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