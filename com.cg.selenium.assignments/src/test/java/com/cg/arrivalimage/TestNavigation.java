package com.cg.arrivalimage;

import com.cg.homepage.HomePageArrival;

public abstract class TestNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		ArrivalImageNavigation ain=new ArrivalImageNavigation();
	     ain.loadUrl();
	     ain.clickShop();
	     ain.clickHome();
	     ain.clickImage();
	     ain.AddtoBasket();
	     ain.Discription();
	     ain.Review();

	}

}
