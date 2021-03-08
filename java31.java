public class java31{
/*宣告類別變數 score[]*/

	static int score[][]={{1,2,3},
							{4,5,6},
							{7,8,9},
							{10,11,12}};
							
/*主程式 main()*/
public static void main(String args[]){
	System.out.printf("原陣列內容 :\n");
	disp_Arr();
	for(int x=0;x<score.length;x++){
		for(int y=0;y<score[x].length; y++)
			score[x][y]=score[x][y]*2;
	}
	System.out.printf("加倍後陣列內容:\n");
	disp_Arr();
}

	
	/*列印陣列方法 disp_arr()*/
	static void disp_Arr(){
		for(int x=0;x<score.length;x++){
			for(int y=0;y<score[x].length;y++)
				System.out.printf("\t%2d",score[x][y]);
		System.out.printf("\n");
		}
	}
}


