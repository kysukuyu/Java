import java.util.Random;
public class java67{
    public static void main(String[] args){
	    Random ran=new Random();
		for(int i=0;i<10;i++){
		   System.out.printf("%d \t",ran.nextInt(100));
		   System.out.printf("%d \t",ran.nextInt());
		}
	}
}