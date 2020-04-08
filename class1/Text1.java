package class1;

public class Text1 {

	public static void main(String[] args) {
		int a = 2 ;
		int b = 5;
		int c = 8;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--b);
		c -= a;
		System.out.println(a+""+c);
		if(a+b>=7 && c-b>a) {
			System.out.println("ture"); 	
		}else {
			System.out.println("false");
		}

	}

}

