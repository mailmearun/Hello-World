package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.GoogleSearch;
import Login.GoogleSearchPageFactory;

public class TestCaseClass 
{
	WebDriver driver;
	
	@BeforeTest
	public void SetupApplicationLogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void Cleanup()
	{
		driver.close();
	}
	@Test (enabled = false)
	public void TestCase1()
	{
		System.out.println("Sample Test Case POM");
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleSearch gs = new GoogleSearch(driver);
		gs.enterSearchData("Selenium");
		gs.clickGoogleSearch();
		String SearchResult = driver.findElement(By.xpath("//*[@id='resultStats']")).getText();
		System.out.println(SearchResult);
		driver.get("https://www.google.co.in/");
		gs.searchGoogleForData("Webdriver");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Sample Test Case Page Factory");
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleSearchPageFactory gspf = new GoogleSearchPageFactory(driver);
		gspf.enterSearchData("Selenium");
		gspf.clickGoogleSearch();
		String SearchResult = driver.findElement(By.xpath("//*[@id='resultStats']")).getText();
		System.out.println(SearchResult);
		driver.get("https://www.google.co.in/");
		gspf.searchGoogleForData("Webdriver");
	}
}
