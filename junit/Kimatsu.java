package junit;

import java.util.Arrays;

public class Kimatsu {
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String mon01(int n){

		if (n > 0) {
			return "その値は正です";
		}else {
			return "その値は０か負です";
		}

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
	public String mon02(int a){
		if (a >= 0 && a <= 59) {
			return "不可";
		}else if (a >= 60 && a <= 69) {
			return "可";
		}else if (a >= 70 && a <= 79) {
			return "良";
		}else if (a >= 80 && a <= 100) {
			return "優";
		}else {
			return "範囲(0～100)外の値です";
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
	public int mon03(int a, int b, int c){
		if (a >= b)
			if (a <= c)
				return a;
			else if (b >= c)
				return b;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	/**
	 *
	 * @param a - 整数型の配列
	 * @return
	 * 受け取った整数型の配列を昇順にソートした
	 * 結果を返す
	 *
	 */
	public int [] mon04(int [] a){

		Arrays.sort(a);
		return a;

	}

	/**
	 *
	 * @param a - 整数型
	 * @return
	 * 引数の整数値の桁数を返す
	 */
	public int mon05(int a){

		String str = a + "";
		return str.length();

	}

	/**
	 *
	 * @param a - 整数値
	 * @return
	 * 引数でもらった整数値が素数かどうか判定
	 * 素数 -> true
	 * 素数でない -> false
	 */
	public boolean mon06(int a){

		int count = 0;

		if (a <= 1) {
			return false;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		return count == 0 ? true: false;

	}

	/**
	 *
	 * @param a - 整数値の配列
	 * @return
	 * 配列の要素をすべて加算した結果を返す
	 */
	public int mon07(int [] a){

		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;

	}

	/**
	 *
	 * @param a - 整数型を要素に持つ配列
	 * @return
	 *
	 * 引数でもらった要素の平均値(倍精度浮動小数点数)
	 *
	 */
	public double mon08(int [] a){

		double ave = 0;
		for (int i : a) {
			ave += i;
		}
		return ave / a.length;
	}

	/**
    *
    * @return
    * 配列 {1.1, 2.2, 3.3, 4.4, 5.5}を返す関数
    */
   public double [] mon09(){

       double [] ret = new double[5];

       ret[0] = 1.1;
       ret[1] = 2.2;
       ret[2] = 3.3;
       ret[3] = 4.4;
       ret[4] = 5.5;

       return ret;
   }

   /**
   *
   * @param a - 整数型の配列
   * @param key - 配列の要素から検索する値
   * @return
   * 整数型の配列aから値がkeyの要素の位置を返す
   * 見つからなかったら-1を返す
   *
   */
  public int mon10(int [] a, int key){

	  int i = 0;
	  for (; i < a.length; i++) {
		  if (a[i] == key) {
			  break;
		  }
	  }
      return i < a.length ? i : -1;
  }

}