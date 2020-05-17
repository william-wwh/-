package class20;

import java.util.Scanner;

public class Text4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt();
		sr.close();
		switch(m) {
		case 12:
		case 1:
		case 2:
			System.out.println("春季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("夏季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("秋季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("冬季");
			break;
		}
	}

}
