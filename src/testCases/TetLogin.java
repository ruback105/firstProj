package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import repository.TetLoginPage;


public class TetLogin {
	
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apusko.la\\Desktop\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://connect.lattelecom.lv/authorize?response_type=code&redirect_uri=https%3A%2F%2Fmans.lattelecom.lv%2Fmytet%2Fconnect&client_id=mltc&state=L215dGV0Lw%3D%3D&scope=openid&lang=lv");
		driver.manage().window().maximize();
		TetLoginPage obj = new TetLoginPage(driver);
		obj.NameID().sendKeys("123");
		obj.PasswordID().sendKeys("456");
		obj.submit().click();
	}

}
