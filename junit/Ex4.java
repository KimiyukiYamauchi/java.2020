package junit;

import java.util.ArrayList;

public class Ex4 {
//{5, 4, 3, 2, 1}を返す
	public int [] ex4_1(){

        int [] ret = {5, 4, 3, 2, 1};

        return ret;
    }
//ダブル型要素  {1.1, 2.2, 3.3, 4.4, 5.5}を返す
    public double [] ex4_2(){

        double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

        return ret;
    }
//aをb個の配列として返す
    public int [] ex4_3(int a, int b){

        int [] ret = new int[a];
        for (int i = 0; i < ret.length; i++) {
        	ret[i] = b;
        }

        return ret;
    }
//{合計、平均、一番大きい、一番小さい}で返す
    public int [] ex4_4(int [] a){

    	double sum = 0;
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;

    	for (int i : a) {
    		if (i < min) {
    			min = i;
    		}
    		if (i > max) {
    			max = i;
    		}
    		sum += i;
    	}
        int [] ret = {(int)sum, (int)Math.ceil(sum/a.length), max, min};

        return ret;
    }
//keyの位置 ないなら-1
    public int ex4_5(int [] a, int key){

        int i = 0;
        for (; i  < a.length; i++) {
        	if (a[i] == key) {
        		break;
        	}
        }

        return i < a.length ? i : -1;
    }

    public int ex4_6(int [] a, int key){

        int i = a.length - 1;
        for (; i >= 0 ; i--) {
        	if (a[i] == key) {
        		break;
        	}
        }

        return i >= 0 ? i : -1;
    }
//aからidxの位置の要素を取り除く
    public int [] ex4_7(int [] a, int idx){

        int [] ret = new int[a.length-1];
        for (int i = 0, j = 0; i < a.length; i++) {
        	if (i != idx) {
        		ret[j++] =  a[i];
        	}
        }

        return ret;
    }
//aのidxの位置からn個取り除く
    public int [] ex4_8(int [] a, int idx, int n){

    	int [] ret;

    	if (n == 0 || idx + n > a.length) {
    		ret = new int[a.length];
    		for (int i = 0; i < a.length; i++) {
    			ret[i] = a[i];
    		}
    	}else {
    		ret = new int[a.length - n];
    		for (int i = 0, j = 0; i < a.length; i++) {
    			if (i < idx || i >= idx + n) {
    				ret[j++] = a[i];
    			}
    		}
    	}

        return ret;
    }
//aにxをidxの位置に入れる idxから後ろはずれる 消えない
    public int [] ex4_9(int [] a, int idx, int x){

        int [] ret = new int[a.length+1];
        for (int i = 0, j = 0; i < ret.length; i++) {
        	if (i == idx) {
        		ret[i] = x;
        	}else {
        		ret[i] = a[j++];
        	}
        }

        return ret;
    }
//要素の入替 要素数の少ない方に合わせる
    public void ex4_10(int [] a, int [] b){

    	int len = a.length <= b.length ? a.length : b.length;
    	for (int i = 0, work; i < len; i++) {
    		work = a[i];
    		a[i] = b[i];
    		b[i] = work;
    	}

        return;
    }
//aをコピーしてコピーを返す
    public int [] ex4_11(int [] a){

        int [] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
        	ret[i] = a[i];
        }
        return ret;
    }
//xがaのどこにあるか
    public int [] ex4_12(int [] a, int x){

    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	for (int i = 0; i < a.length; i++) {
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
//aからidxの位置の要素を消す
    public int [] ex4_13(int [] a, int idx){

        int [] ret;
        if (idx < 0 || idx >= a.length) {
        	ret = new int[a.length];
        }else {
        	ret = new int[a.length-1];
        }

        for (int i = 0, j = 0; i < a.length; i++) {
        	if (i != idx) {
        		ret[j++] = a[i];
        	}
        }
        return ret;
    }
//aのidxからｎ個取り除く
    public int [] ex4_14(int [] a, int idx, int n){

    	int [] ret;
    	if (a.length <= idx+n) {
    		ret = new int[n];
    		for (int i = idx, j = 0; i < idx+n; i++, j++) {
    			ret[j] = a[i];
    		}
    	}else {
    		ret = new int[0];
    	}
        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }

}
