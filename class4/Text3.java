package class4;

public class Text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = 1;
		double s = 0;
		double time = 0;
		while(i<=50) {
			if(i<=10) {
				s=5;
			}
			else if(i<=48) {
				if(i%2==1) {
					s-=0.1;
				}
			}
			else {
				s=8;
			}
			time += 400/s;
			i++;
 		}
 			System.out.println(time);
	}

}
