package class16;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入正整数");
		System.out.println("输入0退出");
		do {
			int a,b,d=0;
			Scanner sr = new Scanner(System.in);
			System.out.print("输入第一个正整数: ");
			a= sr.nextInt();
			if(a==0) {
				System.out.println("你输入了0,程序退出");
				break;
			}else if(a<0) {
				System.out.println("你输入了负数,请重新输入");
				continue;
			}
			System.out.print("输入第二个正整数: ");
			b= sr.nextInt();
			if(b==0) {
				System.out.println("你输入了0,程序退出");
				break;
			}else if(b<0) {
				System.out.println("你输入了负数,请重新输入");
				continue;
			}
			
			/***最大公约数***/
			if(a<b) {
				int c = 0;
				c=a;
				a=b;
				b=c;
			}
			int c = 0;
			int m,n;
			m=a;
			n=b;
			do{
				d=m%n;
				c=m/n;
				if(d==0) {
					System.out.println("最大公约数是"+c);
					break;
				}else {
					m=n;
					n=d;
				}
			}while(true);
			
			/***最小公倍数***/
			int x,y;
			x=a/c;
			y=b/c;
			int j =x*y*c;
			System.out.println("最小公倍数是"+j);
		}while(true);
	}
		
}
