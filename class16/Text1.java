package class16;

import java.util.Scanner;

public class Text1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入正整数");
		System.out.println("输入0退出");
		do {
			int a, b;
			Scanner sr = new Scanner(System.in);
			System.out.print("输入第一个正整数: ");
			a = sr.nextInt();
			if (0 == a) {
				System.out.println("你输入了0,程序退出");
				break;
			} else if (a < 0) {
				System.out.println("你输入了负数,请重新输入");
				continue;
			}
			System.out.print("输入第二个正整数: ");
			b = sr.nextInt();
			if (0 == b) {
				System.out.println("你输入了0,程序退出");
				break;
			} else if (b < 0) {
				System.out.println("你输入了负数,请重新输入");
				continue;
			}
			sr.close();

			/*** 最大公约数 ***/
			if (a < b) {
				int c = 0;
				c = a;
				a = b;
				b = c;
			}
			int quotient = 0; // 商
			int remainder = 0; // 余数
			int dividend, divisor; // 被除数,除数
			dividend = a;
			divisor = b;
			do {
				remainder = dividend % divisor; // 求余数
				quotient = dividend / divisor; // 求商
				if (remainder == 0) {
					System.out.println("最大公约数是" + divisor);
					break;
				} else {
					dividend = divisor;
					divisor = remainder;
				}
			} while (true);

			/*** 最小公倍数 ***/
			int remainder1, remainder2;
			remainder1 = a / divisor;
			remainder2 = b / divisor;
			int leastCommonMultiple = remainder1 * remainder2 * divisor;
			System.out.println("最小公倍数是" + leastCommonMultiple);
			System.out.println();
		} while (true);
	}

}