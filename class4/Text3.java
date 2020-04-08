package class4;

public class Text3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/* 小明参加马拉松长跑比赛，绕400米操场跑50圈，前10圈最有力气的
		 * 时候，以5m/s 的速度在匀速奔跑，10圈之后力气不够了，以每2圈都
		 * 降0.1m/s的速度匀速奔跑为最后冲刺蓄力，到了最后2圈，以全力最
		 * 快速度8m/s的速度冲刺。请问，小明跑完这次马拉松用时多久？*/
		 
		int i = 1;
		double s = 0;
		double time = 0;
		while(i<=50) {
			if(i<=10) {
				s=5;
			}
			else if(i<=48) {
				if(i%2==1) {
					s-=0.1;
				}
			}
			else {
				s=8;
			}
			time += 400/s;
			i++;
 		}
 			System.out.println(time);
	}

}
