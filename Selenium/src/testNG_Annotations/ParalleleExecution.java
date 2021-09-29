package testNG_Annotations;

import org.testng.annotations.Test;

public class ParalleleExecution {

	@Test
	public void Test1(){
		System.out.println("this is first test case");
	}
	
	@Test
	public void Test2(){
		System.out.println("this is second test case");
	}
	
	@Test
	public void Test3(){
		System.out.println("this is third test case");
	}
}
