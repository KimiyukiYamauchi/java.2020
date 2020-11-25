package junit;

class Ex3{
//引数でもらった要素の平均値（倍精度浮動小数点）
	public double ex3_1(int [] a){

		double sum = 0;
		
		for (int i : a) {
			sum += i;
		}

		return sum/a.length;
	}
}
