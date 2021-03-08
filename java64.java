public class java64{
	public static void main(String[] args){
		 int[] score = {10,20,30,40,50};
		 int passingScore = 50;
		 for ( int i = 0; i<score.length; i++){
			if (score[i] < passingScore)
				System.out.printf("score[%d] = %d\n", i, score[i]);
		}
	}
}
