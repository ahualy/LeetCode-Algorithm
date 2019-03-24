package cn.neepu.acm;

import java.util.Scanner;

public class 平方和与立方和 {

	public static void main(String[] args) {
        
		for(int i = 0;i<2;i++) {
			 he(); 
		}
		
		 
	}

	/**
	 * 
	 */
	public static void he() {
		Scanner in = new Scanner(System.in);
		  
		  int m = in.nextInt();
		  int n = in.nextInt();
		  
		  int x=0,y=0;
		  if(m>n) {
			  int temp = m;
			  m = n;
			  n = temp;
		  }
		  
		  for(int i = m;i<=n;i++) {
			  if(i%2==0) {
				  x = x+i*i;
			  }else {
				  y = y+i*i*i;
			  }
		  }
		 System.out.println(x+" "+y);
	}

}
