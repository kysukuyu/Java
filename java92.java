import java.util.*;
public class java92{
	public static void main(String args[]) {
		Scanner keyin=new Scanner(System.in);
		int max=0,min=999;
		int value;
		for(int i=0;i<6;i++){
			System.out.printf("請輸入第 %d 整數 =>",i+1);
			value=keyin.nextInt();
			max=Max(max,value);
			min=Min(min,value);
		}
		System.out.printf("最大數值是 %d\n",max);
		System.out.printf("最小數值是 %d\n",min);
	}
	
	static int Max(int a,int b){
		if(a>b)
		return a;
		else
	return b;
	}
	
	static int Min(int a,int b){
		if(a<b)
			return a;
		else
			return b;
	}
}
