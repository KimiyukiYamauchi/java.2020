package practice;

import java.util.Scanner;

public class Prac6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		Prac6_2 inst = new Prac6_2();
		int avg = inst.average(x, y);

		System.out.println(x + "と" + y + "の平均は" + avg + "です");

	}

	public int average(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
