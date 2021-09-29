package testNG_Annotations;

import org.testng.annotations.Test;

public class GroupExercise1 {
	
	@Test(groups={"smoke"}, priority=1)
	public void Test1(){
		System.out.println("executing test1 of smoke test");
	}
	@Test(groups={"smoke"},priority=2)
	public void Test2(){
		System.out.println("executing test2 of smoke test");
	}
	
	@Test(groups={"regression"})
	public void Test3(){
		System.out.println("executing test1 of regression test");
	}
}
