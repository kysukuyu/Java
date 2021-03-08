import java.util.Scanner;

public class java56{
	public static void main(String[] args){
		int year;
		int rem1, rem2, rem3;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("判斷輸入年份是否閏年");
		System.out.println("請輸入任意字元");
		year = scanner.nextInt();
		rem1 = year % 4;
		rem2 = year % 100;
		rem3 = year % 400;
		if (rem2 == 0)
			if (rem2 != 0 || rem3 == 0)
				System.out.printf("%d 是閏年", year);
			else
				System.out.printf("%d 不是閏年", year);
		else	
			System.out.printf("%d 不是閏年", year);
	}
}


		
		