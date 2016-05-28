package kys.study.ProjectEuler;

/**
 * 
 * <pre>
 *	세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
	예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.
	a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
public class Problem009 {
	
	/**
	 * <pre>
	 * 피타코라스의 세수 정리 사용
	 * a = 2mn, b= m^2 - n^2, c=m^2+n^2
	 * </pre>
	 */
	public void problem9(){
		for(int m=2;m<1000;m++){
			for(int n=1;n<m;n++){
				int x = 2*m*n;
				int y = m*m - n*n;
				int z = m*m + n*n;
				
				if(x+y+z == 1000){
					System.out.println(x+","+y+","+z);
					System.out.println(x*y*z);
				}
			}
		}
	}
}
