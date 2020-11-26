package junit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Kimatsu {
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String mon01(int n){

		return (n > 0) ? "その値は正です" : "その値は０か負です";
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

		return (0 <= a && a <= 59) ? "不可" :
			(60 <= a && a <= 69) ? "可" :
			(70 <= a && a <= 79) ? "良" :
			(80 <= a && a <= 100) ? "優" : "範囲(0～100)外の値です";
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

		return (a + b + c) / 3;
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

		int x = 0;
		while (a > 0) {
			x++; a /= 10;
		}
		return x;
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

		boolean x = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				x = false;
			}
		}
		if (a == 1) {
			x = false;
		}
		return x;
	}

	/**
	 *
	 * @param a - 整数値の配列
	 * @return
	 * 配列の要素をすべて加算した結果を返す
	 */
	public int mon07(int [] a){

		int x = IntStream.of(a).sum();
		return x;
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

		double x = IntStream.of(a).sum();
		return x / Array.getLength(a);
	}

	/**
    *
    * @return
    * 配列 {1.1, 2.2, 3.3, 4.4, 5.5}を返す関数
    */
    public double [] mon09(){

		List<Double> x = new ArrayList<Double>(5);
		
		for (int i = 1; i <= 5; i++) {
		    x.add((double)(i * 1.1) * 10 / 10.0);
		}
		double [] ret = new double[x.size()];
		
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
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

		int len = a.length;
		
		return IntStream.range(0, len)
		    .filter(i -> key == a[i])
		    .findFirst()
		    .orElse(-1);
  }
}
