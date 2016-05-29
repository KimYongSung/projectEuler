package kys.study.ProjectEuler;

import org.junit.Test;

public class ProjectEulerTest {
	
	@Test
	public void Problem1Test(){
		Problem001 Problem1 = new Problem001();
		Problem1.problem1();
	}
	
	@Test
	public void Problem2Test(){
		Problem002 Problem2 = new Problem002();
		Problem2.problem2();
	}
	
	@Test
	public void Problem3Test(){
		Problem003 Problem3 = new Problem003();
		Problem3.problem3(600851475143l);
	}
	
	@Test
	public void Problem4Test(){
		Problem004 Problem4 = new Problem004();
		Problem4.problem4();
	}
	
	@Test
	public void Problem5Test(){
		long preTime = System.currentTimeMillis();
		Problem005 Problem5 = new Problem005();
		Problem5.problem5();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem6Test(){
		long preTime = System.currentTimeMillis();
		Problem006 Problem6 = new Problem006();
		Problem6.problem6();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem7Test(){
		long preTime = System.currentTimeMillis();
		Problem007 Problem7 = new Problem007();
		Problem7.problem7();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem8Test(){
		long preTime = System.currentTimeMillis();
		Problem008 Problem8 = new Problem008();
		Problem8.problem8();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem9Test(){
		long preTime = System.currentTimeMillis();
		Problem009 Problem9 = new Problem009();
		Problem9.problem9();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem10Test(){
		long preTime = System.currentTimeMillis();
		Problem010 Problem = new Problem010();
		Problem.problem();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem10_1Test(){
		long preTime = System.currentTimeMillis();
		Problem010 Problem = new Problem010();
		Problem.problem_1();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
	
	@Test
	public void Problem11Test(){
		long preTime = System.currentTimeMillis();
		Problem011 Problem = new Problem011();
		Problem.problem();
		System.out.println("Time : " + (System.currentTimeMillis() - preTime));
	}
}
