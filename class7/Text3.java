package class7;

public class Text3 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 分别用3种循环结构完成一下题目： 给100块钱买可乐，每瓶可乐3块钱， 喝完之后每3个空瓶子可以兑换一瓶可 乐，问最多可以喝到多少瓶可乐？
		 */

		int maney = 100;
		int jg = 3;
		int cola = 0; // 可乐
		int gai = 0; // 盖

		do {
			maney -= jg;
			cola++;
			gai = cola;
		} while (maney > jg);
		do {
			gai -= 3;
			cola++;
			gai++;
		} while (gai >= 3);
		System.out.println(cola);
	}
}
