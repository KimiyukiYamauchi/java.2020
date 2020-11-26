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
		} else {
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
		if (a < 0 || a > 100) {
			return "範囲(0～100)外の値です";
		} else {
			if (a >= 80) {
				return "優";
			} else if (a >= 70) {
				return "良";
			} else if (a >= 60) {
				return "可";
			} else {
				return "不可";
			}
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
		if (a <= b && a <= c) {
			if (b <= c) {
				return b;
			} else {
				return c;
			}
		} else if (b <= a && b <= c) {
			if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (a <= b) {
				return a;
			} else {
				return b;
			}
		}
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
		Integer [] sort_a = new Integer [a.length];
		
		for (int i = 0; i < a.length; i++) {
			sort_a[i] = a[i];
		}
		
		Arrays.sort(sort_a);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sort_a[i];
		}
		return a;
	}

	/**
	 *
	 * @param a - 整数型
	 * @return
	 * 引数の整数値の桁数を返す
	 */
	public int mon05(int a){
		int n = a;
		int count = 1;
		
		while (n / 10 > 0) {
			n /= 10;
			count++;
		}
		
		return count;
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
		boolean ret = true;
		
		if (a == 1 || a != 2 && a % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i <= a / 2; i += 2) {
			if (a % i == 0) {
				ret = false;
			}
		}
		
		return ret;
	}

	/**
	 *
	 * @param a - 整数値の配列
	 * @return
	 * 配列の要素をすべて加算した結果を返す
	 */
	public int mon07(int [] a){
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
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
		double sum = 0;
		double avg;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		avg = sum / a.length;
		
		return avg;
	}

	/**
    *
    * @return
    * 配列 {1.1, 2.2, 3.3, 4.4, 5.5}を返す関数
    */
   public double [] mon09(){
	   double [] ret = new double[5];
	   double dec = 11;
	   
	   for (int i = 0; i < ret.length; i++) {
		   ret[i] = dec / 10;
		   dec += 11;
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
	  int ret = -1;
	  
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] == key) {
			  ret = i;
			  break;
		  }
	  }
	  
	  return ret;
  }

}
