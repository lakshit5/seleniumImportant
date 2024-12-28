package TestNG;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(invocationCount = 3)
	public void createContact()
	{
	
		System.out.println("Contact created");
	}
	
	@Test(enabled = false)
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("Contact deleted");
	}
	
}
