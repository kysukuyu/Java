import java.io.*;
public class java89{
	public static void main(String args[])throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int value1,value2,sum;
		System.out.printf("請輸入一個整數 =>");
		value1 = Integer.parseInt(keyin.readLine());
		System.out.printf("請輸入二個整數 =>");
		value2 = Integer.parseInt(keyin.readLine());
		sum = value1 + value2;
		System.out.printf("%d + %d = %d\n",value1, value2, sum);
   }
}		
	
