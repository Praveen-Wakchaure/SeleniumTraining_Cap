package com.cg.switchTo;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		
		AlertSwitch as=new AlertSwitch();
		as.loadUrl();
		as.getTitle();
		as.handleAlert();
				
	}

}
