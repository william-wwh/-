package class19;

public class Text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a []= new int[11];
		for (int i = 10; i <= 20; i++) {
			a[i-10] = (int) Math.pow(i,2);
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
