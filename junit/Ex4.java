package junit;

import java.util.ArrayList;
import java.util.List;

class Ex4{

    public int [] ex4_1(){

        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = 5 - i;
        }
        return z;
    }

    public double [] ex4_2(){

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

    public int [] ex4_3(int a, int b){

    	ArrayList<Integer> x = new ArrayList<Integer>();

        for (int i = 1; i <= a; i++) {
            x.add((int) b);
        }
		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret;
    }

    public int [] ex4_4(int [] a){

    	// Method 1
    	/** ArrayList<Integer> x = new ArrayList<Integer>();
        int max = a[0]; int min = a[0];

        for (int i = 1; i < a.length; i++) {
        	if (a[i] > max)
                max = a[i];

        	if (a[i] < min)
        		min = a[i];
        }

        OptionalDouble ave = IntStream.of(a).average();

    	x.add(IntStream.of(a).sum());
    	x.add((int) Math.round(ave.getAsDouble()));
        x.add(max);
        x.add(min);

		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret; **/

		// Method 2
		double sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i : a) {
			if (i < min ) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
			sum += i;
		}
		int [] ret = {(int) sum, (int) Math.round(sum/a.length), max, min};
		return ret;
    }

    public int ex4_5(int [] a, int key){

    	// Method 1
        /** int len = a.length;
        return IntStream.range(0, len)
            .filter(i -> key == a[i])
            .findFirst()
            .orElse(-1);
        **/

        // Method 2
        int i = 0;
        for (; i < a.length; i++) {
        	if (a[i] == key) {
        		break;
        	}
        }
        return i < a.length ? i : -1;
    }

    public int ex4_6(int [] a, int key){

    	// Method 1
//    	return (IntStream.of(a).anyMatch(x -> x == key)) ? 9 : -1;

    	// Method 2
    	int i = a.length -1;
    	for (; i >= 0; i--) {
    		if (a[i] == key) {
    			break;
    		}
    	}
    	return i >= 0 ? i : -1;
    }

    public int [] ex4_7(int [] a, int idx){

    	ArrayList<Integer> x = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	if (i != idx) { x.add(a[i]); }
        }

		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret;
    }

    public int [] ex4_8(int [] a, int idx, int n){

    	// Method 1
    	/**
    	ArrayList<Integer> x = new ArrayList<Integer>();
    	ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	y.add(a[i]);
        	if (i < idx || i >= n + idx) { x.add(a[i]); }
        }

		int [] ret = new int[x.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}

		int [] ret2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			ret2[i] = y.get(i);
		}

		return (n == idx) ? ret2 : ret; */

    	// Method 2
    	int [] ret;

    	if (n == 0 || idx + n > a.length) {
    		ret = new int[a.length];
    		for (int i = 0; i < a.length; i++) {
    			ret[i] = a[i];
    		}
    		return ret;
    	} else {
    		ret = new int[a.length - n];
    		for (int i = 0, j =0; i < a.length; i++) {
    			if (i < idx || i >= idx + n) {
    				ret[j++] = a[i];
    			}
    		}
    	}
    	return ret;
    }

    public int [] ex4_9(int [] a, int idx, int x){

    	// Method 1
    	/** ArrayList<Integer> z = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
        	if (i == idx) { z.add(x); }
        	z.add(a[i]);
        }

		int [] ret = new int[z.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = z.get(i);
		}
		return ret; **/

		// Method 2
		int [] ret = new int[a.length + 1];

		for (int i = 0, j = 0; i < ret.length; i++) {
			if (i == idx) {
				ret[i] = x;
			} else {
				ret[i] = a[j++];
			}
		}
		return ret;
    }

    public int[] ex4_10(int [] a, int [] b){

    	/** Method 1 (Fail)
    	ArrayList<Integer> x = new ArrayList<Integer>();

        for (int i = 0; i < b.length; i++) { x.add(b[i]); }
        for (int i = b.length; i < a.length; i++) {
            x.add(a[i]);
        }
		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		System.out.println(Arrays.toString(ret));
		return ret;
		**/

    	// Method 2
		for(int i = 0, tmp = 0; i < Math.min(a.length, b.length); i++) {
			tmp = a[i];
			a[i] = b[i];
			b[i] = tmp;
		}

		return a;
    }

    public int [] ex4_11(int [] a){

		int [] x = new int[a.length];

		for(int i = 0; i < a.length; i++){
			x[i] = a[i];
		}

		return x;
    }

    public int [] ex4_12(int [] a, int x){

    	// Method 1
		/** int [] ret = new int[a.length];
		int [] ret2  = new int[a.length];
		int count = 0, count2 = 0;

		for (int i = 0; i < a.length; i++) {
			ret[i] = (a[i] == x) ? ret2[i] = count : count2++;
			count++;
		}
		int [] ret3 = new int[Math.abs(count - count2)];

		for (int i = 0, j = 0; i < a.length; i++) {
			if (ret2[i] != 0) { ret3[j] = i; j++; }
		}
		return (count2 == 0) ? ret2 : ret3; 
		**/
    	
    	// Method 2
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

    	/** Method 1
    	ArrayList<Integer> x = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	if (i != idx) { x.add(a[i]); }
        }

		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret;
 		**/

    	// Method 2
    	int [] x = new int[a.length];
		int count = 0;

        for (int i = 0; i < a.length; i++) {
			if (i != idx) {
				x[i] = a[i];
			} else {
				x[i] = 100;
				count++;
			}
		}

		int [] ret = new int[a.length - count];

		for (int i = 0, j = 0; i < a.length; i++) {
			if (x[i] != 100) {
				ret[j] = x[i];
				j++;
			}
		}
		return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){

    	// Method 1
    	ArrayList<Integer> x = new ArrayList<Integer>();
    	ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
        	y.add(a[i]);
        	if (i < idx || i >= n + idx) { x.add(a[i]); }
        }

		int [] ret = new int[x.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}

		int [] ret2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			ret2[i] = y.get(i);
		}

		return (n == idx) ? ret2 : ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

		idx = (idx >= a.length) ? a.length : (idx < 0) ? 0 : idx;

		int [] ret = new int[a.length + 1];
		for (int i = 0, j = 0; i < ret.length; i++, j++) {
			if (i == idx) {
				ret[i] = x;
				j--;
			} else {
				ret[i] = a[j];
			}
		}
		return ret;
    }
}