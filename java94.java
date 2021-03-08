import java.util.*;
public class java94{
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		String position, name, tel, address;
		System.out.printf("請輸入職位欄位名稱 =>");
		position = keyin.nextLine();
		System.out.print("請輸入姓名 =>");
		name = keyin.nextLine();
		System.out.print("請輸入電話=>");
		tel = keyin.nextLine();
		System.out.print("請輸入地址=>");
		address = keyin.nextLine();
		System.out.printf("名片列印如下: \n");
		System.out.printf("--------------\n");
		System.out.printf("TW            \n");
		System.out.printf("%s\n\n", position);
		System.out.printf("\t%s\n\n",   name);
		System.out.printf("電話:  %s\n", tel);
		System.out.printf("地址:         \n");
		System.out.printf("------------- \n");
	}

}
