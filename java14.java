import java.util.*;
import java.io.*;
import java.util.Scanner;
public class java14{
		public static void main(String args[])throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		Random random=new Random();
		
		System.out.printf("\n請輸入第一個玩家的姓名(開始擲骰子)=>");
		String use1=keyin.readLine();
		int num1=1+random.nextInt(6);
		int num2=1+random.nextInt(6);
		int num3=1+random.nextInt(6);
		int sum1=num1+num2+num3;
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 = %d\n",use1,num1,num2,num3,sum1);
		
		System.out.printf("\n請輸入第二個玩家的姓名(開始擲骰子)=>");
		String use2=keyin.readLine();
		int num4=1+random.nextInt(6);
		int num5=1+random.nextInt(6);
		int num6=1+random.nextInt(6);
		int sum2=num4+num5+num6;
		
			
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 = %d\n",use2,num4,num5,num6,sum2);
		
		
	}
}




			
		

	
	