package class4;

public class Text4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double speed = 0;		//速度
		int i= 0;				//已跑的圈数
        double time = 0;		//时间
        int distance = 0;       //距离
		
		speed = 5;
		do {
			distance += 400;
			i++;
		}while(i<10);
        time += distance / speed;
        
        distance=0;
        do {
        	if(i%2==0) {
        		speed-=0.1;
        	}
        	time += 400 / speed;
        	i++;
        }while(i<48);
    	
        distance=0;
        speed = 8;
        do {
        	distance += 400;
			i++;
        }while(i<50);
        time += distance / speed;
        System.out.println(time); 
	}

}
