package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ak {
	
	@Test
	
	public void test1()
	{
		Reporter.log("1", true);
		
	}
	public void test2()
	{
		Reporter.log("2", false);
		
	}

}
