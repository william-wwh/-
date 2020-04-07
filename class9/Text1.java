package class9; 

public class Text1 {

	public static void main(String[] args) {
         int sum = 0;
         
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (i == Math.pow(bai,3) + Math.pow(shi,3) + Math.pow(ge,3)) {
                System.out.println(i + "是水仙花数");
                sum++;
            }
        }
        System.out.println("一共有" + sum + "个三位数的水仙花数");

    }
}