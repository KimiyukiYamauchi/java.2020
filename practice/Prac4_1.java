package practice;

import java.util.Scanner;

public class Prac4_1 {

	public static void main(String[] args) {

		int [] input = new int[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + "個目の入力 => ");
			input[i] = scanner.nextInt();
		}

		Prac4_1 inst = new Prac4_1();
		System.out.println("平均値 => " + inst.avg(input));
		System.out.println("最大値 => " + inst.max(input));
		System.out.println("最小値 => " + inst.min(input));

	}

	public int avg(int[] input) {
		return 0;
	}

	public int max(int[] input) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public int min(int[] input) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}


}
