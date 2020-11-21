package junit;

class Ex3{

	public double ex3_1(int [] a){

		int ret = 0;
		for (int i : a) {
			ret += i;

		}
		double avg = ret / (double)a.length;

		return avg;
	}

}