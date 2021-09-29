package testNG_Annotations;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTest {

	@Test
	public void Test1()
	{
		System.out.println("This is first TestCase");
		
		// Expected Result with my Actual Result
		Assert.assertEquals("sunil", "sunil");
		
	}
	@Test(dependsOnMethods={"Test1"},alwaysRun=true)
	public void Test2()
	{
		
		System.out.println("This is second TestCase");
	}
	@Test(dependsOnMethods={"Test2"})
	public void Test3()
	{
		System.out.println("This is third TestCase");
	}
}
//,alwaysRun=true