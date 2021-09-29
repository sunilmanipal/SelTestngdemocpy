package testNG_Annotations;

//this program is used to demonstarte depends on method

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupExercise2 {
	
	@Test
	public void Test1()
	{
		System.out.println("Execute Test Case 1");
		Assert.assertEquals("man", "expected");
	}
	@Test (dependsOnMethods={"Test1"})
	public void Test2()
	{
		System.out.println("Execute Test Case 2");
	}
	@Test
	public void Test3()
	{
		System.out.println("Execute Test Case 3");
	}
}
