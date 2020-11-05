package practice;

public class Prac1_7 {

	public static void main(String[] args) {
		int x = 3, y = 7;
		System.out.printf("x=%d,y=%d\n", x, y);
		int w = x;
		x = y;
		y = w;
		System.out.printf("x=%d,y=%d\n", x, y);
	}

}
