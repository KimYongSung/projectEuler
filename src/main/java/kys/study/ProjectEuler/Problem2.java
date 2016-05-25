package kys.study.ProjectEuler;

/**
 * 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 * @author kim
 */
public class Problem2 {
	
	/**
	 * 재귀함수 사용하여 파보나치 구현
	 */
	public void problem2(){
		System.out.println(pibonachiF(1,2,0));
	}

	/**
	 * 최초 시작하는 메소드
	 * @param first		첫번째 인자값
	 * @param second	두번째 인자값
	 * @param oddTotal	짝수의 총합
	 * @return 
	 */
	private int pibonachiF(int first, int second, int oddTotal){
		if(first%2 == 0) oddTotal += first;
		if(second%2 == 0) oddTotal += second;
		return pibonachi(second, first+second ,oddTotal);
	}

	/**
	 * 파보나치 수열 재귀함수 <br>
	 * 최초 시작하는 메소드에서 첫번째와 두번째 인자값이 짝수 유무 확인하여 합산됨. <br>
	 * 이후 두번째 인자값만 짝수이면 합산. 4백만보다 크거나 같을때까지 계속 콜됨.
	 * @param first		첫번째 인자값
	 * @param second	두번째 인자값
	 * @param oddTotal	짝수의 총합
	 * @return
	 */
	private int pibonachi(int first, int second, int oddTotal){
		if(second%2 == 0) oddTotal += second;
		return second >= 4000000 ? oddTotal : pibonachi(second, first+second ,oddTotal);
	}
}
