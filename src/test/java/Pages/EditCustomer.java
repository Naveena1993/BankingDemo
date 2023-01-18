package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class EditCustomer extends Base
{

	WebDriver driver;
	public EditCustomer(WebDriver driver)
	{
		this.driver=driver;
	}
	By customerID=By.xpath("//input[@name='cusid']");
	By submit=By.xpath("//input[@name='AccSubmit']");
	By reset=By.xpath("//input[@name='res']");
	
	public void customerID(String ID)
	{
		driver.findElement(customerID).sendKeys(ID);
	}
	public void submit()
	{
		driver.findElement(submit).click();
	}
	public void reset()
	{
		driver.findElement(reset).click();
	}
}
