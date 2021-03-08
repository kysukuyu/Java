import java.util.*;
public class java72{
	public static void main(String[] args){
		long startDate, endDate;
		final int pwd = 60;
		int num;
		Scanner scanner = new Scanner(System.in);
		startDate = System.currentTimeMillis();
		for( ;; ){
			System.out.print("請猜0-99的數字:");
			num = scanner.nextInt();
			if( num == pwd ){
				System.out.println("恭喜猜對了!!");
				endDate = System.currentTimeMillis();
				break;
			}
			System.out.println("猜錯了請再答一次");
		}
		System.out.printf("所花時間%d毫秒", (endDate-startDate));
	}
}

				
			
		

