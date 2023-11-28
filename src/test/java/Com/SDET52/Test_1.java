package Com.SDET52;

import org.testng.annotations.Test;



public class Test_1 
{
	@Test(groups="smoke")
	public void ts1Test()
	{
		System.out.println("--ts1--");
	}

	@Test(groups="regression")
	public void ts2Test()
	{
		System.out.println("--ts2--");
	}
}
