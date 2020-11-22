package junit;

class Ex3{

	public double ex3_1(int [] a){

		double ret = 0;
		for(int i = 0; i < a.length; i++) {
			ret += a[i];
		}

		return ret / a.length;
	}
}