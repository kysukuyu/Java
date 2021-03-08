import java.util.Scanner;
public class java10{
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		final int a=1, b=2, c=3, d=4;
		int weights = a+b+c+d;
		int x,y,z,k;
		float value;
		
		System.out.printf("***登革熱自我診斷系統 ***\n");
		System.out.printf("\t如: 不明顯(0),稍明顯(2) 明顯(6),很明顯(10)\n");
		
		System.out.printf("請輸入發燒症狀明顯否(0~10 =>");
		x=keyin.nextInt();
		System.out.printf("請輸入發燒症狀明顯否(0~10 =>");
		y=keyin.nextInt();
		System.out.printf("請輸感冒症狀明顯否(0~10) =>");
		z=keyin.nextInt();
		System.out.print("請輸入嗜睡症狀明顯否(0~10)=>");
		k=keyin.nextInt();
		
		value=(float)(x*a+y*b+z*c+k*d)/weights;
		System.out.printf("\n感染登革熱指數為(0~10)=%.2f\n",value);
	}
}
		
		


