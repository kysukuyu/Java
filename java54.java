import java.util.Scanner;

public class java54{
	public static void main(String[] args){
		double price;
		int age;
		int ticket = 100;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("計算票價");
		System.out.print("請輸入年齡:");
		age = scanner.nextInt();
		if(age >= 80 || age <=6){
			price = ticket * 0.2;
			System.out.println("票價是:"+price);
		}
		else if (age >=60 || age <=12){
			price=ticket*0.5;
			System.out.println("票價是:" + price);
		}else{
			price = ticket;
			System.out.println("票價是:"+ticket);
		}
	}
}

		
			
			
			
		