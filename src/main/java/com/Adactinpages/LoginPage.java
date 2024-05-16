package com.Adactinpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage  {

	public static WebDriver driver;
	@FindBy(id = "username")
	public static WebElement username;

	@FindBy(id = "password")
	public static WebElement password;

	@FindBy(id = "login")
	public static WebElement Login;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogin() {
		return Login;
	}

}
