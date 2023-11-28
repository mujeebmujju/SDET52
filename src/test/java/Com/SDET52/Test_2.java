package Com.SDET52;

import org.testng.annotations.Test;



	public class Test_2 
	{
		@Test(groups="smoke")
		public void ts1Test()
		{
			System.out.println("--ts3--");
		}

		@Test(groups="regression")
		public void ts2Test()
		{
			System.out.println("--ts4--");
		}
	}



