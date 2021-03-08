class bank {
	private String name;
	private int balance;
	private int rate = 30;
	private double charge = 0.01;
	
	public bank(String name){
		this.name = name;
		this.balance = 0;
	}
	public void savemoney(int money){
		this.balance += money;
	}
	public void withdrawmoney(int money){
		this.balance -= money;
	}
	public double usa(int usa){
		if (this.balance >= 100)
			this.charge = 0.002;
		return cal_rate(usa);
	}
	private double cal_rate(int usa){
		double result;
		result = usa * rate * (1-charge);
		return result;
	}
	public void balance(){
		System.out.println(name + " 目前存款餘額" + balance);
	}
}



public class java42{
	public static void main(String[] args){
		bank A = new bank("");
		int us = 200;
		A.savemoney(100);
		System.out.println(us + "美金" + A.usa(us) + "台幣");
		
		
		A.savemoney(50);
		System.out.println(us + "美金" + A.usa(us) + "台幣");
	}
}
