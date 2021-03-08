import java.util.Scanner;

public class java60{
	public static void main(String[] args){
		int x1,x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入2個整數(數字需空白) :");
		while ( !scanner.hasNextInt()){
			System.out.println("輸入第一筆資料型態錯誤請輸入整數");
			scanner.next();
		}
		x1 = scanner.nextInt();
		while (!scanner.hasNextInt()){
			System.out.println("輸入第二筆資料型態錯誤請輸入整數");
			scanner.next();
		}
		x2 = scanner.nextInt();
		System.out.println("你輸入的第一個數字是:" +x1);
		System.out.println("你輸入的第一個數字是:" +x2);
		System.out.println("數字總和是:" +(x1+x2));
	}
}

		