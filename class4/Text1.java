package class4;

public class Text1 {

	public static void main(String[] args) {
		int n = 0, sum = 0, a = 0;

		while (a < 999) {
			a = 2 * n + 1;
			sum += a;
			n++;
		}
		System.out.println(sum);
	}

}
