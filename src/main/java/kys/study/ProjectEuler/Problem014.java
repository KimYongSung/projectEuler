package kys.study.ProjectEuler;

public class Problem014 {

	public void problem(){
		int count = 0;
		long maxNum = 0l;
		for(long num = 1 ;num <= 1000000;num++){
			int hailstoneSeq = getHailstoneSeq(num);
			if(hailstoneSeq >= count){
				count = hailstoneSeq;
				maxNum = num;
			}
		}
		System.out.println(maxNum + " : " + count);
	}

	public int getHailstoneSeq(long num){

		int count = 0;

		while(num>1){
			num = (num % 2) ==0 ? num/2 : num*3+1;
			count++;
		}

		return count;
	}
}
