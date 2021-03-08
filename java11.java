import java.util.Scanner;
public class java11{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int total,sum1,sum2,value;
		int item1,item2;
				
		System.out.printf("珍奶(每杯30元)購買數量 =>");
		item1=in.nextInt();sum1=item1*30;
		
		System.out.printf("便當(每個65元)購買數量 =>");
		item2=in.nextInt();sum2=item2*65;
		
		total=sum1+sum2;
		
		System.out.printf("\n***列印購物清單 ***\n");
		System.out.printf("-----------------------\n");
		System.out.printf("| 品名  \t|  單價   \t|  數量  \t|  小計  \t|\n");
		System.out.printf("-----------------------\n");
		System.out.printf("| 珍奶  \t|  30   \t|  %d  \t    |  %d  \t  |\n", item1, sum1);
		System.out.printf("| 便當  \t|  65   \t|  %d  \t    |  %d  \t  |\n", item2, sum2);
		System.out.printf("-----------------------\n");
		System.out.printf("| 總計  \t|  %d   \t    \t    \t|\n", total);
		System.out.printf("-----------------------\n");
	}
}
		
		
		
		
	