package class4;

public class No3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int i=1;
        double time=0;
        double s =5;
        
        do {
        	if(i<10)
        		s=5;
        	i++;
        }
       while(i<50);
        do{
        	if(i%2==1)
        		s-=0.1;
        }
        while(i<48);
        do {
        	s=8;
        	i++;
        }while(i>48 && i<50);
        time +=400/s;
        
        
        
        System.out.println(time);
	}

}
