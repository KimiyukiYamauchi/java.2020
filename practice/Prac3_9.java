package practice;

import java.util.Scanner;

public class Prac3_9 {

	static boolean [][] isActive = {
		// 日     月    火    水     木    金    土
		{false, true, false, true, true, false, true}, // 午前
		{false, true, true, true, true, true, false},  // 午後
		{false, true, true, false, true, true, false}  // 夜間
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int youbi;
		do {
			System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜: ");
			youbi = scanner.nextInt();
		}while (youbi < 0 || youbi > 7);

		int jikantai;
		do {
			System.out.print("0=午前、1=午後、2=夜間: ");
			jikantai = scanner.nextInt();
		}while (jikantai < 0 || jikantai > 3);

		if (isActive[jikantai][youbi]) {
			System.out.println("病院はやっています。");
		} else {
			System.out.println("病院は休診です。");
		}

	}

}
