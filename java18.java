import java.util.*;
public class java18{
	public static void main(String args[]){
		Scanner keyin = new Scanner(System.in);
		long sum=0,pro=1,value,k;
		System.out.printf("請輸入一個整數 =>");
		value = keyin.nextInt();
		k=1;
		while(k <= value){
			sum=sum+k;
			pro = pro *k;
			k= k+1;
		}
		System.out.printf("1+2+3+4+5+..+%d=%d\n",value,sum);
		System.out.printf("1*2*3...*%d=%d\n",value,pro);
	}
}