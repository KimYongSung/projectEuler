package kys.study.ProjectEuler;

/**
 * 
 * <pre>
 * 	아래와 같은 20×20 격자가 있습니다.
	08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
	49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
	81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
	52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
	22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
	24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
	32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
	67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
	24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
	21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
	78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
	16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
	86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
	19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
	04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
	88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
	04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
	20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
	20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
	01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
	위에서 대각선 방향으로 연속된 붉은 숫자 네 개의 곱은 26 × 63 × 78 × 14 = 1788696 입니다.
	
	그러면 수평, 수직, 또는 대각선 방향으로 연속된 숫자 네 개의 곱 중 최대값은 얼마입니까?
 * </pre>
 * @author kim
 * @date 2016. 5. 29.
 */
public class Problem011 {

	private final int[][] ARR =  {
			{8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 04, 5, 7, 78, 52, 12, 50, 77, 91, 8},
			{49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
			{81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
			{52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
			{22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
			{24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
			{32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
			{67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
			{24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
			{21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
			{78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
			{16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
			{86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
			{19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
			{4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
			{88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
			{4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
			{20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
			{20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
			{1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48},
	};

	/**
	 * 정사각형 2차원 배열의 면의 길이 
	 */
	private final int ARR_LENGTH = 20;
	/**
	 * 연속적으로 곱하는 숫자의 갯수
	 */
	private final int MAX_MULTIPLE_COUNT = 4;
	
	/**
	 * 최대 체크해야할 위치
	 */
	private final int LIMIT = ARR_LENGTH - MAX_MULTIPLE_COUNT+1;

	public void problem(){
		long max = 0;
		for(int y = 1; y <= ARR_LENGTH; y++){
			for(int x = 1; x <= ARR_LENGTH; x++){
				long value = multipleMaxValueCheck(x, y);
				//System.out.println(value);
				max = maxValue(max, value);
			}
		}
		System.out.println(max);
	}

	/**
	 * 2차원 배열 중 특정 위치에 존재하는 모든 경우의 연속적인 숫자들의 곱을 구하고, 그 중 최대값을 리턴한다.
	 * @param x	2차원 배열의 x 좌표
	 * @param y 2차원 배열의 y 좌표
	 * @return
	 */
	public long multipleMaxValueCheck(int x, int y){
		long max = 0;
		
		long perpendicular = multiplePerpendicular(x, y);
		long horizontality = multipleHorizontality(x, y);
		long upperRightDiagonal = multipleUpperRightDiagonal(x, y);
		long bottomRightDiagonal = multipleBottomRightDiagonal(x, y);
		long upperLeftDiagonal = multipleUpperLeftDiagonal(x, y);
		long bottomLeftDiagonal = multipleBottomLeftDiagonal(x, y);

		max = maxValue(max, perpendicular);
		max = maxValue(max, horizontality);
		max = maxValue(max, upperRightDiagonal);
		max = maxValue(max, bottomRightDiagonal);
		max = maxValue(max, upperLeftDiagonal);
		max = maxValue(max, bottomLeftDiagonal);
		
		return max;
	}
	
	/**
	 * 두 정수 중 큰 값을 가진 정수를 리턴
	 * @param value1
	 * @param value2
	 * @return
	 */
	public long maxValue(long value1, long value2){
		return value1 > value2 ? value1 : value2;
	}

	/**
	 * 수직으로 연속적인 수 4개를 곱한다.
	 * @param x	2차원 배열의 x 좌표
	 * @param y 2차원 배열의 y 좌표
	 * @return
	 */
	 public long multiplePerpendicular(int x, int y){
		 long total = 1;

		 if(y > LIMIT) return 0;

		 for(int check = y-1, loopingCount = 0;loopingCount<MAX_MULTIPLE_COUNT; check++, loopingCount++){

			 if(ARR[x-1][check] == 0) {
				 total = 0;
				 break;
			 }

			 total *= ARR[x-1][check];
		 }


		 return total;
	 }

	 /**
	  * 수평으로 연속적인 수 4개를 곱한다.
	  * @param x 2차원 배열의 x 좌표
	  * @param y 2차원 배열의 y 좌표
	  * @return
	  */
	 public long multipleHorizontality (int x, int y){
		 long total = 1;

		 if(x > LIMIT) return 0;

		 for(int check = x-1, loopingCount = 0;loopingCount<MAX_MULTIPLE_COUNT; check++, loopingCount++){

			 if(ARR[check][y-1] == 0) {
				 total = 0;
				 break;
			 }

			 total *= ARR[check][y-1];
		 }

		 return total;
	 }

	 /**
	  * 우측 상단 대각선으로 연속적인 수 4개를 곱한다.
	  * @param x 2차원 배열의 x 좌표
	  * @param y 2차원 배열의 y 좌표
	  * @return
	  */
	 public long multipleUpperRightDiagonal(int x, int y){

		 long total = 1;
		 if(x > LIMIT || y < MAX_MULTIPLE_COUNT) return 0;

		 for(int i = x-1,j = y-1, loopingCount = 0; loopingCount < MAX_MULTIPLE_COUNT ; i++, j--, loopingCount++){
			 if(ARR[i][j] == 0){
				 total = 0;
				 break;
			 }

			 total *= ARR[i][j];
		 }

		 return total;
	 }

	 /**
	  * 우측 하단 대각선으로 연속적인 수 4개를 곱한다.
	  * @param x 2차원 배열의 x 좌표
	  * @param y 2차원 배열의 y 좌표
	  * @return
	  */
	 public long multipleBottomRightDiagonal(int x, int y){
		 long total = 1;
		 if(x > LIMIT || y > LIMIT) return 0;

		 for(int i = x-1,j = y-1, loopingCount = 0; loopingCount < MAX_MULTIPLE_COUNT ; i++, j++, loopingCount++){
			 if(ARR[i][j] == 0){
				 total = 0;
				 break;
			 }

			 total *= ARR[i][j];
		 }

		 return total;
	 }

	 /**
	  * 좌측 상단 대각선으로 연속적인 수 4개를 곱한다.
	  * @param x 2차원 배열의 x 좌표
	  * @param y 2차원 배열의 y 좌표
	  * @return
	  */
	 public long multipleUpperLeftDiagonal(int x, int y){
		 long total = 1;
		 if(x < MAX_MULTIPLE_COUNT || y < MAX_MULTIPLE_COUNT) return 0;

		 for(int i = x-1,j = y-1, loopingCount = 0; loopingCount < MAX_MULTIPLE_COUNT ; i--, j--, loopingCount++){
			 if(ARR[i][j] == 0){
				 total = 0;
				 break;
			 }

			 total *= ARR[i][j];
		 }

		 return total;
	 }

	 /**
	  * 좌측 하단 대각선으로 연속적인 수 4개를 곱한다.
	  * @param x 2차원 배열의 x 좌표
	  * @param y 2차원 배열의 y 좌표
	  * @return
	  */
	 public long multipleBottomLeftDiagonal(int x, int y){
		 long total = 1;
		 if(x < MAX_MULTIPLE_COUNT || y > LIMIT) return 0;

		 for(int i = x-1,j = y-1, loopingCount = 0; loopingCount < MAX_MULTIPLE_COUNT ; i--,j++, loopingCount++){
			 if(ARR[i][j] == 0){
				 total = 0;
				 break;
			 }

			 total *= ARR[i][j];
		 }

		 return total;
	 }


}
