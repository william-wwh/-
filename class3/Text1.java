package class3;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a, b, c;
		a = 100;
		b = 90;
		c = 60;
		if(a>=60) {
			if(b>a) {
				if(c>b) {
					System.out.println("继续保持，成绩在不断进步");
				}else{
					if(c>=60) {
						System.out.println("第三次成绩下滑，继续锻炼");
					}else {
						System.out.println("不适合当运动员");
					}
				}
			}else {
				if(b>=60) {
					System.out.println("第二次成绩下滑，继续锻炼");
				}else {
					System.out.println("不适合当运动员");
				}
			}
		}else {
			System.out.println("不适合当运动员");
		}
	}
}
