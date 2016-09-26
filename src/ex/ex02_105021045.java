package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print("a=");
        int a = Scn.nextInt();
        System.out.print("b=");
        int b = Scn.nextInt();
        double c = a*a + b*b;
            if (Math.sqrt(c)<=100){
            System.out.print("點是否在圓形的範圍內="+"yes");
    		}else{
            if (Math.sqrt(c)>100){
            System.out.print("點是否在圓形的範圍內="+"No");
          }
          }
	}

}
