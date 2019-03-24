package cn.neepu.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;



public class Main {

   public static void main(String[] args)throws IOException{

      BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));

      String str = bd.readLine();

      int count2=0;//2的个数

      int count=0;//数字总个数

      if(str.charAt(0)=='-'){//负数

         count=str.substring(1).length();

      }else{

         count=str.length();

      }

      char[] chs=str.toCharArray();

      for(int i=0;i<chs.length;i++){

         if(chs[i]=='2')

            count2++;

      }

     

      double r=(double)count2/(double)count;

      if(str.charAt(0)=='-'){//负数

         r=r*1.5;

      }

      char ch=str.charAt(str.length()-1);

      if(ch=='0' || ch=='2' || ch=='4' || ch=='6' || ch=='8'){//负数

         r=r*2;

      }

      int start=(int)(r*100);

      DecimalFormat df=new DecimalFormat("######0.00");

      int index = df.format(r).indexOf('.');

      String end = df.format(r).substring(index+1);

     

      System.out.println(start+"."+end+"%");

   }

}
