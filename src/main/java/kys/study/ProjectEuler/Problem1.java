package kys.study.ProjectEuler;

/**
 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 * @author kim
 */
public class Problem1 {
	public void problem1(){
		int number = 1000;
		int total = 0;
		for(int i=1; i< number;i++){
			if(i%3==0||i%5==0) total += i;
		}
		System.out.println(total);
	}
}
