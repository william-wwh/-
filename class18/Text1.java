package class18;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String n = "";
		Scanner str = new Scanner(System.in);
		n = str.next();
		str.close();
		
		for(int i = n.length()-1; i >=0; i-- ) {
			System.out.print(n.charAt(i));
		}
	}

}
