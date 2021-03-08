class bank {
	int account;
	int balance;
	
	void saveMoney(int save){
		balance += save;
	}
	void printInfo(){
			System.out.printf("帳戶: %d, 餘額 :%d\n", account, balance);
	}
}

public class java68{
	public static void main(String[] args){
		bank A = new bank();
		A.account = 1000;
		A.balance = 0;	
		
		A.printInfo();
		A.saveMoney(1000);
		A.printInfo();
	}
}
