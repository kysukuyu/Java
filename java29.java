public class java29{
	public static void main(String[] args){
		int hourly_salary = 100;
		int monthly_fee = 2000;
		int annual_salary, annual_fee, annual_savings;
		
		annual_salary=hourly_salary*8*300;
		annual_fee=monthly_fee*12;
		annual_savings = annual_salary - annual_fee;
		System.out.println("一年可以儲存:" + annual_savings);
	}
}

		