package cn.neepu.acm;

import java.util.Scanner;

public class 阶乘和 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  
		int n = sc.nextInt();
		int m = 1;
		int count=0;
		for(int i=1; i<=n;i++) {
			m*=i;
			count+=m;
		}
		
		System.out.println(count);
		sc.close();
	}

}
