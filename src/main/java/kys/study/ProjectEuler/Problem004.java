package kys.study.ProjectEuler;

/**
 * <pre>
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
 * 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 * </pre>
 * @author kim
 *
 */
public class Problem004 {
	
	/**
	 * 대칭수는 11의 mod 값이 0이다. <br>
	 * 해당 값이 0일때 각각 1과6 자리 수, 2와 5 자리 수, 3과 4 자리수를 같은지 비교한다. <br>
	 * 같으면 반복문 종료 <br>
	 */
	public void problem4(){
		boolean breakFlag = false;

		for(int i=999; i>900 && !breakFlag; i--){
			for(int j=999; j>900;j--){
				int data =i*j;
				if(data%11==0){
					int a = data%10;
					int b = (data/10)%10;
					int c = (data/100)%10;
					int d = (data/1000)%10;
					int e = (data/10000)%10;
					int f = data/100000;

					if(a==f && b==e && c==d){
						System.out.println(i);
						System.out.println(j);
						System.out.println(data);
						breakFlag = true;
						break;
					}
				}
			}
		}
	}
}
