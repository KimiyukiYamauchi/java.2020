package junit;

class Ex1{
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String ex1_0(int n){

		if (n > 0) {
			return "その値は正です";
		}else {
			return "その値は０か負です";
		}

	}

	/**
	 *
	 * @param n - 整数
	 * @return 引数の絶対値
	 */
	public int ex1_1(int n){

		if (n < 0)
			return n * -1;
		else
			return n;

	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @return
	 * bがaの約数である場合 => bはaの約数です
	 * bがaの約数でない場合 => bはaの約数ではありません
	 */

	public String ex1_2(int a, int b){

		if (a % b == 0) {
			return b + "は" + a + "の約数です";
		} else {
			return b + "は" + a + "の約数ではありません";
		}
	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @return
	 *  a > b => aの方が大きいです
	 *  a < b => bの方が大きいです
	 *  a = b => 同じ値です
	 */
	public String ex1_3(int a, int b){

		if (a > b)
			return a + "の方が大きいです";
		else if (b > a)
			return b + "の方が大きいです";
		else
			return "同じ値です";

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * a < 0 => 正でない整数値です
	 * aが5で割れる => その値は5で割り切れます
	 * aが5で割れない => その値は5で割り切れません
	 */

	public String ex1_4(int a){

		if (a < 0)
			return "正でない整数値です";
		else if (a % 5 == 0)
			return "その値は5で割り切れます";
		else
			return "その値は5で割り切れません";

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * a < 0 => 正でない整数値です
	 * aが10の倍数 => その値は10の倍数です
	 * aが10の倍数でない => その値は10の倍数ではありません
	 */
	public String ex1_5(int a){

		if (a < 0)
			return "正でない整数値です";
		else if (a % 10 == 0)
			return "その値は10の倍数です";
		else
			return "その値は10の倍数ではありません";

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * a < 0 => 正でない整数値です
	 * a % 3 == 0 => その値は3で割り切れます
	 * a % 3 == 1 => その値を3で割った余りは1です
	 * a % 3 == 2 => その値を3で割った余りは2です
	 */
	public String ex1_6(int a){

		if (a < 0)
			return "正でない整数値です";
		else if (a % 3 == 0)
			return "その値は3で割り切れます";
		else if (a % 3 == 1)
			return "その値を3で割った余りは1です";
		else
			return "その値を3で割った余りは2です";
	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * a < 0 or a > 100 => 範囲(0～100)外の値です
	 * 0 <= a <= 59 => 不可
	 * 60 <= a <= 69 => 可
	 * 70 <= a <= 79 => 良
	 * 80 <= a <= 100 => 優
	 */
	public String ex1_7(int a){
		if (a < 0 || a > 100)
			return "範囲(0～100)外の値です";
		else if (a <= 59)
			return "不可";
		else if (a <= 69)
			return "可";
		else if (a <= 79)
			return "良";
		else
			return "優";
	}

	/**
	 *
	 * @param a - 倍精度浮動小数点数
	 * @param b - 倍精度浮動小数点数
	 * @return
	 *  aとbを比較して大きい方の値を返す
	 */
	public double ex1_8(double a, double b){
		return a > b ? a : b;
	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @return
	 *  2つの引数の間の差を求める
	 */
	public int ex1_9(int a, int b){
		int sa = a - b;
		if (sa < 0)
			return sa * -1;
		else
			return sa;

//		return Math.abs(a - b);
	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @return
	 *  2つの引数の間の差を求める
	 *    差が10以下 => それらの差は10以下です
	 *    差が11以上 => それらの差は11以上です
	 */
	public String ex1_10(int a, int b){
		int sa = a - b;
		if (sa < 0)
			sa *= -1;

		if (sa <= 10)
			return "それらの差は10以下です";
		else
			return "それらの差は11以上です";
	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @param c - 整数
	 * @return
	 *  3つの引数の中で最も小さい値を返す
	 */
	public int ex1_11(int a, int b, int c){
		if (a < b)
			if (a < c)
				return a;
			else
				return c;
		else if (b < c)
			return b;
		else {
			return c;
		}
	}

	/**
	 *
	 * @param a - 整数
	 * @param b - 整数
	 * @param c - 整数
	 * @return
	 * 3つの引数の値の大きさが真ん中のものを返す
	 */
	public int ex1_12(int a, int b, int c){

		if (a < b) {
			if (a < c) { // aが一番小さい
				if (b < c)
					return b;
				else
					return c;
			} else { // cが一番小さい
				if (a < b)
					return a;
				else
					return b;
			}
		} else if (b < c){
			if (c < a) // bが一番小さい
				return c;
			else {
				return a;
			}
		} else
			return b;
	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 *  a < 1 or a > 12 => 範囲(1～12)外の値です
	 *  aが12,1,2 => 冬
	 *  aが3,4,5 => 春
	 *  aが6,7,8 => 夏
	 *  aが9,10,11 => 秋
	 */
	public String ex1_13(int a){
		String [] retStr =
		{"冬", "冬", "春", "春", "春", "夏", "夏", "夏", "秋", "秋", "秋", "冬"};

		if (a < 1 || a > 12)
			return "範囲(1～12)外の値です";
		else
			return retStr[a - 1];
	}
}

