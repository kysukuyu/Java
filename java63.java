public class java63{
	public static void main(String[] args){
		int[] score = {10,20,30,40,50};
		int max, min;
		max = min = score[0];
		for (int sc:score) {
			if (sc > max)
				max =sc;
			if (sc < min)
				min = sc;
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}

		