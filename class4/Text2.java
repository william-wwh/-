package class4;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = 0;			//已跑的圈数
		double jl = 0;		//已经跑的距里
		double jl3 = 0;
		double time = 0;	//用时
		double s = 0;		//速度
		
		s = 5;
		while(i<10) {
			jl += 400;
			i++;
		}
		time += jl/s; 
		
		while(i<48) {
			i++;
			if(i%2==1) {
				s-=0.1;
			}
			time += 400/s;
		}
		s = 8;
		while(i<50) {
			jl3 += 400;
			i++;
		}
		time += jl3/s;
		System.out.println("用时"+time+"s");
		
	}

}