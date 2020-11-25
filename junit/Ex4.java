package junit;

class Ex4{

    public int [] ex4_1(){

    	//return 配列（5,4,3,2,1)を返す関数
        int [] ret =  {5, 4, 3, 2, 1};

        return ret;
    }

    public double [] ex4_2(){

    	// 配列{1.1, 2.2, 3.3, 4.4, 5.5}を返す関数
        double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};

        return ret;
    }

    public int [] ex4_3(int a, int b){

    	//param a 配列の要素数
    	//param b 配列の要素の値
    	//return 引数aの要素数の値はbの整数型の配列を返す
        int [] ret = new int[1];

        for (int i = 0; i < ret.length; i++) {
        	ret[i] = b;
        }
        return ret;
    }

    public int [] ex4_4(int [] a){
    	//param a 整数型配列
    	//以下の要素を持つ整数型の配列を返す
    	//1番目の要素　引数でもらった配列の要素の合計
    	//２番目の要素　引数でもらった配列の要素の平均
    	//３番目の要素　引数でもらった配列の最大値
    	//４番目の要素　引数でもらった配列の最小値
    	double sum = 0;
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;

    	for (int i : a) {
    		if ( i < min) {
    			min = i;
    		}
    		if (i > max) {
    			max = i;
    		}
    		sum += i;
    	}

        int [] ret = {(int)sum, (int)Math.ceil(sum/a.length),max, min};
        return ret;
    }

    public int ex4_5(int [] a, int key){
    	//param a 整数型の配列
    	//param b　配列の要素から検索する値
    	//return 整数型の配列aから値がkeyの要素の位置を返す
    	 int i = 0;
         for (; i < a.length; i++) {
         	if ( a[i] == key) {
         		break;
         	}
         }
        return i < a.length ? i : -1;
    }

    public int ex4_6(int [] a, int key){
    	//param a 整数型の配列
    	//param b　配列の要素から検索する値
    	//return 整数型の配列aから値がkeyの要素の位置を返す
    	//但し、サーチは配列の末尾から行う

    	int i = a.length - 1;
    	for (; i >= 0 ; i --) {
    		if ( a[i] == key) {
    			break;
    		}
    	}

        return i >= 0 ? i : -1;
    }

    public int [] ex4_7(int [] a, int idx){
    	//param 整数型の配列
    	//param idx　aの配列から削除する要素の添え字
    	//引数aから引数idxの添え字の位置の要素を取り除いた
    	//配列を返す

        int [] ret = new int[a.length-1];

        for (int i = 0, j = 0; i < a.length; i++) {
        	if (i != idx) {
        		ret[j++] = a[i];
        	}
        }

        return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){
    	//param a-整数型の配列
    	//param idx-削除の開始の添え字
    	//param n-削除する要素数
    	//return　配列aのidxの位置からn個の要素を削除した配列を返す
        int [] ret;

        if (n == 0 || idx + n > a.length) {

        	ret = new int[a.length];
        	for (int i = 0; i < a.length; i++) {
        		ret[i] = a[i];
        	}
        	return a;
        }
    	for (int i = 0; i < a.length; i++) {
    		ret[i] = a[i];
      }
    } else {

    	ret = new int[] [a.length -n]
    	for (int i = 0, j = 0; i < a.length; i++) {
    		if ( i < idx || i >= idx + n) {
    			ret[j++] = a[i];
    		}
    	}
    }

    public int [] ex4_9(int [] a, int idx, int x){
		//param a - 整数型の配列
		//param idx -　要素を追加する一の添え字
		//param x -　追加する要素の値
		//return 配列aのidxの添字の位置にxを追加した配列を返す

		int [] ret = new int[a.length+1];

		for(int i = 0, j = 0; i < ret.length; i++) {
        	if (i == idx) {
        		ret[i] = x;
        	}else {
        		ret[i] = a[j++];
        	}
        }

        return ret;
    }

    public void ex4_10(int [] a, int [] b){
    	//param a - 整数型の配列
    	//param b -　整数型の配列
    	//配列aと配列bの要素の入れ替え
    	//但し、要素数の少ないほうに合わせる
    	int len = a.length <= b.length ? a.length : b.length;

    	for (int i = 0, work; i < len; i++) {
    		work = a[i];
    		a[i] = b[i];
    		b[i] = work;
    	}

        return;
    }

    public int [] ex4_11(int [] a){
    	//param a - 整数型の配列
    	//return　配列aをコピーした配列を戻す


        int [] ret = new int[a.length];

        for (int i = 0; i <a.length; i++) {
        	ret[i] = a[i];
        }

        return ret;
    }

    public int [] ex4_12(int [] a, int x){
    	//param a - 整数型の配列
    	//param b -　検索する値
    	//return 配列aから検索する値xのある位置から配列で返す
    	ArrayList<Integer> search = new ArrayList<Integer>();

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

    public int [] ex4_13(int [] a, int idx){
    	//param a - 整数型の配列
    	//param b -

        int [] ret;

        if (idx < 0 || idx >= a.length) {
        	ret = new int[a.length];
        } else {
           ret = new int[a.length-1];
        }
        for (int i = 0, j= 0; i < a.length; i++) {
        	if ( i != idx) {
        		ret[j++] = a[i];
        	}
        }

        return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){
    	//a - 整数型の配列
    	//b - 取り出す要素の開始の添え字
    	//n - 取り出す要素
        // 配列aのidxの位置からn個の要素を取り出した配列を返す
    	//取り出せない場合はからの配列を返す

        int [] ret;

        if (n <= 0 || idx < 0 || idx + n > a.length) {
        	ret = new int[n];
            for (int i = idx, j = 0; i < idx+n; i++) {
            	ret[j] = a[j];
        } else {
           if (idx + n > a.lengthl) {
        	ret = new int[a.length - (idx + n)];
        } else {
        	ret = new int[a.length - n];
        }

        for (int i = idx, j = 0; i < idx+n; i++) {
        	if (i < idx || i >= idx + n) {
        ret[j++} = a{i};]
        	}
        }
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}