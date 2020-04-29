package class11;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 选择排序
		double ss[] = { 30.4, 15, 64, 17.9, 22.56, 48.91, 35, 82.5 };
		for (int i = 0; i < ss.length - 1; i++) {

			int min = i;
			for (int j = i + 1; j < ss.length; j++) {
				if (ss[j] < ss[min]) {
					min = j;
				}
			}
			if (i != min) {
				double tmp = ss[i];
				ss[i] = ss[min];
				ss[min] = tmp;
			}

		}
		for (double k : ss) {
			System.out.print(k + "   ");
		}
	}

}
