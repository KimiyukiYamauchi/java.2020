package stra;

public class SampleClass{
	private int type = -1;
    public static final int COMPARE_AGE = 1;
    public static final int COMPARE_HEIGHT = 2;
    public static final int COMPARE_WEIGHT = 3;
    public SampleClass(int compareType){
        this.type = type;
    }
    public int compare(Human h1,Human h2){
    	return new AgeComparator().compare(h1,h2);
    }
}