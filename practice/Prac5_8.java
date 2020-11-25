package practice;

import java.util.Scanner;

public class Prac5_8 {

	public static void main(String[] args) {

		int [] input = new int[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + "個目の入力 => ");
			input[i] = scanner.nextInt();
		}

		Prac5_8 inst = new Prac5_8();
		int [] output = inst.sort(input);

		System.out.print("ソート前 => ");
		inst.printA(input);
		System.out.print("ソート後 => ");
		inst.printA(output);

	}

	public int[] sort(int[] input) {
		return null;
	}

	private void printA(int [] a) {

		if (a == null) return;

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");
		System.out.println();
	}
}
