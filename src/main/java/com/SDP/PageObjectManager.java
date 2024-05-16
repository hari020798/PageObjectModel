package com.SDP;

import org.openqa.selenium.WebDriver;

import com.Adactinpages.BookAHotel;
import com.Adactinpages.BookedItinerary;
import com.Adactinpages.BookingConfirmation;
import com.Adactinpages.LoginPage;
import com.Adactinpages.SearchHotel;
import com.Adactinpages.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private LoginPage getInstanceLp() {
LoginPage lp = new LoginPage(driver);
return lp;
	}
	
	private SearchHotel getInstanceSH() {
SearchHotel sh = new SearchHotel(driver);
return sh;
	}
	
	private SelectHotel getInstanceSHO() {
SelectHotel sho = new SelectHotel(driver);
return sho;
	}
	
	private BookAHotel getInstanceBH() {
BookAHotel bh = new BookAHotel(driver);
return bh;
	}
	
	private BookingConfirmation getInstanceBC() {
BookingConfirmation bc = new BookingConfirmation(driver);
return bc;
	}
	
	private BookedItinerary getInstanceBI() {
BookedItinerary bi = new BookedItinerary(driver);
return bi;
	}
	
	
}
