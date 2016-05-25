package kys.study.ProjectEuler;

import org.junit.Test;

public class ProjectEulerTest {
	
	@Test
	public void Problem1Test(){
		Problem1 Problem1 = new Problem1();
		Problem1.problem1();
	}
	
	@Test
	public void Problem2Test(){
		Problem2 Problem2 = new Problem2();
		Problem2.problem2();
	}
	
	@Test
	public void Problem3Test(){
		Problem3 Problem3 = new Problem3();
		Problem3.problem3(600851475143l);
	}
	
	@Test
	public void Problem4Test(){
		Problem4 Problem4 = new Problem4();
		Problem4.problem4();
	}
	
	@Test
	public void Problem5Test(){
		long preTime = System.currentTimeMillis();
		Problem5 Problem5 = new Problem5();
		Problem5.problem5();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem6Test(){
		long preTime = System.currentTimeMillis();
		Problem6 Problem6 = new Problem6();
		Problem6.problem6();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
}
