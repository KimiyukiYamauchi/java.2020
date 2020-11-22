package junit;

class Ex3{

	public double ex3_1(int [] a){

		double ret = 0;

		for (int i : a) {
			ret += i;
		}

		return ret / a.length;
	}
}