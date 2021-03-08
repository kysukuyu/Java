public class java2{
	public static void main(String[] args){
		int[][] degree = {
				{32,25,27,23,21,30},
				{26,28,31,32,23,25},
				{22,25,26,28,31,30}
		};
		double sum, average;
		String str = "";
		for (int i=0; i< degree.length; i++){
			sum = 0;
			for(int de:degree[i])
				sum += de;
		average = sum/ degree[i].length;
		switch(i){
			case 0:
				str = "最高溫平均:";
				break;
			case 1:
				str = "平均溫平均:";
				break;
			case 2:
				str = "最低溫平均:";
				break;
		}
		System.out.printf("%s %5.2f\n",str, average);
	}
  }
}

				
			
				