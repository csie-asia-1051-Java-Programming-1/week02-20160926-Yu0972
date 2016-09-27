package hw;
/*
 * Topic:假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，
 * 且媽媽交待，要老闆找小明的零錢的數目要最少，而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，
 * 且a1*15+ a2*20+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/27
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.print("媽媽給了多少元=");
	int n = scn.nextInt();
	System.out.print("買了多少顆蘋果=");
	int a1 = scn.nextInt();
	System.out.print("買了多少顆柳丁=");
	int a2 = scn.nextInt();
	System.out.print("買了多少顆桃子=");
	int a3 = scn.nextInt();
	int s1 = a1*15+a2*20+a3*30;
	int s2 = n-s1;
	int s3 = s2/50;
	int s4 = (s2-50*s3)/5;
	int s5 = (s2-50*s3-5*s4)/1;
        if(n >= s1){
	System.out.println("找了50元硬幣"+s3+"個");
	System.out.println("找了5元硬幣"+s4+"個");
	System.out.println("找了1元硬幣"+s5+"個");
       }else{
	System.out.println("小明錢不夠");
		}
	}

}
