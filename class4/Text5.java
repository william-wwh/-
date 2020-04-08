package class4;

public class Text5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/* 小明参加马拉松长跑比赛，绕400米操场跑50圈，前10圈最有力气的
		 * 时候，以5m/s 的速度在匀速奔跑，10圈之后力气不够了，以每2圈都
		 * 降0.1m/s的速度匀速奔跑为最后冲刺蓄力，到了最后2圈，以全力最
		 * 快速度8m/s的速度冲刺。请问，小明跑完这次马拉松用时多久？*/
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
