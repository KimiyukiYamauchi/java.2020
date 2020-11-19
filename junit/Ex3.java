package junit;

class Ex3{

	public double ex3_1(int [] a){
		
		double sum = 0;
	    
		for(int i = 0;i < a.length; i ++) {
			sum += a[i];
		}
		double avg = sum / a.length;
		return avg;
	}
}
	