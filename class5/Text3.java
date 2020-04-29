package class5;

public class Text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double paper = 0.0001;
		int sum = 0;
		for (sum = 0; paper <= 8848; sum++) {// 死循环
			if (paper < 8848) {
				sum++;
				paper = paper * 2.0;
			} else {
				break;// 跳出循环
			}
		}
		System.out.println("一共折了" + sum + "次");
	}
}
