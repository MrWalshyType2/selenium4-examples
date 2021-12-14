package com.qa.examples.seleniumfour.pom03.pages.nofactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcmeHomePageNoPageFactory {

	private WebDriver driver;
	
	private By usernameBy = By.className("logged-user-name");

	public AcmeHomePageNoPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoggedInUsername() {
		return driver.findElement(usernameBy).getText();
	}
}
