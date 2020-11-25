package junit;

class Ex3{

	public double ex3_1(int [] a){

		double sum = 0;
		for(int i : a) {
			sum += i;
		}

		return sum/a.length;
	}
}