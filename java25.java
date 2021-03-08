import java.util.*;
public class java25{
	static String maxName="",minName="";
	static int maxNum=0,minNum=99;
	
	public static void main(String args[]){
		Scanner keyin=new Scanner(System.in);
		String name;
		int number;
		System.out.printf("===歡迎光臨大吃小擲骰子遊戲===\n");
		System.out.printf("輸入姓名並擲骰子 =>");
		
		name=keyin.nextLine();
		while(name.length()!=0){
			game(name);
			System.out.printf("領先者 %s 先生 %d 點\n", maxName, maxNum);
			System.out.printf("輸入姓名並擲骰子 =>");
			name=keyin.nextLine();
		}
		System.out.printf("贏家 %s 先生擲出 %d\n", maxName, maxNum);
		System.out.printf("輸家 %s 先生擲出 %d\n", minName, minNum);
	}
	
	static void game(String name){
			Random random=new Random();
			int ran,sum=0;
			System.out.printf("\t您擲出 =>");
			for (int k=1;k<=5;k++){
					ran=1+random.nextInt(6);
					System.out.printf("%d ",ran);
					sum = sum+ ran;
			}
			System.out.printf("合計 = %d\n",sum);
			if(sum>maxNum){
					maxName=name;
					maxNum=sum;
			}
			if(sum<=minNum){
					minName=name;
					minNum=sum;
			}
	}
}


					
			
			