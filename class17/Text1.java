package class17;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		int x = 0;
		Scanner str = new Scanner(System.in);
		System.out.println("输入的值应在0~100之间");
		System.out.print("输入行数: ");
		x = str.nextInt();
		str.close();
		if (x > 0 && x < 100) {
			System.out.println(x * (x + 1) / 2);
		} else {
			System.out.println("超出范围 输入的值应在0~100之间");
		}
	}

}