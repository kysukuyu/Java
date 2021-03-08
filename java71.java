public class java71{
   public static void main(String[] args){
       double rate=0.02;
	   double capital=10000;
	   double capitalInfo;
	   for(int i=1; i<=10;i++){
	      capitalInfo=capital*Math.pow((1.0+rate), i);
		  System.out.printf("第%2d 年後本金和是%10.2f\n", i , capitalInfo);
	   }
   }
}
