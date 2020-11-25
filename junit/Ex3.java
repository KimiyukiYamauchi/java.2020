package junit;

class Ex3{

	public double ex3_1(int [] a){

		double ret = 0;
		double s = a.length;
		for(int i = 0; i <= a.length-1; i++) {
			ret = ret + a[i];
		}
        return ret / s;
	}
}