package practice;

import java.util.Scanner;

public class Prac3_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int chukan;
		do {
			System.out.print("点数を入力(0から100の整数): ");
			chukan = scanner.nextInt();
		}while (chukan < 0 || chukan > 100);

		int kimatu;
		do {
			System.out.print("点数を入力(0から100の整数): ");
			kimatu = scanner.nextInt();
		}while (kimatu < 0 || kimatu > 100);

		if ( chukan >= 60 && kimatu >= 60) {
			System.out.println("合格");
		} else if ( (chukan + kimatu) >= 130) {
			System.out.println("合格");
		} else if ( (chukan + kimatu) >= 100 && (chukan >= 90 || kimatu >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}
