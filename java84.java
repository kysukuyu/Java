import java.util.Scanner;
public class java84{
   public static void main(String[] args){
      String str=new String();
	  String pattern="\\d";
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("請輸入任意字串:");
	  str=scanner.next();
	  if(str.matches(pattern))
	     System.out.printf("%s :是0-9數字\n", str);
	  else
	     System.out.printf("%s: 不是0-9數字\n", str);
   }
}
