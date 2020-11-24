package junit;

import java.util.ArrayList;

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

    public int ex4_5(int [] a, int key) {
    	
    	int ret = -1;
    	
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] == key) {
    			ret = i;
    			break;
    		}
    	}
    	
    	return ret;
    }

    public int ex4_6(int [] a, int key){
    	
    	int ret = -1;
    	
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] == key) {
    			ret = i;
    		}
    	}
    	
    	return ret;
    }

    public int [] ex4_7(int [] a, int idx){

        int [] ret = new int[a.length - 1];
        
        int my_index = 0;
        
        for (int i = 0; i < a.length; i++) {
        	if (idx != i) {
        		ret[my_index] = a[i];
        	} else {
        		my_index --;
        	}
        	my_index ++;
        }

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){
    	
    	if (a.length >= idx + n) {
    		ArrayList<Integer> nums = new ArrayList<Integer>();
    	
    		for (int i = 0; i < a.length; i++) {
    			if (i < idx || i >= idx + n) {
    				nums.add(a[i]);
    			}
    		}
    	
    		int [] ret = new int[nums.size()];
    	
    		for (int i = 0; i < nums.size(); i++) {
    			ret[i] = nums.get(i);
    		}
    	
    		return ret;
    	} else {
    		return a;
    	}
    }

    public int [] ex4_9(int [] a, int idx, int x){

    	int [] nums = new int[a.length + 1];
    	
    	for (int i = 0, j = 0; i < a.length; i++) {
    		if (i == idx) {
    			nums[j++] = x;
    			nums[j++] = a[i];
    		} else {
    			nums[j++] = a[i];
    		}
    	}
    	
    	return nums;
    }

    public int[][] ex4_10(int [] a, int [] b){
    	
    	int temp;
    	
    	for (int i = 0; i < a.length; i++) {
    		if (i < b.length) {
    			temp = a[i];
    			a[i] = b[i];
    			b[i] = temp;
    		} else {
    			break;
    		}
    	}
       
    	return null;
    }

    public int [] ex4_11(int [] a){
    	int [] nums = a;
    	return nums;
    }

    public int [] ex4_12(int [] a, int x){

    	ArrayList<Integer> idxs = new ArrayList<Integer>();
    	
    	for (int i = 0; i < a.length; i++) {
    		if (x == a[i]) {
    			idxs.add(i);
    		}
    	}
    	
    	int [] ret = new int [idxs.size()];
    	
    	for (int i = 0; i < idxs.size(); i++) {
    		ret[i] = idxs.get(i);
    	}

       return ret;
    }

    public int [] ex4_13(int [] a, int idx){

    	if (idx < a.length && idx > 0) {
    		int [] ret = new int[a.length - 1];
        
    	int my_index = 0;
        
    	for (int i = 0; i < a.length; i++) {
    		if (idx != i) {
    			ret[my_index] = a[i];
    			} else {
    				my_index --;
    				}
    		my_index ++;
    		}
    	
    	return ret;
    	} else {
    		return a;
    	}
    }

    public int [] ex4_14(int [] a, int idx, int n){
    	
    	ArrayList<Integer> nums = new ArrayList<Integer>();

    	for (int i = 0; i < a.length; i++) {
    		if (i < idx || i >= idx + n) {
    			nums.add(a[i]);
    		}
        }
    	
    	int [] ret = new int[nums.size()];
    	
    	for (int i = 0; i < nums.size(); i++) {
    		ret[i] = nums.get(i);
    	}
    	return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

    	int [] nums = new int[a.length + 1];
    	
    	if (idx < 0) {
    		idx = 0;
    	}
    	if (idx >= a.length) {
    		for (int i = 0; i < a.length; i++) {
    			nums[i] = a[i];
    			}
    		nums[a.length] = x;
    		
    	} else {
    		for (int i = 0, j = 0; i < a.length; i++) {
    			if (i == idx) {
    				nums[j++] = x;
    				nums[j++] = a[i];
    			} else {
    				nums[j++] = a[i];
    				}
    			}
    		}
    	
    	return nums;
    }
}
