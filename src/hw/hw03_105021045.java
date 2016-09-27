package hw;
/*
 * Topic:試撰寫一個程式，可由鍵盤讀入一個 4 位數的整數，代表西洋的年份，
 * 然後判別這個年份是否為閏年（每四年一閏，每百年不閏，每四百年一閏，例如西元 1900 雖為 4 的倍數，
 * 但可被 100 整除，所以不是閏年，同理， 2000 年是閏年，因可被 400 整數，而 2004 當然也是閏年，因可以被 4 整除）。
 * Date: 2016/09/27
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入西元年(4位數)=");
		int y = scn.nextInt();
		int y1 = y/4;
		float y2 = (float)y/4;
		float y3 = y2-y1;
		int y4 = y/400;
		float y5 = (float)y/400;
		float y6 = y5-y4;
		int y7 = y/100;
		float y8 = (float)y/100;
		float y9 = y8-y7;
		if(y3 == 0 && y9 != 0 || y6 == 0){
		System.out.println("是閏年");	
		}else{
		System.out.println("不是閏年");	
	}
	}
}
