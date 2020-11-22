package junit;

import java.util.ArrayList;
import java.util.Arrays;

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
        for(int i = 0;i < a;i++) {
        	ret[i] = b;
        }
		return ret;
    }

    
    public int [] ex4_4(int [] a){
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	int sum = 0;
        for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
        arr.add(sum);
        
        int avg = (int)sum / a.length;
        if (avg > 0) {
			avg += 1;
			arr.add(avg);
		}else{
		    arr.add(avg);  //平均值
		}
        
     
        
        int maxvalue = a[0];  
        for (int i = 1; i < a.length; i++) {
			if (maxvalue < a[i]) {
				maxvalue = a[i];
			}
		}
        arr.add(maxvalue);    //最大值
        
        int minvalue = a[0]; //0不行，因为0比所有数小时，只能输出为0
        for (int i = 1; i < a.length; i++) {
			if (minvalue > a[i]) {
				minvalue = a[i];
			}
		}
        arr.add(minvalue);    //最小值
        
        int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
			ret[i] = arr.get(i);
		}
        return ret;
    }

    
    
    public int ex4_5(int [] test, int key){
    	int index = Arrays.binarySearch(test, key);
    	if (index < 0) {
			return -1;
		}
    	for (int i = 0; i < test.length; i++) {
			if (test[i] == key) {
				return i;
			}
		}
		return 0;
    }

    public int ex4_6(int [] test, int key){
    	int index = Arrays.binarySearch(test, key);
    	if (index < 0) {
			return -1;
		}
    	for (int i = test.length-1; i >= 0; i--) {
			if (test[i] == key) {
				return i;
			}
		}
		return 0;
    }

    public int [] ex4_7(int [] a, int idx){

    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}
    	arr.remove(idx);
    	int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
 			ret[i] = arr.get(i);
 		}
         return ret;
    }
  

    public int [] ex4_8(int [] a, int idx, int n){
    	if (idx == n) {
			for (int i = 0; i < a.length; i++) {
				return a;
			}
		}
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			
		}
		
		ArrayList<Integer> brr = new ArrayList<Integer>();
		for (int j = idx;j <= n-1+idx;j++) {
			brr.add(a[j]);
			
		}
		
		
		arr.removeAll(brr);
		
		int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
 			ret[i] = arr.get(i);
 		}
         return ret;

		
    }

    

    public int [] ex4_9(int [] a, int idx, int x){
    	int[] ret = new int[a.length+ 1];
    	for(int i = 0; i < a.length;i++){
			ret[i] = a[i];
		}
		for(int i = idx; i < ret.length-1;i++){
			ret[i+1]=a[i];
		}
		ret[idx] = x;
		a = ret;  //重なる
		
		return ret;
	}

    public void ex4_10(int [] a, int [] b){
    	if(a.length >= b.length){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0; i < b.length; i++){
				arr.add(b[i]);
				
			}
			for(int i = 0; i < a.length; i++){
				if(i >= b.length){
					arr.add(0);

				}

			}
			int [] ret = new int[arr.size()];
			for (int i = 0; i < ret.length; i++) {
				ret[i] = arr.get(i);
			}

			int tmp[] = new int[a.length];
			int tpp[] = new int[b.length];
			for(int i = 0; i < b.length;i++){
				tmp[i] = a[i];
				a[i] = ret[i];
				b[i] = tpp[i];
				b[i] = tmp[i];
				
				
				
				
			}
			for(int i = 0; i < a.length;i++){
				
			}
			
			return;
		
		}else {
			ArrayList<Integer> brr = new ArrayList<Integer>();
			for(int i = 0; i < a.length; i++){
				brr.add(a[i]);
				
			}
			for(int i = 0; i < b.length; i++){
				if(i >= a.length){
					brr.add(0);

				}

			}
			int [] ret = new int[brr.size()];
			for (int i = 0; i < ret.length; i++) {
				ret[i] = brr.get(i);
			}

			int tmp[] = new int[b.length];
			int tpp[] = new int[a.length];
			for(int i = 0; i < a.length;i++){
				tmp[i] = b[i];
				b[i] = ret[i];
				a[i] = tpp[i];
				a[i] = tmp[i];
				
				
				
				
			}
			for(int i = 0; i < b.length;i++){
				
			}
			return;
		}

			
	}


    

    public int [] ex4_11(int [] a){

       
		return a;
    }

    public int [] ex4_12(int [] a, int x){
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				arr.add(i);
			}
		}
        
        int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
 			ret[i] = arr.get(i);
 		}
        
        return ret;  //x在a[]的位置==expected
    }

    public int [] ex4_13(int [] a, int idx){
    	
    	if (idx <= 0 || idx == a.length) {
			return a;
		}

    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			
		}
    	arr.remove(idx);
    	
    	int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
 			ret[i] = arr.get(i);
 		}
        
        return ret; 
    }

    public int [] ex4_14(int [] a, int idx, int n){
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			
		}
		
		ArrayList<Integer> brr = new ArrayList<Integer>();
		if (n > a.length-idx) {
			for (int i = idx; i < a.length; i++) {
				brr.add(a[i]);
			}
		}else if (idx >= a.length || idx < 0) {
			return a;
		}else {
			for (int j = idx;j <= n-1+idx;j++) {
				brr.add(a[j]);
				
			}
		}
		
		arr.removeAll(brr);
		
		int [] ret = new int[arr.size()];
        for (int i = 0; i < ret.length; i++) {
 			ret[i] = arr.get(i);
 		}
         return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	if (a.length == 0) {
			arr.add(x);
		}
    	
    	int [] ex = new int[arr.size()];
        for (int i = 0; i < ex.length; i++) {
 			ex[i] = arr.get(i);
 			return ex;
 		}
         
         
    	int[] ret = new int[a.length+ 1];
    	for(int i = 0; i < a.length;i++){
			ret[i] = a[i];
		}
		for(int i = idx; i < ret.length-1;i++){
			ret[i+1]=a[i];
		}
		ret[idx] = x;
		a = ret;  //重なる
		
		return ret;
    }
}
    