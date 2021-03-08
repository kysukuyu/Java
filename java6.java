import java.util.Scanner;
public class java6{
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		float ave,sum=0, cost;
		int number=0;
		System.out.printf("***計算股票平均系統 ***\n");
		System.out.printf("請輸入第一個交易日股價 =>");
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum/number;
		System.out.printf("(目前平均價 =%.2f)請輸入第二個交易日股價 =>",ave);
		cost=keyin.nextFloat();
		sum=sum+cost;
		number++;
		ave=sum/number;
		}
}