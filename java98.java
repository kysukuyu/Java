class demo{
	synchronized static void printDemo(int n){
		for(int i=1;i<=5;i++){
			System.out.println("輸入:"+(i*n));
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class JobThread1 extends Thread{
	public void run(){
		demo.printDemo(10);
    }
}
class JobThread2 extends Thread{
    public void run(){
        demo.printDemo(100);
    }
}
class JobThread3 extends Thread{
    public void run(){
        demo.printDemo(1000);
    }
}
public class java98{
	public static void main(String[] args) {
		 JobThread1 t1=new JobThread1();
		 JobThread2 t2=new JobThread2();
		 JobThread3 t3=new JobThread3();
		 t1.start();
		 t2.start();
		 t3.start();
    }
}
