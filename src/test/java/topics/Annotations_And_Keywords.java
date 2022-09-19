package topics;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_And_Keywords 
{
	@BeforeClass     
	public void beforeclass()
	{
		System.out.println("beforeclass");
		
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
		
	}
	
	
	
	
	@Test (dependsOnMethods= {"testC","testB"},priority=5,enabled = false)
	public void testA() // LogOut
	{
		System.out.println("testA");
		
		
	}
	
	
	@Test  (dependsOnMethods= {"testC"},priority=0,invocationCount=2)
	public void testB()  // HomePage
	{
		
		System.out.println("testB");
		Assert.fail();
	
	}
	
	
	@Test (priority=2)
	public void testC()      // LoginPage
	{
		System.out.println("testC");
	}
	
 //System.out.println("====================================================================================");
	
/*
           keywords in TestNG
       1.Priority= give prioruty to method
       2.invocationCount= use to execute test for multiple times
       3.dependsOnMethod-= it is use when we want to depend on another method mean if another method get pass that time this is executed 
       4.[enabled = false]= use to disabled test case instead of erase
       5.[timeOut=2000] = when page take too much time for loading that time we use, to fail the test case.

 
        Before= prerequisit condition
        After= post condition
	
*/	

}
