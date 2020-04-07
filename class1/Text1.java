package class1;

public class Text1 {

	public static void main(String[] args) {
		int a = 2 ;
		int b = 5;
		int c = 8;
		System.out.println(a++);		//��1
		System.out.println(a);
		System.out.println(--b);		//��2
		c -= a;
		System.out.println(a+""+c);	//��3
		if(a+b>=7 && c-b>a) {			//��4
			System.out.println("��"); 	
		}else {
			System.out.println("��");
		}

	}

}

