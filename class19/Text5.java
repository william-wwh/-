package class19;

import java.util.Scanner;

public class Text5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int ss[] = new int[10];
		Scanner sr = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			ss[i] = sr.nextInt();
		}
		sr.close();

		boolean a = true;
		for (int i = 0; i < ss.length; i++) {
			a = true;

			for (int j = 0; j < ss.length - i - 1; j++) {

				if (ss[j] > ss[j + 1]) {
					int temp = ss[j];
					ss[j] = ss[j + 1];
					ss[j + 1] = temp;

					a = false;
				}
			}
			if (a) {
				break;
			}
		}
		for (int k : ss) {
			System.out.print(k + " ");

		}
	}

}
