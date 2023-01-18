package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

import Base.Base;

public class HomePage extends Base
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String gettitle()
	{
		return driver.getTitle();
	}
	
//	By newCustomer=By.xpath("//a[text()=''\"+newUser+\"']");
	public void clickNewCustomer(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']")).click();
	}
	
}
