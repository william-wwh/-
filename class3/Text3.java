package class3;

public class Text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=10;
		int b=85;
		int c=86;
				
		if(a + b + c >= 180){
			if(c > b & b > a)
			System.out.println("继续保持，成绩在不断进步");
		}
			else if(c < b | b < a){
				System.out.println("该次成绩下滑，继续锻炼");
			}
				else if(a < 60 | b < 60 | c < 60){
					System.out.println("不适合当运动员");
					
			}
	}

}
