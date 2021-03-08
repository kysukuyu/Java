import java.util.Scanner;
public class java99{
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total,sum1,sum2,sum3,value;
		int item1,item2,item3;
		
		System.out.printf("飲料(每瓶20元) 購買數量 =>");
		item1=keyin.nextInt(); 
		sum1=item1*20;
		
		System.out.printf("便當(每盒60元) 購買數量 =>");
		item2=keyin.nextInt(); 
		sum2=item2*50;
		
		System.out.printf("水果(每盒100元) 購買數量 =>");
		item3=keyin.nextInt(); 
		sum3=item3*100;
		
		total = sum1+sum2+sum3;
		System.out.printf("\n***列印購物清單 ***\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("| 品名 \t|   單價   \t| 數量 \t| 小計\t|\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("| 飲料 \t|   20     \t| %d   \t| %d  \t|\n",
															item1,sum1);
		System.out.printf("----------------------------------------\n");
		System.out.printf("| 便當 \t|   50     \t| %d   \t| %d  \t|\n",
														item2,sum2);
		
		System.out.printf("| 水果 \t|   100    \t| %d   \t| %d  \t|\n",
														item3,sum3);
		System.out.printf("----------------------------------------\n");
		
		System.out.printf("| 總計 \t|   %d   \t  \t  \t|\n",
														         total);
		System.out.printf("----------------------------------------\n");
	}
}

			
		
		
		
		
		
		
		