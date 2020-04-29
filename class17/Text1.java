package class17;

import java.util.Scanner;

public class Text1 {
	/*
	 * 操场上有n排学生，第一排有1个学生，第二排有3个学生，第三排有6个学生，第四排有10个学生，......。按照这样的规律，n排总共有多少学生。
	 * 输入
	 * 输入一行，只有一个正整数。		数据范围：0<n<100。
	 * 
	 */
	public static void main(String[] args) {
		double n = 0;
		Scanner str = new Scanner(System.in);
		System.out.println("输入的值应在0~100之间");
		System.out.print("输入行数: ");
		n = str.nextInt();
		str.close();							//输入结束
		
		double a = Math.pow(n, 2);				//求n的平方
		if (n > 0 && n < 100) {
			double y = n+a;
			
			System.out.println((int) y/2);
		} else {
			System.out.println("超出范围 输入的值应在0~100之间");
		}
	}

}