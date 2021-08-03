package com.cg.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cg.base.TestBase;

public class TestUtil extends TestBase{
	
	public static void takeScreenShot()
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File file=ss.getScreenshotAs(OutputType.FILE);
		Date date=new Date();
		try {
			FileUtils.copyFile(file, new File("target/ss/ss"+date.getMinutes()+date.getSeconds()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
