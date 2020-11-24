package junit;

class Ex5{

	public int ex5_1(int a, int b){
		if (a < b) {
			return a;
		}
		return b;
	}

	public int ex5_1(int a, int b, int c){
		int min = a;
		int[] t = new int[]{a, b, c};
		for (int i : t) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public int ex5_1(int [] a){
		int min = a[0];
		for (int i : a) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public int ex5_2(int x){
		if ( x < 0) {
			return 0 - x;
		}
		return x;
	}

	public long ex5_2(long x){
		if (x < 0) {
			return 0 - x;
		}
		return x;
	}

	public float ex5_2(float x){
		if (x < 0) {
			return 0 - x;
		}
		return x;
	}

	public double ex5_2(double x){
		if (x < 0) {
			return 0 - x;
		}
		return x;
	}


	public String ex5_3(byte x){
		String ret = String.format("%8s", Integer.toBinaryString(x & 0xFF)).replace(' ', '0');
		return ret;
	}

	public String ex5_3(short x){
		String ret = String.format("%16s", Integer.toBinaryString(x & 0xffff)).replace(' ', '0');
		return ret;
	}

	public String ex5_3(int x){
		String ret = String.format("%32s", Integer.toBinaryString(x & 0xffffffff)).replace(' ', '0');
		return ret;
	}

	public String ex5_3(long x){
		boolean judge = (x < 0);
		String ret = "";
		if (judge) {
			x = x * -1 - 1;
		}
		int[] passing = new int[64];
		for ( int i = 63; i >= 0 ; i --) {
			passing[i] = (int) (x % 2);
			x = x / 2;
		}
		for ( int i: passing) {
			if (judge) {
				if (i == 0) {
					i = 1;
				} else {
					i = 0;
				}
			}
			ret = ret + i;
		}
		return ret;
	}
}