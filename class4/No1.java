package class4;

public class No1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=0, sum=0 ,a=0;
		
		while(a<=999) {
			a= 2*n+1;
			sum += a;
			n++;
		}
		System.out.println(sum);
	}

}
