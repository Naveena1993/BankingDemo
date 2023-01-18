package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ExtentReports.ExtentReporterNG;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends ExtentReporterNG
{
	public static WebDriver driver;
	
	Properties prop=new Properties();
	
	@BeforeTest
	public void setUp() throws IOException
	{
		FileReader reader=new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\Config.properties");
		prop.load(reader);
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
