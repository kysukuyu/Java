import java.util.Scanner;
public class java17{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number,money=0;
		System.out.print("請輸入使用度數 =>");
		number = in.nextInt();
		if(number<=25)
			money = 125;
		else
			money=number*5;
		System.out.printf("應繳費用為 => %d 元\n", money);
	}
}	
		
		