package kys.study.ProjectEuler;

/**
 * 
 * <pre>
 * 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
 * 12 + 22 + ... + 102 = 385
 * 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
 * 그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
 * </pre>
 * @author kim
 * @date 2016. 5. 23.
 */
public class Problem006 {public Problem006() {
}
	public void problem6(){
		System.out.println(sumOfSquare(100) - squareOfSum(100));
	}
	
	/**
	 * 1 부터 10까지의 합은 1과 10부터 하나씩 더하면 모두 11이 된다. ex) 1+10 = 11, 2+9 = 11, 3+8 = 11 .... <br>
	 * 그렇다면, 요청 정수 100에 1을 더 하고 100을 곱한뒤 2를 나누면 1부터 100까지의 합이 나온다.
	 * @param num 
	 * @return
	 */
	public long sumOfSquare(long num){
		long sum = (num+1)*num/2;
		return sum * sum;
	}
	
	/**
	 * 1부터 10까지의 곱은 10! 팩토리얼을 사용하면 계산 할 수 있다. <br>
	 * 구현은 재귀함수를 이용함.
	 * @param num
	 * @return
	 */
	public long squareOfSum(long num){
		return num == 1 ? num : num*num+squareOfSum(num-1);
	}
}
