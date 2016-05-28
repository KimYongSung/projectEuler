package kys.study.ProjectEuler;

/**
 * 
 * <pre>
 * 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
 * 이 때 10,001번째의 소수를 구하세요.
 * </pre>
 * @author kim
 * @date 2016. 5. 27.
 */
public class Problem007 {
	
	
	/**
	 * 10001번째 소수까지 체크한다.
	 */
	public void problem7(){
		int count = 0;
		for(long i=2; count < 10001 ; i++){
			if(isPrimeNumber(i)){
				count++;
				System.out.println(i);
			}
		}
	}
	
	/**
	 * <pre>
	 * 2를 제외한 모든 소수는 홀수이므로, 어떤 수 n이 짝수이면 소수가 아니다.
	 * 만약 n이 합성수라면 N = a*b 형태가 되므로  ( a > 1 && b > 1), a와 b 둘 중 하나는 sqrt(N) 보다 작거나 같음을 알 수 있다.
	 * 그러므로 N을 2부터 sqrt(N)까지 나누어지지 않으면 N은 소수가 된다.
	 * </pre>
	 * @param number
	 * @return
	 */
	public boolean isPrimeNumber(long number){
		double sqrt = Math.sqrt(number);
		for(long i=2;i<=sqrt;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

}
