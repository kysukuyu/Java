import java.util.Scanner;
public class java7{
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		int div1, value1, value2;
		float div;
		System.out.printf("請輸入兩個整數(value1 value2)=>");
		value1=keyin.nextInt();
		value2=keyin.nextInt();
		
		div=value1/value2;
		System.out.printf("未轉換 =>%d/%d=%f\n", value1, value2, div);
		
		div=(float)value1/value2;
		System.out.printf("已轉換 =>(float)%d/%d=%f\n", value1, value2, div);
		
		div=value1/(float)value2;
		System.out.printf("已轉換 =>%d/(float)%d=%f\n",value1,value2,div);
	}
}

