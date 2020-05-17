package class19;

import java.util.Scanner;

public class Text4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sr = new Scanner(System.in);
		int a[] = new int [10];
		for(int i =0;i<10;i++) {
			a[i] = sr.nextInt();
		}
		sr.close();
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
