package com.cg.project.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtils {
	private static Properties properties;
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(".\\Resources\\Config.properties")));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Object [] [ ] getLoginMockData(){
		Object obj[][]=null;	

		try(Workbook book=WorkbookFactory.create(new File(properties.getProperty("mockDataFilePath")))){	
			Sheet sheet=book.getSheet(properties.getProperty("loginMockData"));
			obj = new Object[(sheet.getLastRowNum()+1)] [sheet.getRow(0).getLastCellNum()];
			
			for(int i=0;i<=sheet.getLastRowNum();i++)
				for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
					obj[i][j]=sheet.getRow(i).getCell(j).toString();
			
			return obj;
		}catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public static Object [] [ ] getRegistartionMockData(){
		Object obj[][]=null;
		return obj;
	}
}
	