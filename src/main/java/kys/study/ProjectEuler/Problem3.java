package kys.study.ProjectEuler;

/**
 * <pre>
 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
 * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 * </pre>
 * @author kim
 *
 */
public class Problem3 {
	
	public void problem3(long num){
		checkInsu(num);
		System.out.println(checkInsu(num));
	}

	public Long checkInsu(long num){
		long insu = 0;
		boolean insuFlag = false;

		for(long i = 2; i<num ;i++){
			if(num%i==0){
				insu = i;
				insuFlag = true;
				break;
			}
		}

		long nextNum = 0;

		if(insuFlag) nextNum = num/insu;
		else insu = num;

		return nextNum == 0 ? insu : checkInsu(nextNum);
	}
}
