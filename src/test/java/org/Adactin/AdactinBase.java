package org.Adactin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class AdactinBase extends BaseClass {
	public static WebDriver driver;
	public static WebElement username;
	public static WebElement password;
	public static WebElement login;

	@BeforeSuite
	private void Setproperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Driver\\chromedriver.exe");

	}

	@BeforeTest
	private void browserLaunch() {
		browserlaunch("chrome");
	}

	@BeforeClass
	private void Login() {
		driver = getUrl("https://adactinhotelapp.com/");
	}

	/*
	 * @Test (priority = 1) private void Login2() {
	 * 
	 */

	@Test()
	private void SearchHotel1() throws InterruptedException {
		PageFactory.initElements(driver, AdactinBase.class);
		username.sendKeys("hari0207");
		password.sendKeys("Hari@123");
		login.click();
		/*WebElement name = driver.findElement(By.xpath("//input[@id ='username']"));
		name.sendKeys("hari0207");*/
		// sendKeyElement(name, "hari0207");
		/*WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));
		sendKeyElement(password, "Hari@123");
		WebElement click = driver.findElement(By.xpath("//input[@class ='login_button']"));
		clickOnElement(click);*/

		WebElement location = driver.findElement(By.xpath("//select[@name ='location']"));

		dropDown("index", location, "2");

		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropDown("value", Hotel, "Hotel Creek");

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		dropDown("value", room, "Double");

		WebElement roomss = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropDown("text", roomss, "4 - Four");

		WebElement acount = driver.findElement(By.xpath("//select[@name='adult_room']"));
		dropDown("index", acount, "3");

		WebElement ccount = driver.findElement(By.xpath("//select[@name='child_room']"));
		dropDown("index", ccount, "4");
	}

}
