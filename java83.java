import java.lang.Math;
public class java83{
		public static void main(String args[]) {
		int a[]={45,10,50,30,80,66};
		int temp;
		System.out.printf("陣列內容:");
		for(int j=0;j<a.length;j++)
			System.out.printf("%d ",a[j]);
		System.out.printf("\n");
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.printf("第 %d 回合:",i);
			for(int j=0;j<a.length;j++)
				System.out.printf("%d ",a[j]);
			System.out.printf("\n");
		}
	}
}

		