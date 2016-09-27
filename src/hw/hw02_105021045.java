package hw;
/*
 * Topic:已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6
 * ；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/27
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入性別（1代表男性；2代表女性）=");
		int a = scn.nextInt();
		System.out.print("輸入身高=");
		int b = scn.nextInt();
	    if(a == 1){
	    System.out.println("標準體重為" + (b-80) * 0.7 + "公斤");
	    }else{
	    if(a == 2){
	    System.out.println("標準體重為" + (b-70) * 0.6 + "公斤");
	    }
	    }
	}

}
