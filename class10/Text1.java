package class10;

public class Text1 {

	public static <j> void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int odd = 0;//奇数的个数
		int even = 0;//偶数的个数
		double average = 0;
		double average_even = 0;
		
		int ss[]={47,64,87,32,50,9,65,48,63,92,75,33};
		int j [] =null;
		
		for (int i : ss) {
			if (i%2!=0) {
				odd++;
				average+=i;
			}
			if (i%2==0) {
				even++;
				average_even+=i;
			}
		}
		average/=odd;
		average_even/=even;
		System.out.println("单数的个数"+odd+"\n单数平均值"+average);
		System.out.println("偶数的个数"+even+"\n偶数平均值"+average_even);
	
		
		
		
	}

}
