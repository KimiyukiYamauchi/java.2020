package practice;

import java.util.Scanner;

public class Prac2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("年齢を入力してください> ");
		int age = scanner.nextInt();
		
		System.out.println(age * 365 + "日経過しています");
	}

}
