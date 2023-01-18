package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class AddCustomer extends Base
{
	WebDriver driver;
	public AddCustomer(WebDriver driver)
	{
		this.driver=driver;
	}

	By customerName= By.xpath("//input[@name='name']");
	By dateOfBirth= By.xpath("//input[@name='dob']");
	By address= By.xpath("//textarea[@name='addr']");
	By city=By.xpath("//input[@name='city']");
	By state=By.xpath("//input[@name='state']");
	By pin=By.xpath("//input[@name='pinno']");
	By phoneNumber=By.xpath("//input[@name='telephoneno']");
	By email=By.xpath("//input[@name='emailid']");
	By password=By.xpath("//input[@name='password']");
	By submit=By.xpath("//input[@value='Submit']");
	By reset=By.xpath("//input[value='Reset']");
	
	public void customerName(String name)
	{
		driver.findElement(customerName).sendKeys(name);				
	}
	public void dateOfBirth(String name)
	{
		driver.findElement(dateOfBirth).sendKeys(name);				
	}
	
	public void address(String name)
	{
		driver.findElement(address).sendKeys(name);				
	}
	
	public void city(String name)
	{
		driver.findElement(city).sendKeys(name);				
	}
	public void state(String name)
	{
		driver.findElement(state).sendKeys(name);				
	}
	
	public void pin(String name)
	{
		driver.findElement(pin).sendKeys(name);				
	}
	public void phone(String name)
	{
		driver.findElement(phoneNumber).sendKeys(name);				
	}
	public void email(String name)
	{
		driver.findElement(email).sendKeys(name);				
	}
	public void password(String name)
	{
		driver.findElement(password).sendKeys(name);				
	}
	public void submit()
	{
		driver.findElement(submit).click();
	}
	public void reset()
	{
		driver.findElement(reset).click();
	}
	
	public String registration()
	{
		return driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
	}
}
