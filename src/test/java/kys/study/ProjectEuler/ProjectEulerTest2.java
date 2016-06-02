package kys.study.ProjectEuler;

import org.junit.Test;

public class ProjectEulerTest2 {
	@Test
	public void Problem12Test2(){
		long preTime = System.currentTimeMillis();
		Problem013 Problem = new Problem013();
		Problem.problem();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
}
