package class10;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int odd = 0;// 奇数的个数
		int even = 0;// 偶数的个数
		double average = 0;
		double average_even = 0;
		boolean a = true;
		int temp = 0;

		int ss[] = { 47, 64, 87, 32, 50, 9, 65, 48, 63, 92, 75, 33 };
		for (int i : ss) {
			if (i % 2 != 0) {
				odd++;
				average += i;
			} else {
				even++;
				average_even += i;
			}
		}
		average /= odd;
		average_even /= even;
		System.out.println("单数的个数" + odd + "\n单数平均值" + average);
		System.out.println("偶数的个数" + even + "\n偶数平均值" + average_even);

		for (int i = 1; i < ss.length; i++) {
			a = true;

			for (int j = 0; j < ss.length - i; j++) {

				if (ss[j] > ss[j + 1]) {
					temp = ss[j];
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
