package cn.neepu.acm;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 到底有多二 {

	public static void main(String[] args) {
        
		 final BigInteger b1 = new BigInteger("0");
		
		   Scanner in = new Scanner(System.in);
		   BigInteger b = in.nextBigInteger();
		   String s = b.toString();
		   //获取长度
		   int length = s.length();
		   char ch[] = s.toCharArray();
		   int count = 0;
		   double d = 0;
		   
		   DecimalFormat  df = new DecimalFormat("0.00");   
		   
            //    统计2的个数
		   for(int i=0;i<length;i++) {
			   if(ch[i]=='2') {
				   count++;
			}
		   }
		   
		   //  -1 0 1
		   if(b.compareTo(b1)==-1) {	   
			   d = (double)count/(length-1);
			   d = d+d*0.5;
			   if((int)ch[length-1]%2==0) {
				   d = d+d*1;
			   }
			   System.out.println(df.format(d*100)+"%");
		   }
		   else {
			   d = (double)count/(length);
			   System.out.println(df.format(d*100)+"%");
		   }
		   
		   in.close();
	 }
}

