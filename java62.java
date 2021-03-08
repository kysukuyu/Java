public class java62{
	public static void main(String[] args){
		double average;
		double total = 0;
		double[] degree;
		degree = new double[7];
		
		degree[0] = 25;
		degree[1] = 30;
		degree[2] = 25;
		degree[3] = 30;
		degree[4] = 25;
		degree[5] = 30;
		degree[6] = 30;
		for( int i = 0; i <7 ; i++)
			total += degree[i];
		average = total / 7;
		System.out.printf("一周平均溫度: %5.2f", average);
	}
}
