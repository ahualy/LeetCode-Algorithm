package cn.neepu.acm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class 星期 {

	public static void main(String[] args) {
       
		
		System.out.println("请输入第一个字母");
		char ch = getChar();
		switch (ch) {
		case 'M':
		case 'm':
			System.out.println("Monday");
			break;
		case 'W':
		case 'w':
			System.out.println("Wednesday");
			break;
		case 'F':
		case 'f':
			System.out.println("Friday");
			break;
		case 'T':
		case 't':
			Re();
			break;
		case 'S':
		case 's':
			Re1();
			break;

		default:System.out.println("你的输入有误！");
		       
			break;
		}
		
		
	}

	/**
	 *Re1 
	 */
	public static void Re1() {
		System.out.println("请输入第二个字母");
		char ch3 = getChar();
		if(ch3=='U'||ch3=='u') {
			System.out.println("Sunday");
		}else if(ch3=='A'||ch3=='a') {
			System.out.println("Saturday");
		}else {
			System.out.println("没有这种写法");
			Re1();
		}
	}

	/**
	 * Re
	 */
	public static void Re() {
		System.out.println("请输入第二个字母");
		char ch2 = getChar();
		if(ch2=='U'||ch2=='u') {
			System.out.println("Tuesday");
		}else if(ch2=='H'||ch2=='h') {
			System.out.println("Thursday");
		}else {
			System.out.println("没有这种写法");
			Re();
		}
	}

	private static char getChar() {
		
		Collection<Character> c = new ArrayList<Character>();
		c.add('M');
		c.add('m');
		c.add('F');
		c.add('f');
		c.add('S');
		c.add('s');
		c.add('W');
		c.add('w');
		c.add('T');
		c.add('t');
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch = str.charAt(0);
		
		if(!(c.contains(ch))) {
			System.out.println("输入错误，请重新输入");
			ch=getChar();
		}
		return ch;
	}

}









