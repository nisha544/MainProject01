package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class ListenerClass implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		 IRetryAnalyzer r = annotation.getRetryAnalyzer();
		 
		 if (r==null) 
		 {
			annotation.setRetryAnalyzer(FailedRerun.class);
		 } 
	}
}
