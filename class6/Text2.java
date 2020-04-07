package class6;

public class Text2 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int year = 1;
		int i = 0;
		for(;year<=2020;year++) {
			if(year%4==0) {
				if(!(year%100==0)) {
					System.out.println(year+"年是闰年");
					i++;
				}else {
					continue;
				}
			}else if(year%400==0) {
				System.out.println(year+"年是闰年");
				i++;
			}
		}
		System.out.println("1到2020有"+i+"年是闰年");
	}
}
