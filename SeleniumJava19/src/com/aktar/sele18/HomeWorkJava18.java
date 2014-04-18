package com.aktar.sele18;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeWorkJava18 {
	@BeforeClass
	public static void OpenBrowser() {
		System.out.println("opens firefox Browser");
		System.out.println("Yahoo page opens");
	}

	@Before
	public void ClickOnMail() {
		System.out.println("Yahoo mail page opens");
	}

	@Test
	public void Test1() {
		System.out.println("type in username");
		System.out.println("type in password");
		System.out.println("click on sign in to open email page");
	}

	@Test
	public void Test2() {
		System.out.println("type in username");
		System.out.println("type in password");
		System.out.println("email page opens");
	}

	@After
	public void LogOut() {
		System.out.println("sign off to log out");
	}

	@AfterClass
	public static void CloseBrowser() {
		System.out.println("Browser closes");
	}
}
