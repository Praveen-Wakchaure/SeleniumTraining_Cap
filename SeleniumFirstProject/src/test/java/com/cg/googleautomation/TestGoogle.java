package com.cg.googleautomation;

public class TestGoogle {

	public static void main(String[] args) throws InterruptedException {
		GoogleAutomation ga=new GoogleAutomation();
		ga.loadUrl();
		ga.clickImages();
		ga.getTitle();
		ga.moveBack();
		ga.moveForward();
		ga.checkImage();
		

	}

}
