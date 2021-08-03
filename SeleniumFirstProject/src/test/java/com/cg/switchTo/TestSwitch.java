package com.cg.switchTo;

public class TestSwitch {

	public static void main(String[] args) throws InterruptedException {
		/*WindowDemo wd=new WindowDemo();
		wd.loadUrl();
		wd.getTitle();
		wd.newTab("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]");
		wd.newTab("//a[contains(text(),'Women')]");
		wd.newTab("//header/div[2]/nav[1]/div[1]/div[3]/div[1]/a[1]");
		wd.newTab("//header/div[2]/nav[1]/div[1]/div[4]/div[1]/a[1]");
		wd.newTab("//header/div[2]/nav[1]/div[1]/div[5]/div[1]/a[1]");
		wd.switchTab();
		wd.tearDown();*/
		
		/*FrameSwitch fs=new FrameSwitch();
		fs.loadUrl();
		fs.getTitle();
		fs.switchFrame();
		fs.getTitle();*/
		
		AlertSwitch as=new AlertSwitch();
		as.loadUrl();
		as.getTitle();
		as.handleAlert();
		

	}

}
