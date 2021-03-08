abstract class MyMath{
    abstract int add(int n1, int n2);
	abstract int mul(int n1, int n2);
	void output(){
	    System.out.println("計算機");
	}
}
class MyTest extends MyMath{
    public int add(int num1, int num2){
	    return num1+num2;
    }
    public int mul(int num1, int num2){
	    return num1*num2;
	}
}
public class java95{
   public static void main(String[] args){
         MyMath obj=new MyTest();
		 obj.output();
		 System.out.println("加法結果:"+obj.add(2,10));
		 System.out.println("乘法結果:"+obj.mul(2,10));
   }
}

		 
		 
	