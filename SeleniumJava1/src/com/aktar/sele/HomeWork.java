package com.aktar.sele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeWork {
@BeforeClass
public static void BrowserOpen(){
	System.out.println("browser opens");
}  
@Before
public void StartWork(){
	System.out.println("Test start");
}
@Test
public void SignIn(){
	System.out.println("Signed in");
}
	
@After
public void TestDone(){
	System.out.println("Test Done");
}
@AfterClass
public static void CloseBrowser(){
	System.out.println("Browser Closes");
}
	}


