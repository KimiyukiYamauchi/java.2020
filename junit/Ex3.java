package junit;

class Ex3{

	public double ex3_1(int [] a){
		int sum  = 0;
		
		for (int i = 0; i < a.length;) {
			sum += a[i];
		}
		
		double ret = sum / a.length;

		return ret;
	}
}
