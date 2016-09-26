package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print("分鐘="); 
        int t = Scn.nextInt(); 
		float p = 0.5f;
		    if (t<600){
			System.out.print("電話費為="+p*t);
		}else{
			if (t>=600 && t<1200){
				System.out.print("電話費為="+p*t*0.9);
	    }else{
		    if(t>=1200){
		    	System.out.print("電話費為="+p*t*0.79);
				}
			}
		}

	}

}
