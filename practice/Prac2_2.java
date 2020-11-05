package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac2_2 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String s = br.readLine();    // 1行分の文字列を入力する
        int i = 0;

        try {
        	i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
        	System.out.println("数値を入力してください");
        	return;
        }

        System.out.println(i);
    }

}
