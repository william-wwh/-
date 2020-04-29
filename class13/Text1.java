package class13;

public class Text1 {

	public static void main(String[] args) {
		int a = 102;
		switch (a / 10) {
		case 10:
			if (a > 100) {
				System.out.println("输入有误");
				break;
			}
		case 9:
			System.out.println("优秀");
			break;
		case 8:
		case 7:
			if (a >= 75) {
				System.out.println("良好");
				break;
			} else {
				System.out.println("及格");
				break;
			}
		case 6:
			System.out.println("及格");
			break;
		default:
			if (a > 100) {
				System.out.println("输入有误!");
				break;
			}
			System.out.println("不及格");
		}
	}

}
