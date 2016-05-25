package kys.study.ProjectEuler;

/**
 * <pre>
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 * </pre>
 * @author kim
 * @date 2016. 5. 23.
 */
public class Problem5 {
	
	public void problem5(){
		problem5_1();
		problem5_2();
	}

	/**
	 * 최초 구현해본 소스.
	 * 반복문을 돌면서 1~20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수를 구한다.
	 * 소요시간은 2초 정도.
	 */
	private void problem5_1(){
		boolean breakFlag = false;
		for(int i=20; !breakFlag;i++){
			for(int j=1;j<=20;j++){
				if(i%j==0){
					breakFlag = true;
				}else{
					breakFlag = false;
					break;
				}
			}
			if(breakFlag) System.out.println(i);;
		}
	}
	
	/**
	 * 유클리드 호제법으로 최대 공약수를 구한 값으로 최소공배수를 구한다.
	 */
	private void problem5_2(){
		long val = 20l;
		for(int i =19; i>=1; i--){
			val = lcm(val,i);
			System.out.println(val);
		}
	}

	/**
	 * 유클리드 호제법
	 * @param a
	 * @param b
	 * @return
	 */
	private long gcd(long a, long b){
		return a%b == 0 ? b: gcd(b, a%b);
	}
	
	/**
	 * 최소공배수 구하기
	 * @param a
	 * @param b
	 * @return
	 */
	private long lcm(long a, long b){
		return a * b / gcd(a, b);
	}
}
