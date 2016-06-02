package kys.study.ProjectEuler;

public class Problem012 {
	public void problem(){
		for(long num = 0;;num++ ){
			long value = sum(num);
			if(checkInsu(value)){
				System.out.println(value);
				break;
			}
		}
		
	}
	
	/**
	 * <pre>
	 * 특정 정수 n을 2부터 sqrt 만큼의 mod값을 구해서 1과 정수 n을 제외한 약수의 절반을 구한다.
	 * 해당 약수의 절반을 곱한뒤 약수인 1과 n을 합하면 전체 약수의 갯수를 알 수 있다.
	 * </pre>
	 * @param number
	 * @return
	 */
	public boolean checkInsu(long number){
		int count = 0;
		double sqrt = Math.sqrt(number);
		for(long i=2;i<=sqrt;i++){
			if(number%i==0) count++;
		}
		//System.out.println(count);
		return count * 2 +2 >= 500 ? true : false;
	}
	
	/**
	 * 1부터 n까지의 삼각수 구하기
	 * @param num
	 * @return
	 */
	public long sum(long num){
		return(num+1)*num/2;
	}
	
	
}
