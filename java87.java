import java.io.*;
public class java87{
	public static void main(String args[])throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		final double price=25.2;
		double number, total;
		System.out.printf("目前油價每公升 %.2f 元\n", price);
		System.out.printf("請輸入加油數量 =>");
		number = Double.parseDouble(keyin.readLine());
		total = number * price;
		System.out.printf("應收金額 = %.2f元\n", total);
   }
}