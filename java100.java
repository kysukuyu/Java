class Car{
    private int maxSpeed;
	private String color;
	public void setMaxSpeed(int maxSpeed){
	   this.maxSpeed = maxSpeed;
	}
	public  void  setColor(String color){
	   this.color=color;
	}
	public void printCarInfo(){
	   System.out.println("車子最高時速:"+maxSpeed+"\n車子外觀顏色:"+color);
	}
}
class carbrand extends Car{
	public void carbrandShow(){
		Engine carbrandEngine = new Engine();
		carbrandEngine.starting();
		carbrandEngine.running();
		carbrandEngine.stopping();
	}
}
class Engine{
    public void starting(){
        System.out.println("引擎啟動");
    }
    public void running(){
        System.out.println("引擎運轉");
    }
    public void stopping(){
        System.out.println("引擎停止");
    }
}
public class java100{
    public static void main(String[] args){
       carbrand carbrand = new carbrand();
       carbrand.setMaxSpeed(200);
       carbrand.setColor("白色");
       carbrand.printCarInfo();
       carbrand.carbrandShow();
    }
}
	