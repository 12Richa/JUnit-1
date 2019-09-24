package com.nt.beans.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.beans.WelcomeMsg;

public class WelcomeMsgTest {
	
@Test
	public  void test_getWelcomeMsg() {
	WelcomeMsg wmsg=new WelcomeMsg();
	
	String expectedmsg="Welcome to JUnit";
	String actualmsg=wmsg.getWelcomeMsg();
     assertEquals(expectedmsg, actualmsg);
}




@Test
public void test_getWorld() {
	WelcomeMsg msg= new WelcomeMsg();
	String expectedmsg="Welocme to Hello World";
	String actualmsg=msg.getWorld();
	assertEquals(expectedmsg, actualmsg);
}
}