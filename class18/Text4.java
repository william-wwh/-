package class18;

import java.util.Scanner;

public class Text4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sr = new Scanner(System.in);
		int count = sr.nextInt();
		sr.close();
        for(int i = 2,a=0;i <count;i++){
            if(prime(i) && palindrome(i)){
                System.out.printf(i + " ");
                a++;
                if(a==5)
                	System.out.println();
            }
        }
        System.out.println(Math.sqrt(count));
    }
	    public static boolean prime(int num) { 		//判断是否为素数
	    	for(int i = 2;i <= Math.sqrt(num);i++)
	    		if(num % i == 0)
	    			return false;
	    	return true;
	    }
	
	    static int flip(int num) {  		//反序
	    	int a = 0;
	    	while (num != 0) {
	    		int b = num % 10;
	    		num /=10;
	    		a = a * 10 + b;
	    	}
	    	return a;
	    }
	
	  static boolean palindrome(int num) {  	//判断是否为回文数
	      return num == flip(num);


	}

}
