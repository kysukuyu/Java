import java.util.*;
import java.util.Scanner;
public class java93{
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		final int limit = 120;
		double credit;
		double pay;
		double rate;
		int count=0;
		double balance;
		
		System.out.printf("==歡迎光臨試算系統 ==\n");
		System.out.printf("請輸入貸款金額 (萬) =>");
		credit=keyin.nextDouble();
		System.out.printf("請輸入年利率 (如0.02)=>");
		rate=keyin.nextDouble();
		System.out.printf("期望每月還款額度(萬)=>");
		pay = keyin.nextDouble();
		
		balance=credit;
		do{
			balance=balance+(balance*rate)/12;
			balance=balance-pay;
			count=count+1;
		}while(balance>0);
		System.out.printf("您需要 %d 期(月) 才可還款完畢\n",count-1);
		if(count>limit)
			System.out.printf("超過期數 %d 請另選貸款額度\n",limit);
		else
			System.out.printf("本行願意承做,歡迎洽詢行員\n");
	}
}
