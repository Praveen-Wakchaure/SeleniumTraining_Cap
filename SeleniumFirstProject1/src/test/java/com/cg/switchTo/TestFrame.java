package com.cg.switchTo;

public class TestFrame {

	public static void main(String[] args) throws InterruptedException {
		
		FrameSwitch fs= new FrameSwitch();
		fs.loadUrl();
		fs.getTitle();
		fs.switchFrame();
		fs.getTitle();
		
	}

}
