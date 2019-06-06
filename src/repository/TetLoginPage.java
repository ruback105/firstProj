package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TetLoginPage {

	WebDriver driver;

	public TetLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("login_username");
	By password = By.id("login_password");
	By submit = By.id("login_submit");
	
	public WebElement NameID() {
		return driver.findElement(username);
	}

	public WebElement PasswordID() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}


}
