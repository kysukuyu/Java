class HorseRacing extends Thread{
	HorseRacing(String name){
		super(name);
	}
	public void run(){
		for (int i =1; i<=10; i++){
			try{
				sleep(200);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(getName()+"正在跑第" + i + "圈...");
		}
	}
}

public class java74{
	public static void main(String[] args){
		HorseRacing t1 = new HorseRacing("Horse1");
		HorseRacing t2 = new HorseRacing("Horse2");
		t1.start();
		t2.start();
	}
}
