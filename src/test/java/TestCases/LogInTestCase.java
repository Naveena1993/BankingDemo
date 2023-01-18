package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;
import Pages.AddCustomer;
import Pages.EditCustomer;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Helpermethods;

public class LogInTestCase extends Base
{
	LoginPage page;
	HomePage page1;
	AddCustomer customer;
	EditCustomer editing;
	Helpermethods HM= new Helpermethods();
	
	@Test
	public void logInPage() throws InterruptedException
	{
		page= new LoginPage(driver);
//		Thread.sleep(5000);
		page.enterUserName("mngr471431");
		page.password("varaqyq");
		page.logIn();
		page1=new HomePage(driver);
		String title= page1.gettitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
//		test.log(null, "hello ");
	}	
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		page= new LoginPage(driver);
		page.enterUserName("mngr471431");
		page.password("varaqyq");
		page.logIn();
		page1=new HomePage(driver);
		page1.clickNewCustomer("New Customer");
		customer=new AddCustomer(driver);
		customer.customerName("Hello");
		customer.dateOfBirth("24-02-2000");
		customer.address("colony");
		customer.city("Andhra");
		customer.state("Ap");
		customer.pin("522124");
		customer.phone("123456789");
		customer.email(HM.generateRandomString(6)+"@mailinator.com");
		customer.password("asdf");
		customer.submit();
		String actualtext= customer.registration();
		Assert.assertEquals(actualtext, "Customer Registered Successfully!!!");
//		test.log(null, "testing");
	}
	
	@Test
	public void editCustomer() throws InterruptedException
	{
	page=new LoginPage(driver);
	page.enterUserName("mngr471431");
	page.password("varaqyq");
	page.logIn();
	page1=new HomePage(driver);
	page1.clickNewCustomer("Edit Customer");
	editing= new EditCustomer(driver);
	editing.customerID("59906");
	editing.submit();
	}
}
