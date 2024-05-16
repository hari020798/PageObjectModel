package com.TestLogin;

import org.testng.annotations.Test;

import com.Adactinpages.AdactinBasee;
import com.Adactinpages.LoginPage;

public class LoginTest extends AdactinBasee {
	
	@Test
	private void loginTest() {
	LoginPage lp = new LoginPage();
	lp.getUsername("Hari0207");
	lp.getPassword("Hari@123");
	lp.getLogin();
	
	//void LoginPage().getUsername("Hari0207").getPassword("Hari@123").getLogin();""""""'
		
	}
}

