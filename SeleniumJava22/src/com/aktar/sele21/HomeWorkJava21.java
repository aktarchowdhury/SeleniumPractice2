package com.aktar.sele21;

import com.thoughtworks.selenium.DefaultSelenium;

public class HomeWorkJava21 {
	public static void main(String[] args) {
			DefaultSelenium key=new DefaultSelenium("localhost",4444,"firefox","https://www.facebook.com/");
			key.open("https://www.facebook.com/");
			key.setSpeed("3000");
			key.windowMaximize();
			key.type("email", "aktarchowdhury7@gmail.com");
			key.type("pass", "aa7867775");
			key.click("log in");
			key.stop();
			key.close();
		}
		}


	


