package class15;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		hello();
		int a = he(3, 4);
		long b = jc(10);
		System.out.println(a);
		System.out.println(b);
	}

	public static void hello() {
		System.out.println("Hello world!");
	}

	public static int he(int a, int b) {
		return a + b;
	}

	public static long jc(int n) {
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}

}
