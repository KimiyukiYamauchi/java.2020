package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ex2{


	/**
	 *
	 * @param int型の配列
	 * @return
	 *  受け取った整数型の配列を昇順にソート
	 * 	した結果を返す
	 */
	public int [] ex2_1(int [] a){
		Arrays.sort(a);
		return a;

	}

	/**
	 *
	 * @param  int型の配列
	 * @return
	 *  受け取った整数型の配列を降順にソート
	 * 	した結果を返す
	 */
	public int [] ex2_2(int [] a){

		Integer [] b = new Integer[a.length];		// int型をInteger型に変換

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		Arrays.sort(b, Collections.reverseOrder());

		for (int i = 0; i < a.length; i++) {		// Integer型をint型に変換
			a[i] = b[i];
		}
		return a;
	}

	/**
	 *
	 * @param  整数型の配列
	 * @return
	 * 引数の各要素をチェックし、
	 * 	要素が正の整数なら　正
	 * 要素が負の整数なら　負
	 * 要素が０なら　　　　零
	 */
	public String [] ex2_3(int [] a){

		String [] hantei = {"dummy"};		// わかりませんでした

		return hantei;

	}

	/**
	 *
	 * @param a - 整数型
	 * @return
	 * 引数の整数型の桁数を返す
	 *
	 */
	public int ex2_4(int a){

		String str = a + "";

		return str.length();

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * １から引数までを足した数を返す
	 *
	 */
	public int ex2_5(int a){

		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * 引数の約数を整数型の配列で返す
	 *
	 */
	public int [] ex2_6(int a){

		ArrayList<Integer> yakusu = new ArrayList<Integer>();

		yakusu.add(1);

		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				yakusu.add(i);
			}
		}

		int [] ret = new int[yakusu.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = yakusu.get(i);
		}
		return ret;

	}

	/**
	 *
	 * @param a - 整数
	 * @return
	 * 引数が素数であるかを判定して、その結果を返す
	 *
	 */
	public boolean ex2_7(int a){

		int cnt = 0;

		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < a/2; i++) {
			if ( a % i == 0) {
				cnt++;
			}
		}
		return cnt == 0 ? true : false;

	}

	/**
	 *
	 * @param a - 整数型の配列
	 * @return
	 * 引数の合計を返す
	 *
	 */
	public int ex2_8(int [] a){

		int ret = 0;

		for (int i : a) {
			ret += i;
		}
		return ret;

	}

	/**
	 *
	 * @param a - 整数型の配列
	 * @return
	 * 引数の平均を求め、四捨五入した値(整数)を返す
	 *
	 */
	public int ex2_9(int [] a){

		double sum = 0;

		for (int i : a) {
			sum += i;
		}

		double ave = sum /= a.length;
		int ret = (int)Math.round(ave);
		return ret;

	}
}

