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
	
	@Test
	public void Problem14(){
		long preTime = System.currentTimeMillis();
		Problem014 Problem = new Problem014();
		Problem.problem();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
}
