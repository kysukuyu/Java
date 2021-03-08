import java.util.*;
public class java16{
	public static void main(String args[]){
		Scanner keyin=new Scanner(System.in);
			String key;
			System.out.printf("歡迎使用醫療診斷系統, 請依序回答問題 \n");
			System.out.printf("=======================================");
			System.out.printf("請問您是否有感冒(y/n)=>");
			key=keyin.nextLine();
			if(key.equals("y")){
				System.out.printf("請問您最近是否咳嗽(y/n)=>");
				key=keyin.nextLine();
				if(key.equals("y")){
					System.out.printf("請問您是否感覺疲倦 (y/n)=>");
					key=keyin.nextLine();
					if(key.equals("y")){
						System.out.printf("先生/小姐您已經感冒了  !!!\n");
					}
					else{
						System.out.printf("請問您是否血壓升高 (y/n)=>");
						key=keyin.nextLine();
						if(key.equals("y")){
							System.out.printf("請問您最近是否口乾 (y/n)=>");
							key=keyin.nextLine();
							if(key.equals("y"))
								System.out.printf("請問您最近是否嗜睡 (y/n)=>");
								key=keyin.nextLine();
								if(key.equals("y"))
									System.out.printf("先生/小姐您可能得到頭痛!!!\n");
								else
									System.out.printf("需要由其他系統進一步檢查 !!!\n");
					}
				}
			}
			else
				System.out.printf("有發燒無咳嗽,請到別科門診 !!!\n");
		}
	}
}
									
						
				