package class16;

import java.util.Scanner;

public class Text1_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a, b;
		Scanner sr = new Scanner(System.in);
		System.out.println("请输入正整数");
		System.out.println("输入0退出");
		do {
			System.out.print("请输入第一个数: ");
			a = sr.nextInt();
			if (a < 0) {
				continue;
			} else if (a == 0) {
				System.out.println("已退出");
				break;
			}
			System.out.print("请输入第二个数: ");
			b = sr.nextInt();
			if (b < 0) {
				continue;
			} else if (b == 0) {
				System.out.println("已退出");
				break;
			}
			sr.close();

			int m, n;
			m = a;
			n = b;
			if (m < n) {
				int c = 0;
				c = m;
				m = n;
				n = c;
			}
			int d = 0, c = 0;
			do {
				d = m % n;
				c = m / n;
				if (d == 0) {
					System.out.println("最大公约数是" + n);
					break;
				} else {
					m = n;
					n = d;
				}
			} while (true);

			int x, y, j;
			x = a / c;
			y = b / c;
			j = x * y * c;
			System.out.println("最小公倍数是" + j);
		} while (true);
	}

}
