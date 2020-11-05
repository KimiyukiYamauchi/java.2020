package practice;

import java.util.Scanner;

public class Prac3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("正の整数を入力してください> ");
		int x = scanner.nextInt();

		if (x > 0) {
			if ( x % 2 == 0 ) {
				System.out.println("偶数");
			} else {
				System.out.println("奇数");
			}
		}
	}
}
