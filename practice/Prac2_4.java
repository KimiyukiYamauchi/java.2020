package practice;

import java.util.Scanner;

public class Prac2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("整数を２つ入力してください> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		System.out.println("和: " + (x + y));
		System.out.println("差: " + (x - y));
		System.out.println("積: " + (x * y));
		System.out.println("商: " + (x / y));
		System.out.println("余: " + (x % y));
	}

}
