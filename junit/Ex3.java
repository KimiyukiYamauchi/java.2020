package junit;

class Ex3{
//引数でもらった要素の平均値（倍精度浮動小数点数）

	public double ex3_1(int [] a){
		double num = 0;
		for (int i:a) {
			num += i;
		}
		return num / a.length;
	}
}
