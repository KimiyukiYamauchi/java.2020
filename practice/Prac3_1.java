package practice;

import java.util.Scanner;

public class Prac3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x> ");
		int x = scanner.nextInt();
		System.out.print("y> ");
		int y = scanner.nextInt();
		if ( x > y) {
			System.out.println("xはyより大きい。");
		}
	}

}
