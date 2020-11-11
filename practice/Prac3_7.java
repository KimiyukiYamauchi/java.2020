package practice;

import java.util.Scanner;

public class Prac3_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase;
		do {
			System.out.print("ケースを入力(1から3の整数): ");
			testCase = scanner.nextInt();

		}while ( testCase < 1 || testCase > 3 );

		int point;
		do {
			System.out.print("点数を入力(0から100の整数): ");
			point = scanner.nextInt();
		}while (point < 0 || point > 100);

		switch(testCase) {
			case 1:
				if (point >= 60) {
					System.out.println("合格");
				} else {
					System.out.println("不合格");
				}
				break;

			case 2:
				if (point >= 80) {
					System.out.println("たいへんよくできました。");
				} else if (point >= 60) {
					System.out.println("よくできました。");
				} else {
					System.out.println("ざんねんでした。");
				}
				break;

			case 3:
				if (point >= 80) {
					System.out.println("優");
				} else if (point >= 70) {
					System.out.println("良");
				} else if (point >= 60) {
					System.out.println("可");
				} else {
					System.out.println("不可");
				}
		}
	}

}
