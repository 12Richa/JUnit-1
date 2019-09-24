package com.nt.beans.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class TestRunner {
public static void main(String[] args) {
	Result result = JUnitCore.runClasses(CalcTest1.class);
System.out.println(result.getFailureCount());
System.out.println(result.getFailures());
System.out.println(result.getRunCount());
System.out.println(result.getRunTime());

}
}
