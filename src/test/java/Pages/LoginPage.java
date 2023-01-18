package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class LoginPage extends Base
{
	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver dr)
	{
		driver=dr;
	}

	By userName= By.xpath("//input[@name='uid']");
	By password= By.xpath("//input[@name='password']");
	By logIn= By.xpath("//input[@name='btnLogin']");
	
	
	public void enterUserName(String name) throws InterruptedException
	{
//		 wait= new WebDriverWait(driver, 10);
		Thread.sleep(10000);
		 
		driver.findElement(userName).sendKeys(name);
	}

	public void password(String name)
	{
		driver.findElement(password).sendKeys(name);
	}

	public void logIn()
	{
		driver.findElement(logIn).click();
	}

	
}
