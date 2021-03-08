public class java65{
	public static void main(String[] args){
		int[] score = {10,20,30,40,50};
		int tmp;
		for ( int i = 0; i < (score.length - 1); i++) {
			for (int j = 0; j< (score.length - 1); j++){
				if (score[j] < score[j+1]){
					tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
			System.out.printf("列印第％ｄ次迴圈排序結果\n", (i +1));
			for (int sc:score)
				System.out.printf("%d", sc);
			System.out.println("");
		}
	}
}

				
		