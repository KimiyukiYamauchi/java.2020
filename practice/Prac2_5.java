package practice;

import java.util.Scanner;

public class Prac2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		System.out.println("平均: " + ((x + y) / 2));
	}

}
