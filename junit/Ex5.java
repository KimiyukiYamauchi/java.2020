package junit;

class Ex5{

	public int ex5_1(int a, int b){

		return Math.min(a, b);
	}

	public int ex5_1(int a, int b, int c){

		return Math.min(Math.min(a, b), c);
	}

	public int ex5_1(int [] a){

		int x = a[0];
		for (int i = 0; i < a.length; i++) {
			if (x >= a[i]) {
				x = a[i];
			}
		}
		return x;
	}

	public int ex5_2(int x){

		return Math.abs(x);
	}

	public long ex5_2(long x){

		return Math.abs(x);
	}

	public float ex5_2(float x){

		return Math.abs(x);
	}

	public double ex5_2(double x){

		return Math.abs(x);
	}

	public String ex5_3(byte x){

		String ret = "";

		for(int i = 7; i >= 0; i--){
			ret += ((x >> i & 1) == 1) ? "1" : "0";
		}

		return ret;
	}

	public String ex5_3(short x){

		String ret = "";

		for(int i = 15; i >= 0; i--){
			ret += ((x >> i & 1) == 1) ? "1" : "0";
		}

		return ret;
	}

	public String ex5_3(int x){

		String ret = "";

		for(int i = 31; i >= 0; i--){
			ret += ((x >> i & 1) == 1) ? "1" : "0";
		}

		return ret;
	}

	public String ex5_3(long x){

		String ret = "";

		for(int i = 63; i >= 0; i--){
			ret += ((x >> i & 1) == 1) ? "1" : "0";
		}

		return ret;
	}
}