import java.util.*;
public class java26{
	public static void main(String args[]){
		Scanner keyin=new Scanner(System.in);
		int total,num;
		System.out.printf("請輸入一個整數 =>");
		num=keyin.nextInt();
		total=level(num);
		System.out.printf("1*2*3*...%d=%d\n",num,total);
	}
	
	static int level(int k){
		int sum;
		if(k <= 2)
			return 1;
		else {
			sum=k*level(k-2);
			System.out.printf("%d*level(%d-1)=%d\n",k,k,sum);
			return sum;
		}
	}
}


			
			