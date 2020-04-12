package class11;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		冒泡排序
		double ss [] ={30.4, 15, 64, 17.9, 22.56, 48.91, 35, 82.5};
		double temp = 0;
		boolean a = true;
		for (int i = 1; i < ss.length; i++) {
			a = true;
			
			for (int j = 0; j < ss.length-i; j++) {
				
					if(ss[j]>ss[j+1]) {
						temp = ss[j];
						ss[j]=ss[j+1];
						ss[j+1] = temp;

						a = false;
					}
				}
			if (a) {
				break;
			}
		}
		for (double k : ss ) {
			System.out.print(k+"   ");
			
		}
	}

}
