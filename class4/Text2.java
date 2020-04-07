package class4;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double a = 400;		//一圈长度
		int i = 0;			//已跑的圈数
		double jl = 0;		//已经跑的距离
		double time = 0;	//用时
		float s = 0;		//速度
		
		s = 5;
		while(i<10) {
			jl += a;
			i++;
		}
		time = jl/s; 
		
		while(i<48) {
			i++;
			if(i%2==0) {
				s-=0.1;
			}
			time += 400/s;
		}
		
		jl = 0;
		s = 8;
		while(i>=48 && i<50) {
			jl += a;
			i++;
		}
		time += jl/s;
		System.out.println(time);
	}

}
