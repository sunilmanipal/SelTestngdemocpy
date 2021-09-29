package testNG_Annotations;

import org.testng.annotations.Test;

public class PriorityzingTest {

	@Test(priority=1)
	public void test1()
	{
		System.out.println("This is first test Case");
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("This is second test Case");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("This is third test Case");
	}
}
