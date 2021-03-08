import java.lang.Math;
public class java4{
	public static void main(String args[]) {
			int value,flag;
			int[]num=new int[6];
			int i=0;
			while(i<6){
				flag=0;
				value=1+(int)(Math.random()*50);
				for(int j=0;j<i;j++){
					if(value==num[j]){
						 flag=1;break;
					}
				}
				if(flag==0){
					num[i]=value;
					i=i+1;
				}
			}
			System.out.printf("幸運號碼是:");
			for(i=0;i<6;i++)
				System.out.printf("%d ",num[i]);
			System.out.printf("\n");
	}
}

					