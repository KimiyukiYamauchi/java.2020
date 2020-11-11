package practice;

import java.util.Scanner;

public class Prac3_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x => ");
		int x = scanner.nextInt();
		System.out.print("y => ");
		int y = scanner.nextInt();

		Prac3_10 ck = new Prac3_10();

		String ret = ck.checkDigit1(x, y);
		if(ret.length() > 0)
			System.out.println(ret);

	}

	// xはyより小さく、かつ、xとyは共に偶数である。
	public String checkDigit1(int x, int y) {

		if (x < y && x%2 == 0 && y%2 == 0)
			return "xはyより小さく、かつ、xとyは共に偶数である。";
		else
			return "";

	}

	// xとyは等しく、かつ、負の数である
	public String checkDigit2(int x, int y) {

		return "";

	}

	// xはyより小さい、または、xは偶数である。
	public String checkDigit3(int x, int y) {

		return "";

	}

	// xは10以下または100以上で、かつ、yは10以上かつ100以下である。
	public String checkDigit4(int x, int y) {

		return "";

	}

	// xもyも負の数である、ではない。
	public String checkDigit5(int x, int y) {

		return "";

	}


}
