import java.util.Scanner;

public class java57{
	public static void main(String[] args){
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入分數1-100 :");
		score = scanner.nextInt();
		switch (score/10){
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
	}
}
