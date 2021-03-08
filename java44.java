public class java44{
	public static void main(String args[]){
		int a[]={10,20,30,40,50,60,70,80};
		int temp;
		
		System.out.printf("陣列內容 :");
		for(int j=0;j<a.length;j++)
			System.out.printf("%d   ",a[j]);
		System.out.printf("\n");
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1; j<a.length;j++){
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
