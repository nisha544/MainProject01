package org.testng;

public class FailedRerun implements IRetryAnalyzer
{

	public boolean retry(ITestResult result) 
	{
		int min=0, max=5;
		if (min<max) 
		{
		   min++;
		   return true;
		}
		return false;
	}
}
