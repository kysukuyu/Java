import java.io.*;
public class java97{
	public static void main(String args[])throws IOException{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int value;
		String name;
		System.out.printf("請輸入 =>");
		name = keyin.readLine();
		System.out.printf("捐款人 =>");
		value = Integer.parseInt(keyin.readLine());
		System.out.printf("列印收據如下:\n");
		System.out.printf("****** ");
		System.out.printf("\n");
		System.out.printf(" 感謝 %s 先生/小姐大德贊助\n",name);
		System.out.printf(" 捐款 %d 元整 \n",value);
}
}		