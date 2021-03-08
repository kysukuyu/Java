import java.util.*;
public class java96{
	public static void main(String[] args) {
	
		Scanner keyin = new Scanner(System.in);
		int height;
		int wide;
		
		System.out.printf("請輸入矩形高度 =>");
		height=keyin.nextInt();
		System.out.printf("請輸入矩形寬度 =>");
		wide=keyin.nextInt();
		
		for(int i=1;i<=height;i++){
			System.out.printf("   ");
			for(int j=1;j<=wide;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
