import java.util.*;
public class java19{
	public static void main(String args[]){
		int count, limit =100,sum=0;
		count=limit;
		do{
			sum=sum+count;
			count=count-1;
		}while(count>0);
		System.out.printf("%d + ...+1=%d\n",limit,sum);
	}
}

