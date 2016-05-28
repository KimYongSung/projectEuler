package kys.study.ProjectEuler;

/**
 * 
 * <pre>
 * 10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다. 
 * 이백만(2,000,000) 이하 소수의 합은 얼마입니까?
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
public class Problem010 {
	
	public void problem(){
		long sum = 0;
		for(long i = 2;i<2000000;i++){
			sum += isPrimeNumber(i);
		}
		System.out.println(sum);
	}
	
	/**
	 * 유클리드의 체를 이용한 구현
	 */
	public void problem_1(){
		int limit = 2000000;
		long sum = 0;
		/*
		 *최대값+1의 배열을 생성 
		 */
		boolean[] checkBox = new boolean[limit+1];
		
		/*
		 *i부터 최대값까지  false이면 해당 배수를 구하여 true체크
		 */
		for(int i =2;i<limit;i++){
			if(checkBox[i] == false){
				for(int j=2;i*j <limit;j++){
					checkBox[i*j] = true;
				}
			}
		}
		
		/*
		 * 최종적으로 false인 소수만 값을 더한다.
		 */
		for(int i = 2; i<checkBox.length;i++){
			if(checkBox[i] == false){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
	/**
	 * <pre>
	 * 2를 제외한 모든 소수는 홀수이므로, 어떤 수 n이 짝수이면 소수가 아니다.
	 * 만약 n이 합성수라면 N = a*b 형태가 되므로  ( a > 1 && b > 1), a와 b 둘 중 하나는 sqrt(N) 보다 작거나 같음을 알 수 있다.
	 * 그러므로 N을 2부터 sqrt(N)까지 나누어지지 않으면 N은 소수가 된다.
	 * </pre>
	 * @param number
	 * @return	0이면 소수가 아니다.
	 */
	public long isPrimeNumber(long number){
		double sqrt = Math.sqrt(number);
		for(long i=2;i<=sqrt;i++){
			if(number%i==0){
				return 0;
			}
		}
		return number;
	}
}
