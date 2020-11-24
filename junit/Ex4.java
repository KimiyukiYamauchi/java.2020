package junit;

import java.util.ArrayList;

class Ex4{
// {5,4,3,2,1}を返す関数
    public int [] ex4_1(){

        int [] ret = {5,4,3,2,1};

        return ret;
        }

    public double [] ex4_2(){

        double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

        return ret;
    }
/**
     *
     * @param a　配列の要素数
     * @param b　配列の要素数の値
     * @return　引数の要素数の値はbの整数型の配列を返す
     */
    public int [] ex4_3(int a, int b){

        int [] ret = new int[a];
        for (int i=0; i<ret.length; i++) {
        	ret[i] = b;
        }
        return ret;
    }

    /**
     *
     * @param a 整数型配列
     * @return　以下の要素を持つ整数型の配列を返す
     * 1番目の要素　引数でもらった配列の要素の合計
     * 2番目の要素　引数でもらった配列の要素の平均
     * 3番目の要素　引数でもらった配列の要素数
     * 4番目の要素　引数でもらった配列の要素の最小値
     */
    public int [] ex4_4(int [] a){

        int [] ret = 0;
        int min = Integer.MAX_VALUE;
        for (int i : a) {
        	if(i < min) {
        	min = i;
        	}
        	if(i > max) {
        		max = i;
        	}
        	sum += 1;
    	}

    	int [] ret = {int(sum), (int)Math.ceil(sum/a.length), max, min};
        return ret;
    }
/**
 *
 * @param a	 整数型の配列
 * @param key	配列の要素から検索する値
 * @return　整数型の配列aから値がkeyの要素の位置を選ぶ
 */
    public int ex4_5(int [] a, int key){

    	int i = -1;
    	for(; i < a.length; i++) {
    		if(a[i]==key) {
    			break;
    		}
    	}

        return i < a.length ? i : -1;
    }

/**
 *
 * @param a 整数型の配列
 * @param key	整数型の配列aから値がkeyの要素の位置を選ぶ
 * @return　ただしサーチは配列の末尾から行う
 */
    public int ex4_6(int [] a, int key){

        int i = a.length -1;
        for (; i=a.length; i--) {
        	if(a[i] == key) {
        		break;
        	}
        }

        return i >=0 ? i = -1;
    }
/**
 *
 * @param a 整数型の配列
 * @param idx　aの配列から削除する要素の添え字
 * @return　引数aから引数idxの添え字の位置の要素を取り除いた要素を返す
 */
    public int [] ex4_7(int [] a, int idx){

        int [] ret = new int[a.length-1];
        for(int i=0; j = 0; j < a.length; i++) {
        	if(i != idx) {
        		ret(j++) = a[i];
        	}
        }

        return ret;
    }
/**
 *
 * @param a 整数型の配列
 * @param idx　削除の開始の活字
 * @param n　削除する要素数
 * @return
 * 引数aから引数idxの位置からnこの要素を削除した配列を返す
 */
    public int [] ex4_8(int [] a, int idx, int n){
    	int [] ret;

        if (n == 0 || idx + n > a.length) {
        	ret = new int[a.length];
        	for (int i=0; i<a.length; i++) {
        }
        	return ret;
        }else {
        	ret = new int[a.length - n];
        	for (int i = 0, j = 0, i < a.length; i++) {
        		if(i <idx || i >= idx + n) {
        			ret[j++] = a[i];
        		}
        	}
        }

    	int [] ret = new int[1];

        return ret;
    }

/**
 *
 * @param a 整数型の配列
 * @param idx	要素を追加する位置の添え字
 * @param x　追加する要素の値
 * @return
 * 配列aのidkの添え字の位置にxを追加して配列を返す
 */
    public int [] ex4_9(int [] a, int idx, int x){

        int [] ret = new int[a.length];

        for(int i = 0; j= 0; i<ret.length; i++) {
        	if (i == idx) {
        		ret[i] = x;
        	}else {
        		ret[i] = a[j++];
        	}
        }
        return ret;
    }

    /**
     *
     * @param a 整数型の配列
     * @param b　整数型の配列
     * 配列aと配列bの要素の入れ替え
     * ただし、要素数の少ないほうに合わせる
     */
    public void ex4_10(int [] a, int [] b){

    	int len = a.length <= b.length ? a.length : b.length;
    	for(int i = 0.work; i < len; i++) {
    		work = a[i];
    		a[i] = b[i];
    		b[i] = work;
    	}

        return;
    }

    /**
     *
     * @param a 整数型の配列
     * @return
     * 配列aをコピーして配列を返す
     */
    public int [] ex4_11(int [] a){

        int [] ret = new int[a.length];
        for (int i =0; i<a.length; i++) {
        	ret[i]= a[i];
        }

        return ret;
    }

    /**
     *
     * @param a	 整数型の配列
     * @param x　検索する値
     * @return
     * 配列aから検索する値xのある配列を返す
     */
    public int [] ex4_12(int [] a, int x){
    	ArrayList<Integer> search = new ArrayList<Integer>();
    			for(int i = 0; i < a.length; i++) {
    				if (a[i] == x) {
    					search.add(i);
    				}
    			}
        int [] ret = new int[search.size()];
        for (int i = 0; i < search.size(); i++) {
        	ret[i] = search.get(i);
        }
        return ret;
    }
/**
 *
 * @param a 整数型の配列
 * @param idx　
 * @return
 */
    public int [] ex4_13(int [] a, int idx){

        int [] ret;
        if(idx < 0 || idx > a.length) {
        	ret = new int[a.length];
        }else {
        	ret = new int[a.length - 1];
        }
        for(int i = 0, j = 0; i<a.length; i++) {
        	if (i != idx) {
        	ret [j++] = a[i];
        	}
        }

        return ret;
    }

    /**
     *
     * @param a 整数型の配列
     * @param idx　取り出す要素の開始の添え字
     * @param n　取り出す要素数
     * @return
     * 配列aとidxの位置からn個の要素を取り出した配列を返す
     * 取り出せない場合はからの配列を返す
     */
    public int [] ex4_14(int [] a, int idx, int n){
        int [] ret;
        if(a.length <= idx+n) {
        	ret=new int[n];
        } else {
        	ret=new int[0];
        }

        for (int i = idx, j=0; i < idx+n; i++; j++ ) {
        	ret[i]=a[i];
        } else {
        	ret = new int[0];
        }

        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}