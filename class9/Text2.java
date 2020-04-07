package class9;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*一维数组的定义和应用
		定义一个一维数组，初始化时给数组赋以下值{30.4, 15, 64, 17.9, 22.56, 48.91, 35, 82.5}。
		1、求出该数组中的最大值和最小值，并显示其对应的下标；
		2、求出该数组的平均值。*/
		
		double max = 0;
		double min = 0;
		double sum = 0;
		double average = 0;
		double[] s=new double[]{30.4, 15, 64, 17.9, 22.56, 48.91, 35, 82.5};
		for (int i = 0; i < s.length; i++) {
			if (max < s[i]) {
				max=s[i];
			}
		}
		System.out.println("最大值为"+max);
		
		
		min = s[0];
		for (int i = 0; i < s.length; i++) {
			if (min > s[i]) {
				min=s[i];
			}
		}
		System.out.println("最小值为"+min);
		
		
		for (int i = 0; i < s.length; i++) {
			sum +=s[i];
		}
		average = sum/s.length;
		System.out.println("平均值为"+average);
	}

}
