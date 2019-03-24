package cn.neepu.acm;

import java.util.Scanner;

public class 奥巴马 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  
        //将字符串变成字符数组
        String[] firstLine =sc.nextLine().split(" ");  
        int  n =Integer.parseInt(firstLine[0]);  
        char c =firstLine[1].charAt(0); 
        
        for(int i = 0;i<n*0.5;i++) {
        	for(int j = 0;j<n;j++) {
        	     System.out.print(c);
           }
        	System.out.println();
        }
        sc.close();
	}
}
