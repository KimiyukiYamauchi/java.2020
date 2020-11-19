package junit;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

class Ex4{

    public int [] ex4_1(){

    	ArrayList<Integer> x = new ArrayList<Integer>();

        for (int i = 5; i < 0; i--) {
            x.add(i);
        }
		int [] ret = new int[x.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i);
		}
		return ret;
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

    	ArrayList<Integer> x = new ArrayList<Integer>();
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
		return ret;
    }

    public int ex4_5(int [] a, int key){

        int len = a.length;
        return IntStream.range(0, len)
            .filter(i -> key == a[i])
            .findFirst()
            .orElse(-1);
    }

    public int ex4_6(int [] a, int key){

    	return (IntStream.of(a).anyMatch(x -> x == key)) ? 9 : -1;
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

    public int [] ex4_9(int [] a, int idx, int x){

    	ArrayList<Integer> z = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
        	if (i == idx) { z.add(x); }
        	z.add(a[i]);
        }

		int [] ret = new int[z.size()];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = z.get(i);
		}
		return ret;
    }

    public void ex4_10(int [] a, int [] b){

        return;
    }

    public int [] ex4_11(int [] a){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_12(int [] a, int x){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_13(int [] a, int idx){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_14(int [] a, int idx, int n){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex4_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}