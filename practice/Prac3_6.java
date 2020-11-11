package practice;

import java.util.Scanner;

public class Prac3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("整数を入力してください> ");
		int x = scanner.nextInt();

		if (x >= 0) {
			if ( x % 2 == 0 ) {
				System.out.println("正の偶数");
			} else {
				System.out.println("正の奇数");
			}
		}else {
			if ( x % 2 == 0 ) {
				System.out.println("負の偶数");
			} else {
				System.out.println("負の奇数");
			}
		}

	}
}
