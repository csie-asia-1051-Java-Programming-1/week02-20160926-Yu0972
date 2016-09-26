package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print("停多久時間(分鐘)="); 
        int t = Scn.nextInt(); 
        int c = t/30;
		    if (t<120){
		    System.out.print("需要繳交的停車費="+c*30);
		}else{
			if (t>=120 && t <= 240){
		    int d = c-4;
		    System.out.print("需要繳交的停車費="+(d*40+120));
	    }else{
	    	if (t>240){
	        int f = c-8;
	        System.out.print("需要繳交的停車費="+(f*60+280));
	    	}
			}
		}
	}
}
