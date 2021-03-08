import java.util.*;

class employee{
	int ID;
	String name;
	String depart;
	int payment;
	int duty;
}
public class java82{
	public static void main(String args[]) {
		Scanner keyin=new Scanner(System.in);
		
		/*new 產生物件變數*/
		employee emp=new employee();
		System.out.printf("***輸入員工資料 ***\n");
		System.out.printf("輸入員工姓名=>");
		emp.name=keyin.nextLine();
		System.out.printf("輸入員工所屬部門 =>");
		emp.depart=keyin.nextLine();
		System.out.printf("輸入員工代號 =>");
		emp.ID=keyin.nextInt();
		System.out.printf("輸入員工底薪 =>");
		emp.payment=keyin.nextInt();
		System.out.printf("輸入薪資加給");
		emp.duty=keyin.nextInt();
		
		System.out.printf("\n***印出員工資料***\n");
		System.out.printf("員工代號=%d\n",emp.ID);
		System.out.printf("員工姓名=%s\n",emp.name);
		System.out.printf("所屬部門=%s\n",emp.depart);
		System.out.printf("底    薪=%d\n",emp.payment);
		System.out.printf("職務加給=%d\n",emp.duty);
	}
}
