import java.util.*;
public class java24{
	public static void main(String args[]){
	int maxNum, num1, num2, num3, num4;
	Scanner keyin = new Scanner(System.in);
	System.out.printf("請 小東 擲骰子 (按 Enter建)=>");
	keyin.nextLine();
	num1 = game();
	System.out.printf("小東擲的是: %d\n", num1);
	
	System.out.printf("請 小南  擲骰子 (按 Enter建)=>");
	keyin.nextLine();
	num2=game();
	System.out.printf("小南擲的是: %d\n", num2);
	
	System.out.printf("請 小西  擲骰子 (按 Enter建)=>");
	keyin.nextLine();
	num3=game();
	System.out.printf("小西擲的是: %d\n", num3);
		
	System.out.printf("請 小北  擲骰子 (按 Enter建)=>");
	keyin.nextLine();
	num4=game();
	System.out.printf("小北:擲的是: %d\n", num4);
	
	maxNum = max(num1, max(num2, max(num3, num4)));
	System.out.printf("擲出最大的是 =%d\n", maxNum);
}

static int game(){
	Random random = new Random();
	int k, sum=0,ran;
	System.out.printf("\t 擲出 =>");
	for(k=1;k<=3;k++){
		ran=1+random.nextInt(6);
		System.out.printf("%d   ",ran);
		sum=sum+ran;
	}
	System.out.printf("\n");
	return sum;
}
static int max(int a, int b){
	if(a>b)
		return a;
	else
		return b;
	}
}




	
	
	
	
	
	
	
	