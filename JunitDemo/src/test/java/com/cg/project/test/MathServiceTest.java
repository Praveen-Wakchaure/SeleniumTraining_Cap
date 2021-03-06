package com.cg.project.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.project.exceptions.InValidNumberRangeException;
import com.cg.project.services.MathService;
import com.cg.project.services.MathServiceImpl;
public class MathServiceTest {

	private static MathService service ;

	//@Before annotation base method will be executed by Junit framework before every test cases	
	
	@Before
	public void setUpTestMockDataEnv(){
	}

	//..............................................add........................................................//
	
	             //First Number Invalid
	
	@Test(expected = InValidNumberRangeException.class)
	public void testAddForFirstNumberInvalid() throws InValidNumberRangeException {
		int  firstInvalidNo = -102;
		int secondNo =373; 
		service.add(firstInvalidNo, secondNo);
	}
	
	            //Second Number Invalid
	
	@Test(expected = InValidNumberRangeException.class)
	public void testAddForSecondNumberInvalid() throws InValidNumberRangeException {
		int  firstNo = 102;
		int secondNoInvalid = -373; 
		service.add(firstNo, secondNoInvalid);
	}
	
	            //Both numbers valid
	
	@Test
	public void testAddForBothNumberValid() throws InValidNumberRangeException {
		int  firstNo = 100;
		int secondNo =200; 
		int expectedAns=300;
		int actualAns=service.add(firstNo, secondNo);
		Assert.assertEquals(expectedAns, actualAns);	
	}
	
	
	//.........................................sub.......................................................//
	
	           //First Number Invalid
	@Test(expected = InValidNumberRangeException.class)
	public void testSubForFirstNumberInvalid() throws InValidNumberRangeException
	{
		int  firstInvalidNo = -102;
		int secondNo =373; 
		service.sub(firstInvalidNo, secondNo);	
	}
	
               //Second Number Invalid
	
	@Test(expected = InValidNumberRangeException.class)

	public void testSubForSecondNumberInvalid() throws InValidNumberRangeException {
			int  firstNo = 102;
			int secondNoInvalid = -373; 
			service.sub(firstNo, secondNoInvalid);
		}
	          //Both numbers valid
	
	@Test
	public void testSubForBothNumberValid() throws InValidNumberRangeException {
		int  firstNo = 100;
		int secondNo =200; 
		int expectedAns=300;
		int actualAns=service.sub(firstNo, secondNo);
		Assert.assertEquals(expectedAns, actualAns);	
	}
	
	//.........................................multi.......................................................//
	
    	//First Number Invalid
	
	@Test(expected = InValidNumberRangeException.class)
	public void testMultiForFirstNumberInvalid() throws InValidNumberRangeException
	{
		int  firstInvalidNo = -102;
		int secondNo =373; 
		service.multi(firstInvalidNo, secondNo);	
	}

    //Second Number Invalid

	@Test(expected = InValidNumberRangeException.class)

	public void testMultiForSecondNumberInvalid() throws InValidNumberRangeException {
		int  firstNo = 102;
		int secondNoInvalid = -373; 
		service.multi(firstNo, secondNoInvalid);
}
   //Both numbers valid

	@Test
	public void testMultiForBothNumberValid() throws InValidNumberRangeException {
		int  firstNo = 100;
		int secondNo =200; 
		int expectedAns=300;
		int actualAns=service.multi(firstNo, secondNo);
		Assert.assertEquals(expectedAns, actualAns);	
	}

	//.........................................div.......................................................//
	
	//First Number Invalid

	@Test(expected = InValidNumberRangeException.class)
	public void testDivForFirstNumberInvalid() throws InValidNumberRangeException
	{
		int  firstInvalidNo = -102;
		int secondNo =373; 
		service.div(firstInvalidNo, secondNo);	
	}

	//Second Number Invalid

	@Test(expected = InValidNumberRangeException.class)

	public void testDivForSecondNumberInvalid() throws InValidNumberRangeException {
		int  firstNo = 102;
		int secondNoInvalid = -373; 
		service.div(firstNo, secondNoInvalid);
	}
	
	//Both numbers valid

	@Test
	public void testDivForBothNumberValid() throws InValidNumberRangeException {
		int  firstNo = 100;
		int secondNo =200; 
		int expectedAns=300;
		int actualAns=service.div(firstNo, secondNo);
		Assert.assertEquals(expectedAns, actualAns);	
}

	
	
	
	//@After annotation base method will be executed by Junit framework after  every test cases		
	
	@After
	public void tearDownMockDataEnv(){
		
	}
	
	//@AfterClass annotation base method will be executed by Junit framework "only once after all test cases"
	//method must be declare static 
	
	@AfterClass
	public static void tearDownTestEnv(){
		service= null;
	}
	
	//@BeforeClass annotation base method will be executed by Junit framework "only once before all test cases"
	//method must be declare static 
	
	@BeforeClass	
	public static void setUpTestEnv(){
		service = new MathServiceImpl();
	}
}
