import java.util.Scanner;
public class java12{
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		double value,squre;
		System.out.printf("請輸入一個浮點數 =>");
		value=keyin.nextDouble();
		if(value > 0){
			squre=Math.sqrt(value);
			System.out.printf("%.2f 的平方根值為 =%.2f\n",value,squre);
			}
			System.out.printf("END \n");
	}
}
		
		

	