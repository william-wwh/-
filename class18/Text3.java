package class18;

import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) {
		int N = 0 ;
		Scanner sr = new Scanner(System.in);
		N = sr.nextInt();
		int[] Ni =new int[N];	
		for(int i=0; i<=Ni.length-1;i++) {
			Ni[i] = sr.nextInt();
			if(Ni[i]==0) {
			}
		}
		sr.close();
		
		int[][] a = new int[N][3];
		for(int i = 0;i<=Ni.length-1;i++) {
				a[i][0] = Ni[i]/100;
				a[i][1] = Ni[i]/10;
				a[i][2] = Ni[i]%10;
		}
		
		int[] b = new int[10];
		
		for(int i = 0;i<Ni.length;i++) {
			if(Ni[i]==100)
				b[0]+=2;
			else if(Ni[i]==0)
				b[0]+=1;
			else if(a[i][2]==0&&a[i][1]>0&&a[i][1]<=9) {
				b[0]+=1;
			}
			for(int j = 0;j<3;j++) {
				switch( a[i][j] ){
					case 0:
						break;
					case 1:
						b[1]+=1;
						break;
					case 2:
						b[2]+=1;
						break;
					case 3:
						b[3]+=1;
						break;
					case 4:
						b[4]+=1;
						break;
					case 5:
						b[5]+=1;
						break;
					case 6:
						b[6]+=1;
						break;
					case 7:
						b[7]+=1;
						break;
					case 8:
						b[8]+=1;
						break;
					case 9:
						b[9]+=1;
						break;
					default:
						break;
				}
			}
		}
		for(int i = 0;i<=9;i++) {
			if(b[i]!=0) {
				System.out.println(i+" "+b[i]);
			}
		}
	}

}