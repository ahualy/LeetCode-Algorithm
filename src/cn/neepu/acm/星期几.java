package cn.neepu.acm;

import java.util.Scanner;

public class 星期几 {

	public static void main(String[] args) {
  
		Scanner sc =new Scanner(System.in);  
		
		int n = sc.nextInt();
	
		if(n>5) {
			System.out.println(n+2-7);
		 }else {
		System.out.println(n+2);
		}
		sc.close();
	}

}
