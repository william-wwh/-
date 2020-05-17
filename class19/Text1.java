package class19;

public class Text1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = {2,3,4,3,6,5,4};
		int ji = 0,ou = 0;
        for (int i = 1; i <= a.length; i++){
            if(!(i%2==0)){
                ji += 1;
            } else {
                ou += 1;
            }
        }
        System.out.println("奇数的和:"+ji);
        System.out.println("偶数的和:"+ou);
	}

}
