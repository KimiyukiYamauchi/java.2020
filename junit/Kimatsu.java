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
		if(n > 0) {
			return "その値は正です";
		}else
			return "その値は０か負です";

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
		if(0 <= a  && a <= 59) {
			return "不可";
		}else if(60 <= a && a <= 69) {
			return "可";
		}else if(70 <= a && a <= 79) {
			return "良";
		}else
			return "優";

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
		int [] ret ={a, b, c};
		Arrays.sort(ret);
		return ret[1];

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
		String s = String.valueOf(a);


		return s.length();

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
		int c = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				c++;
			}
		}

		return (c == 2);

	}

	/**
	 *
	 * @param a - 整数値の配列
	 * @return
	 * 配列の要素をすべて加算した結果を返す
	 */
	public int mon07(int [] a){
		int c = 0;
		for(int i = 0; i < a.length; i++) {
			c += a[i];
		}

		return c;

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
		double s = 0;
		for(int i = 0; i < a.length; i++) {
			s += a[i];
		}

		return s / a.length;
	}

	/**
    *
    * @return
    * 配列 {1.1, 2.2, 3.3, 4.4, 5.5}を返す関数
    */
   public double [] mon09(){

       double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

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
	  for(int i = 0; i < a.length; i++) {
		  if(a[i] == key) {
			  return i;
		  }
	  }


      return -1;
  }

}
