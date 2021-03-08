class NotEnoughException extends Exception {
	private int shortAmount;
	public NotEnoughException(int shortAmount){
	    this.shortAmount = shortAmount;
	}
	public double getShortAmount(){
	    return  shortAmount;
	}
}
class Bank{
    private int balance;
	public void deposit(int cashin){
	    balance += cashin;
	}
	public void withdraw(int cashout) throws NotEnoughException{
        if(cashout <= balance){
          balance -= cashout;
        }
        else{
            int shortA=cashout-balance;
            throw new NotEnoughException(shortA);
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class java3{
    public static void main(String [] args){
        Bank obj = new Bank();
		System.out.println("存款2000元...");
		obj.deposit(2000);
		try{
		   System.out.println("提款1500元...");
		   obj.withdraw(1500);
		   System.out.println("提款800元...");
		   obj.withdraw(800);
		}
		catch(NotEnoughException e){
		   System.out.println("存款金額不足:"+e.getShortAmount());
		   e.printStackTrace();
		}
	}
}

		   