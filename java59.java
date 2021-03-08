import java.util.Scanner;

public class java59{
	public static void main(String[] args){
		final int pwd = 80;
		int count = 1;
		int num;
		Scanner scanner = new Scanner(System.in);
		
		while(count <= 5){
			System.out.print("請猜0-99的數字: ");
			num = scanner.nextInt();
			if(num == pwd){
				System.out.println("恭喜猜對了!!");
				break;
			}
			if (count == 5)
				System.out.println("最多只能猜5次, bye!");
		else
				System.out.println("猜錯了請再答一次!");
		count++;
		}
	}
}