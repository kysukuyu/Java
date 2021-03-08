import java.util.Scanner;

public class java58{
	public static void main(String[] args){
		final int pwd = 80;
		int num;
		Scanner scanner = new Scanner(System.in);
		
		for(; ;){
			System.out.print("請猜0-99的數字:");
			num = scanner.nextInt();
			if(num == pwd) {
				System.out.println("恭喜猜對了!!");
				break;
			}
			System.out.println("猜錯了請再答一次!!");
		}
	}
}

			