import java.lang.*;
import java.util.Scanner;
public class java28{
	public static void main(String args[]){
		double course[]={10,20,30,40,
						 50,60,70,80};
		double sum=0,ave;
		for(int i=0;i<course.length;i++){
		System.out.printf("%.2f" ,course[i]);
		sum=sum+course[i];
		}
		System.out.printf("\n");
		ave=sum/course.length;
		System.out.printf("最近10天的平均價=%.2f",ave);
	}
}
