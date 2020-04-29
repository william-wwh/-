package class14;

import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int y = 0;
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		do {
			System.out.print("请输入年份:");
			y = sr.nextInt();

			if (y <= 2050 & y >= 1990) {

				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {

					System.out.println("yes");

				} else {

					System.out.println("no");
				}

			} else {
				System.out.println("超出范围,请输入1990~2050之间的整数");
			}

		} while (true);
	}
}