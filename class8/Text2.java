package class8;

public class Text2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,b,c,d;
		a=0;
		b=0;
		c=0;
		d=0;
		for(;a>=0 &&a<=50;a++) {
            for(b=0;b>=0 && b<=50;b++){
                for(c=0;c>=0 && c<=50;c++){
                    for(d=0;d>=0 && d<=50;d++){
		                if(a+b==8 & a+c==14 & b+d==10 & c-d==6) {
		        	        System.out.println("a为:"+a+"\nb为:"+b+"\nc为:"+c+"\nd为:"+d);
		                	return;
                        }
                    }
                }
            }
		}
	}
}
