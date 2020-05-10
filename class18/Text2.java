package class18;

import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		int aSum = 0;						//总分
		int aFull = 0;						//满分
		int[] b = new int[6];
		int bSum = 0;
		int bFull = 0;
	/******************输入*************************/
		Scanner sr = new Scanner(System.in);
		for(int i=0; i<=a.length-1;i++) {
			a[i] = sr.nextInt();
		}
		for(int i=0; i<=b.length-1;i++) {
			b[i] = sr.nextInt();
		}
		sr.close();
	/*****************求总分*************************/
		for(int i=0; i<=a.length-1;i++) {
			aSum+=a[i];
		}
		for(int i=0; i<=b.length-1;i++) {
			bSum+=b[i];
		}
		
	/*****************求满分题数**********************/
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]==50)
				aFull+=1;
		}
		for(int i=0; i<=b.length-1;i++) {
			if(b[i]==50)
				bFull+=1;
		}
	/********************求排名***********************/
		if (aSum>bSum) {
			System.out.println("1");
		}else if(aSum<bSum) {
			System.out.println("2");
		}else {
			if(aFull>bFull) {
				System.out.println("1");
			}else if(aFull<bFull) {
				System.out.println("2");
			}else{
				System.out.println("0");
			}
		}
		
	}

}